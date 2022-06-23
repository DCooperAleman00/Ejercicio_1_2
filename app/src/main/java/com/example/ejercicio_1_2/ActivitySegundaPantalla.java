package com.example.ejercicio_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Instant;

public class ActivitySegundaPantalla extends AppCompatActivity {

    private TextView txtNombreAS, txtApellidoAS, txtEdadAS, txtCorreoAS;
    Button btnVolverAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        txtNombreAS = (TextView) findViewById(R.id.lblNombreAS);
        txtApellidoAS = (TextView) findViewById(R.id.lblApellidoAS);
        txtEdadAS = (TextView) findViewById(R.id.lblEdadAS);
        txtCorreoAS = (TextView) findViewById(R.id.lblCorreoAS);

        String dato = getIntent().getStringExtra("dato1");
        txtNombreAS.setText(dato);
        String dato1 = getIntent().getStringExtra("dato2");
        txtApellidoAS.setText(dato);
        String dato2 = getIntent().getStringExtra("dato3");
        txtEdadAS.setText(dato);
        String dato3 = getIntent().getStringExtra("dato4");
        txtCorreoAS.setText(dato);
    }

    public void Volver(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}