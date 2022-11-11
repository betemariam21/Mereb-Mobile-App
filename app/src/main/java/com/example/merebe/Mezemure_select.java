package com.example.merebe;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.mebreb.mezemure.M1;
import com.example.mebreb.mezemure.M10;
import com.example.mebreb.mezemure.M11;
import com.example.mebreb.mezemure.M12;
import com.example.mebreb.mezemure.M13;
import com.example.mebreb.mezemure.M14;
import com.example.mebreb.mezemure.M15;
import com.example.mebreb.mezemure.M16;
import com.example.mebreb.mezemure.M17;
import com.example.mebreb.mezemure.M18;
import com.example.mebreb.mezemure.M19;
import com.example.mebreb.mezemure.M2;
import com.example.mebreb.mezemure.M20;
import com.example.mebreb.mezemure.M22;
import com.example.mebreb.mezemure.M23;
import com.example.mebreb.mezemure.M24;
import com.example.mebreb.mezemure.M25;
import com.example.mebreb.mezemure.M26;
import com.example.mebreb.mezemure.M27;
import com.example.mebreb.mezemure.M28;
import com.example.mebreb.mezemure.M29;
import com.example.mebreb.mezemure.M3;
import com.example.mebreb.mezemure.M30;
import com.example.mebreb.mezemure.M31;
import com.example.mebreb.mezemure.M32;
import com.example.mebreb.mezemure.M33;
import com.example.mebreb.mezemure.M34;
import com.example.mebreb.mezemure.M35;
import com.example.mebreb.mezemure.M36;
import com.example.mebreb.mezemure.M37;
import com.example.mebreb.mezemure.M38;
import com.example.mebreb.mezemure.M39;
import com.example.mebreb.mezemure.M4;
import com.example.mebreb.mezemure.M40;
import com.example.mebreb.mezemure.M41;
import com.example.mebreb.mezemure.M42;
import com.example.mebreb.mezemure.M43;
import com.example.mebreb.mezemure.M5;
import com.example.mebreb.mezemure.M6;
import com.example.mebreb.mezemure.M7;
import com.example.mebreb.mezemure.M8;
import com.example.mebreb.mezemure.M9;
import com.google.android.material.navigation.NavigationView;

public class Mezemure_select extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29
            ,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mezemure_select);
        //getSupportActionBar().setTitle("Merebe");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Toolbar toolbar = (Toolbar)findViewById(R.id.appbar);
        //setSupportActionBar(toolbar);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Merebe");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back22);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        b1 = findViewById(R.id.xeyake1);
        b2 = findViewById(R.id.xeyake2);
        b3 = findViewById(R.id.xeyake3);
        b4 = findViewById(R.id.xeyake4);
        b5 = findViewById(R.id.xeyake5);
        b6 = findViewById(R.id.xeyake6);
        b7 = findViewById(R.id.xeyake7);
        b8 = findViewById(R.id.xeyake8);
        b9 = findViewById(R.id.xeyake9);
        b10 = findViewById(R.id.xeyake10);
        b11 = findViewById(R.id.xeyake11);
        b12 = findViewById(R.id.xeyake12);
        b13 = findViewById(R.id.xeyake13);
        b14 = findViewById(R.id.xeyake14);
        b15= findViewById(R.id.xeyake15);
        b16 = findViewById(R.id.xeyake16);
        b17 = findViewById(R.id.xeyake17);
        b18 = findViewById(R.id.xeyake18);
        b19 = findViewById(R.id.xeyake19);
        b20 = findViewById(R.id.xeyake20);
        b21 = findViewById(R.id.xeyake21);
        b22 = findViewById(R.id.xeyake22);
        b23 = findViewById(R.id.xeyake23);
        b24 = findViewById(R.id.xeyake24);
        b25 = findViewById(R.id.xeyake25);
        b26 = findViewById(R.id.xeyake26);
        b27 = findViewById(R.id.xeyake27);
        b28 = findViewById(R.id.xeyake28);
        b29 = findViewById(R.id.xeyake29);
        b30 = findViewById(R.id.xeyake30);
        b31 = findViewById(R.id.xeyake31);
        b32 = findViewById(R.id.xeyake32);
        b33 = findViewById(R.id.xeyake33);
        b34 = findViewById(R.id.xeyake34);
        b35 = findViewById(R.id.xeyake35);
        b36 = findViewById(R.id.xeyake36);
        b37 = findViewById(R.id.xeyake37);
        b38 = findViewById(R.id.xeyake38);
        b39 = findViewById(R.id.xeyake39);
        b40 = findViewById(R.id.xeyake40);
        b41 = findViewById(R.id.xeyake41);
        b42 = findViewById(R.id.xeyake42);
        b43 = findViewById(R.id.xeyake43);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mezemure_select.this, M1.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M2.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M3.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M4.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M5.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M6.class);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M7.class);
                startActivity(intent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M8.class);
                startActivity(intent);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M9.class);
                startActivity(intent);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M10.class);
                startActivity(intent);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mezemure_select.this, M11.class);
                startActivity(intent);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M12.class);
                startActivity(intent);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M13.class);
                startActivity(intent);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M14.class);
                startActivity(intent);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M15.class);
                startActivity(intent);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M16.class);
                startActivity(intent);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M17.class);
                startActivity(intent);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M18.class);
                startActivity(intent);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M19.class);
                startActivity(intent);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M20.class);
                startActivity(intent);
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mezemure_select.this, M21.class);
                startActivity(intent);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M22.class);
                startActivity(intent);
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M23.class);
                startActivity(intent);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M24.class);
                startActivity(intent);
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M25.class);
                startActivity(intent);
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M26.class);
                startActivity(intent);
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M27.class);
                startActivity(intent);
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M28.class);
                startActivity(intent);
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M29.class);
                startActivity(intent);
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M30.class);
                startActivity(intent);
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mezemure_select.this, M31.class);
                startActivity(intent);
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M32.class);
                startActivity(intent);
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M33.class);
                startActivity(intent);
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M34.class);
                startActivity(intent);
            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M35.class);
                startActivity(intent);
            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M36.class);
                startActivity(intent);
            }
        });
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M37.class);
                startActivity(intent);
            }
        });
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M38.class);
                startActivity(intent);
            }
        });
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M39.class);
                startActivity(intent);
            }
        });
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M40.class);
                startActivity(intent);
            }
        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mezemure_select.this, M41.class);
                startActivity(intent);
            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M42.class);
                startActivity(intent);
            }
        });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mezemure_select.this, M43.class);
                startActivity(intent);
            }
        });

    }
}

