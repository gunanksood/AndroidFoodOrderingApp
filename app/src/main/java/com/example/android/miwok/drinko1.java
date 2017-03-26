package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class drinko1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinko1);
    }
    int quantity = 0;

    public void increment(View view){
        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    public void decrement(View view){
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
    public void submitOrder(View view) {
        displayQuantity(quantity);
        displayPrice(quantity * 10);
        displayMessage("Thanks");
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Total: Rs "+number);
    }
    //This method displays a message on the screen
    private void displayMessage(String message){
        TextView messageTextView = (TextView) findViewById(R.id.message_text_view);
        messageTextView.setText(message);
    }
}
