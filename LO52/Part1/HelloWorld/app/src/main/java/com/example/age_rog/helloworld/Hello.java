package com.example.age_rog.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        //On récupère l'Intent qui à permi le démmarage de l'activité
        Intent intentHome = getIntent();
        String message = intentHome.getStringExtra(Home.EXTRA_MESSAGE);

        //On affiche le nom de l'utilisateur
        TextView text = findViewById(R.id.textV);
        text.setText("Welcome Dear "+ message);
    }
}
