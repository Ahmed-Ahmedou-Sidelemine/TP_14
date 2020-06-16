package com.example.tp_14;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    private TextView text;
    Float tall;        int agee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.text=(TextView)findViewById(R.id.textView);
        String name = this.getIntent().getExtras().getString("nom");
        String age = this.getIntent().getExtras().getString("age");
        String tal = this.getIntent().getExtras().getString("taille");
        try {
            //age=Integer.parseInt(ag);
            tall = Float.parseFloat(tal);

        }
        catch (Exception e){
            Log.e("MainActivity2","Error message car :"+e.getMessage());
        }
        if(tall==1.7){
            text.setText("Bonjour "+ name+" vous êtes âgé de "+age+ " et vous êtes de taille moyenne");
        }
        else if (tall>1.7){
            text.setText("Bonjour "+ name +" vous êtes âgé de "+age+ " et vous êtes de taille elance");

        }
        else{
            text.setText("Bonjour "+ name+" vous êtes âgé de "+age+ " et vous êtes de taille courte");
        }
        Log.e("MainActivity2","Traitement réussi, données reçues");
    }
}