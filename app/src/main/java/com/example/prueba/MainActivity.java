package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRegistrar() {
        //Intent intent = new Intent() ;
        //intent.setClass(this , MainActivity.class);
        //startActivity(intent);
        String correo = ((EditText)findViewById(R.id.edit_username)).getText().toString();
        String clave =((EditText)findViewById(R.id.edit_username)).getText().toString();
        if(correo!=null && clave!=null){

            Toast.makeText(MainActivity.this,"Correo: "+correo,Toast.LENGTH_LONG).show();

        }

    }

    public boolean isZero(String s) {

        return true;
    }
}
