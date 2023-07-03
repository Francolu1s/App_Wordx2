package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Idtxt_1, Idtxt_2;
    Button Idbutton1, Idbutton2, Idbutton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Idtxt_1 = (TextView) findViewById(R.id.Idtxt_1);
        Idtxt_2 = (TextView) findViewById(R.id.Idtxt_2);
        Idbutton1 = (Button) findViewById(R.id.Idbutton1);
        Idbutton2 = (Button) findViewById(R.id.Idbutton2);
        Idbutton3 = (Button) findViewById(R.id.Idbutton3);

        Idtxt_1.setText("");
        Idtxt_2.setText("");

        Idbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Se ha presionado el botón 1", Toast.LENGTH_SHORT).show();
                //Idtxt_1.setText("HOLA MUNDO");
                Idtxt_1.setText(R.string.Texto1);
            }
        });

        Idbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Se ha presionado el botón 2", Toast.LENGTH_SHORT).show();
                Idtxt_2.setText(R.string.Texto2);
            }
        });

        Idbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Se ha presionado el botón 3", Toast.LENGTH_SHORT).show();
                Idtxt_1.setText("");
                Idtxt_2.setText("");
            }
        });
    }
}
