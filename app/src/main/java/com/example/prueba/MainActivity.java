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

    public int onClickRegistrar() {
        //Intent intent = new Intent() ;
        //intent.setClass(this , MainActivity.class);
        //startActivity(intent);

        Toast.makeText(MainActivity.this,"Correo: "+((EditText)findViewById(R.id.edit_username)).getText().toString(),Toast.LENGTH_LONG).show();
        return findViewById(R.id.edit_password).toString().length();
    }

    public boolean isZero(String s) {

        return true;
    }
}
