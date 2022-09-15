package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTranslate = findViewById(R.id.btn_translate);

        Spinner spLanguages = findViewById(R.id.sp_languages);

        TextView tvOutput = findViewById(R.id.tv_output);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(spLanguages.getSelectedItem().toString().equals("English"))
                {
                    System.out.println("Fix");
                    tvOutput.setText("Welcome");
                }
                else if(spLanguages.getSelectedItem().toString().equals("Spanish"))
                {
                    tvOutput.setText("Bienvenido");
                }
                else if(spLanguages.getSelectedItem().toString().equals("French"))
                {
                    tvOutput.setText("Bienvenue");
                }
                else if(spLanguages.getSelectedItem().toString().equals("German"))
                {
                    tvOutput.setText("Willkommen");
                }
                else
                {
                    tvOutput.setText("Benvenuto");
                }


            }
        });
    }








}