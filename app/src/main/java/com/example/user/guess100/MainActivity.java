package com.example.user.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
    }

}
