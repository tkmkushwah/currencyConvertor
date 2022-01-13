package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void convert(View view) {
        Log.i("info", "convert:Button pressed ");
        EditText editText= (EditText)findViewById(R.id.editTextTextPersonName);
        EditText editText2= (EditText)findViewById(R.id.editTextTextPersonName2);
        String amtInPounds=editText.getText().toString();
        double amtInPoundsdbl;
        amtInPoundsdbl=Double.parseDouble(amtInPounds);
//        String amtInDoller=amtInPounds * 1.3; // It will throw an error because string cant be multiplied with double
        // so convert string into double
        double amtInDollerdbl=amtInPoundsdbl*1.3;
        //now to print it in toast we have to convert it into the string
        String amtInDollerstring;
        amtInDollerstring = String.format("%.2f",amtInDollerdbl);
        editText2.setText("amount In dollers is"+amtInDollerstring);
        Toast.makeText(this,  amtInPounds+" pounds "+"is equal to "+amtInDollerstring +" dollers", Toast.LENGTH_LONG).show();


    }
}