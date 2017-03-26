package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Drinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
    }
    public void drink1(View view)
    {
        Intent intent = new Intent(Drinks.this, drinko1.class);
        startActivity(intent);
    }
    public void drink2(View view)
    {
        Intent intent = new Intent(Drinks.this, drinko2.class);
        startActivity(intent);
    }
}
