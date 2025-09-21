package com.example.demofragmentos;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button btn;
    FragmentContainerView fragmentocontenedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);

        FragmentoDos fdos = new FragmentoDos();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft.add(R.id.aqui_va_fragmento, fdos);
                ft.commit();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ft.replace(R.id.aqui_va_fragmento,fdos);
                        ft.commit();
                    }
                }, 5000);

            }
        });

        }
    }
