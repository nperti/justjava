package com.example.root.justjava; /**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.root.justjava.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity = 2;
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayPrice (createSummaryOrder(price));
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private int calculatePrice (){
        return quantity * 5;
    }

    private void displayPrice(String priceMessage) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(priceMessage);
    }

    private String createSummaryOrder (int price) {
        String priceMessage = "Name: Laura Escalante "
                + "\n Quantity: " + quantity
                + "\n Total: $" + price
                + "\n Thank you!";
        return priceMessage;
    }

    public void increment (View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement (View view) {
        quantity = quantity - 1;
        display(quantity);
    }
}