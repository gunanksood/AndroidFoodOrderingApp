package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);
    }
    public void order1(View view)
    {
        Intent intent = new Intent(NumberActivity.this, order1.class);
        startActivity(intent);
    }
    public void order2(View view)
    {
        Intent intent = new Intent(NumberActivity.this, order2.class);
        startActivity(intent);
    }
    public void order3(View view)
    {
        Intent intent = new Intent(NumberActivity.this, order3.class);
        startActivity(intent);
    }

}
