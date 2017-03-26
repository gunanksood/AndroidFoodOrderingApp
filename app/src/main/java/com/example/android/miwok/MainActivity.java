/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {




    public void sendfood(View view)
    {
        Intent intent = new Intent(MainActivity.this, NumberActivity.class);
        startActivity(intent);
    }
    public void senddry(View view)
    {
        Intent intent = new Intent(MainActivity.this, Dry.class);
        startActivity(intent);
    }
    public void sendlunch(View view)
    {
        Intent intent = new Intent(MainActivity.this, Lunch.class);
        startActivity(intent);
    }
    public void senddrinks(View view)
    {
        Intent intent = new Intent(MainActivity.this, Drinks.class);
        startActivity(intent);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}

                // Start the new activity
                int id=view.getId();
                switch (id)
                {
                    case R.id.numbers:
                        Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);
                        startActivity(numbersIntent);
                        break;

                }

            }
        });


    }



}