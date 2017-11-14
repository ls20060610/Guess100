package com.example.user.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Random a = new Random();
    float i = a.nextInt(100)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       findviews();
    }
    private void findviews(){
        TextView edsecert = (TextView) findViewById(R.id.secert);
        TextView edinput = (TextView) findViewById(R.id.info);
        EditText ednumber = (EditText) findViewById(R.id.number);
        Button edsend = (Button) findViewById(R.id.send);

      float b =Float.parseFloat(edsecert.getText().toString());
        b = i;

        float num = Float.parseFloat(ednumber.getText().toString());
        if (num > b){
           new AlertDialog.Builder(this)
                   .setMessage("0" + "~" +num)
                   .show();
        }else if(num < b){
            new AlertDialog.Builder(this)
            .setMessage(num + "~" + "100")
             .show();
        }



    }

}
