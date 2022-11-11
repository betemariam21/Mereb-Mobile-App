package com.example.merebe;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mebreb.models.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Admin_Login extends AppCompatActivity {
    EditText e1, e2, e3, mFullName;
    Button register,login,Sign_up;
    TextView t1;
    FirebaseAuth fAuth;
    ProgressBar progressBar2;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_admin__login);
        e1 = (EditText) findViewById(R.id.useredit);
        e2 = (EditText) findViewById(R.id.Emailedit);
        e3 = (EditText) findViewById(R.id.Passedit);
        register = (Button) findViewById(R.id.in);
        login = (Button) findViewById(R.id.Log_in);
        Sign_up = (Button) findViewById(R.id.Sign_in);
        fAuth = FirebaseAuth.getInstance();
        reference = FirebaseDatabase.getInstance().getReference().child("Users");
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);

       /*   if(fAuth.getCurrentUser() != null){

           startActivity(new Intent(getApplicationContext(),Main6Activity.class));

            finish();

      }
*/
        /*
      register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),Admin_dash.class));
           }
       });


      */
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = e1.getText().toString().trim();
                final String email = e2.getText().toString().trim();
                final String password = e3.getText().toString().trim();


                if (TextUtils.isEmpty(name)) {

                    e1.setError("UserName is required if you want to proceed");
                    return;
                }

                if (TextUtils.isEmpty(email)) {

                    e2.setError("Email is required if you want to proceed");
                    return;
                }

                if(!(isValidEmail(email))){
                    e2.setError("please enter a valid Email");
                    return;


                }
                if (TextUtils.isEmpty(password)) {


                    e3.setError("password is required");

                    return;
                }
                //String ab;
                //ab = Double.parseDouble(password);
                // double a = 123456;
                String am = "Merebe101Admin";
                if(!(password.equals(am)))
                {

                    e3.setError("please enter the correct Admin Password the one you entered is not valid ");
                    return;
                }

                progressBar2.setVisibility(View.VISIBLE);

                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {


                            FirebaseUser firebaseUser = fAuth.getCurrentUser();
                            User u = new User();
                            u.setName(name);
                            u.setEmail(email);


                            reference.child(firebaseUser.getUid()).setValue(u).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if (task.isSuccessful()) {

                                        Toast.makeText(Admin_Login.this, "Admin Logged In Well", Toast.LENGTH_LONG).show();



                                        startActivity(new Intent(getApplicationContext(), Admin_dash.class));


                                    }

                                }
                            });


                            //Toast.makeText(Activity2.this, "USER REGISTER WORKED WELL", Toast.LENGTH_SHORT).show();

                        } else {

                            progressBar2.setVisibility(View.INVISIBLE);
                            Toast.makeText(Admin_Login.this, "Error!!!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }

        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), log_in.class));
            }
        });
        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sign_up.class));
            }
        });


    }
    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
}

