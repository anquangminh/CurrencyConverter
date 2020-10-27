package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    EditText amount;
    EditText result;
    String text;

    double cad = 0.75881;
    double vnd = 0.0000431700;
    double thb = 0.03204;
    double pab = 1;
    double egp = 0.06374 ;
    double gbp = 1.3030;
    double lbp = 0.0006616;
    double etb = 0.02635;
    double bob = 0.14487;
    double ghs = 0.17183;
    double xof = 0.001804;
    double xaf = 0.001804;
    double eur = 1.1835;
    double rub = 0.01301;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Spinner
        Spinner spinner = findViewById(R.id.spinner_from);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.from, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        amount = findViewById(R.id.amount);
        result = (EditText) findViewById(R.id.result);
        text = spinner.getSelectedItem().toString();
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    if (text.equals("CAD")) {
                        Log.v("TAG", "Convert CAD");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "CAD = " + total);
                        double convert = total * cad * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("PAB")) {
                        Log.v("TAG", "Convert PAB");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "PAB = " + total);
                        double convert = total * pab * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("EGP")) {
                        Log.v("TAG", "Convert EGP");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "EGP = " + total);
                        double convert = total * egp * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("THB")) {
                        Log.v("TAG", "Convert THB");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "THB = " + total);
                        double convert = total * thb * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("GBP")) {
                        Log.v("TAG", "Convert GBP");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "GBP = " + total);
                        double convert = total * gbp * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("LBP")) {
                        Log.v("TAG", "Convert LBP");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "LBP = " + total);
                        double convert = total * lbp * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("ETB")) {
                        Log.v("TAG", "Convert ETB");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "ETB = " + total);
                        double convert = total * etb * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("BOB")) {
                        Log.v("TAG", "Convert BOB");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "BOB = " + total);
                        double convert = total * bob * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("GHS")) {
                        Log.v("TAG", "Convert GHS");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "GHS = " + total);
                        double convert = total * ghs * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("XOF")) {
                        Log.v("TAG", "Convert XOF");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "XOF = " + total);
                        double convert = total * xof * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("XAF")) {
                        Log.v("TAG", "Convert XAF");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "XAF = " + total);
                        double convert = total * xaf * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("EUR")) {
                        Log.v("TAG", "Convert EUR");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "EUR = " + total);
                        double convert = total * eur * vnd;
                        result.setText(String.format("%.2f", convert));
                    } else if (text.equals("RUB")) {
                        Log.v("TAG", "Convert RUB");
                        double total = Double.parseDouble(amount.getText().toString());
                        Log.v("TAG", "RUB = " + total);
                        double convert = total * rub * vnd;
                        result.setText(String.format("%.2f", convert));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        amount.addTextChangedListener(textWatcher);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        text = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}