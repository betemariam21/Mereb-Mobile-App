package com.example.merebe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mereb.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class log_in extends AppCompatActivity {

    Button b1, b2 ,b3;
    EditText e1, e2;
    FirebaseAuth fAuth;
    ProgressBar progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_log_in);

        e1 = findViewById(R.id.Emailedit);
        e2 = findViewById(R.id.Passedit);
        progressBar2 =findViewById(R.id.progressBar2);
        fAuth = FirebaseAuth.getInstance();
        b1 = findViewById(R.id.Sign_in);
        b2 = findViewById(R.id.in);
        b3 = findViewById(R.id.Admin);
    /*
        if(fAuth.getCurrentUser() != null) {

            startActivity(new Intent(getApplicationContext(), home.class));

            finish();
        }

     */
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), Sign_up.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Admin_Login.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = e1.getText().toString().trim();
                String password = e2.getText().toString().trim();
                if (TextUtils.isEmpty(email)) {

                    e1.setError("Email is required if you want to procced");
                    return;
                }
                if (TextUtils.isEmpty(password)) {


                    e2.setError("password is required");

                    return;
                }
              /*  if (password1.length() < 6) {

                    mPassword.setError("passwords are always more than 6 digits ");
                    return;

                }
               */
                progressBar2.setVisibility(View.VISIBLE);

                fAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(
                        new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(log_in.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();

                                    startActivity(new Intent(getApplicationContext(), home.class));


                                } else {
                                    progressBar2.setVisibility(View.INVISIBLE);
                                    Toast.makeText(log_in.this, "Error There is no Account By this Email!!!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;

    }
    @Override
    public void onBackPressed() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(log_in.this);
        builder.setMessage("Are You Sure You Want To Exit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        AlertDialog alertDialog = builder.create();

        alertDialog.show();


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.menuLogout) {

            startActivity(new Intent(log_in.this, Admin_Login.class));

        }

        return super.onOptionsItemSelected(item);

    }

}


