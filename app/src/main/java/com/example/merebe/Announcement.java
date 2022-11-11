package com.example.merebe;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mebreb.Adapters.MessageAdapter;
import com.example.mebreb.models.AllMethods;
import com.example.mebreb.models.Message;
import com.example.mebreb.models.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Announcement extends AppCompatActivity implements View.OnClickListener {   FirebaseAuth auth;
    FirebaseDatabase database;
    DatabaseReference messageb;
    MessageAdapter messageAdapter;
    User u;
    List<Message> messages;
    RecyclerView rvmessage;
    EditText etMessage;
    ImageButton imgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement);
        Toolbar toolbar = (Toolbar)findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        inti();
    }
    private void inti(){


        auth= FirebaseAuth.getInstance();
        database= FirebaseDatabase.getInstance();
        u = new User();
        rvmessage = (RecyclerView) findViewById(R.id.rvmessage);
        etMessage =(EditText) findViewById(R.id.etMessage);
        imgButton =(ImageButton) findViewById(R.id.btnsend);

        imgButton.setOnClickListener(this);
        messages = new ArrayList<>();


    }

    @Override
    public void onClick(View v) {
        if(!TextUtils.isEmpty(etMessage.getText().toString()))
        {
            Message message = new Message(etMessage.getText().toString(),u.getName());
            etMessage.setText("");
            messageb.push().setValue(message);
            rvmessage.scrollToPosition(messages.size() +1);


           /* rvmessage.scrollToPosition(1000);
            rvmessage.scrollTo(0,10000000);
            rvmessage.smoothScrollToPosition(100);
          */
        }

        else
        {

            Toast.makeText(getApplicationContext(),"you cannot send a blank message", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2,menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.menuLogout)
        {
            auth.signOut();
            finish();
            startActivity(new Intent(Announcement.this, log_in.class));

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final FirebaseUser currentuser = auth.getCurrentUser();
        if (currentuser != null) {
            u.setUid(currentuser.getUid());
        }

        u.setEmail(currentuser.getEmail());


        database.getReference("Users").child(currentuser.getUid()).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                u = dataSnapshot.getValue(User.class);
                u.setUid(currentuser.getUid());

                AllMethods.name = u.getName();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        messageb =database.getReference("messages");

        messageb.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Message message = dataSnapshot.getValue(Message.class);
                message.setKey(dataSnapshot.getKey());
                messages.add(message);
                displayMessages(messages);
                rvmessage.smoothScrollToPosition(rvmessage.getAdapter().getItemCount());

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Message message = dataSnapshot.getValue(Message.class);
                message.setKey(dataSnapshot.getKey());
                List<Message> newMessages = new ArrayList<>();
                for(Message m: messages){

                    if(m.getKey().equals(message.getKey()))
                    {

                        newMessages.add(message);
                    }
                    else
                    {

                        newMessages.add(m);

                    }

                }
                messages = newMessages;

                displayMessages(messages);

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
                Message message = dataSnapshot.getValue(Message.class);
                message.setKey(dataSnapshot.getKey());
                List<Message> newMessages = new ArrayList<Message>();
                for(Message m:messages)
                {
                    if(!m.getKey().equals(message.getKey()))
                    {
                        newMessages.add(m);
                    }

                }
                messages = newMessages;
                displayMessages(messages);

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        messages = new ArrayList<>();
    }

    private void displayMessages(List<Message> messages) {

        rvmessage.setLayoutManager(new LinearLayoutManager(Announcement.this));
        messageAdapter = new MessageAdapter(Announcement.this,messages,messageb);
        rvmessage.setAdapter(messageAdapter);

    }

}
