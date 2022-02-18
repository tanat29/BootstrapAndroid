package com.example.bootstrap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.TypefaceProvider;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TypefaceProvider.registerDefaultIconSets();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BootstrapButton btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Bootstrap", Toast.LENGTH_SHORT).show();
            }
        });

    }
}