package com.example.norman.android_hw3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private EditText etname;
    private Button buttonname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        etname= (EditText) findViewById(R.id.etName);
        buttonname = (Button)findViewById(R.id.back);

        buttonname.setOnClickListener(getMain);


    }


    private View.OnClickListener getMain = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String input =  etname.getText().toString();
            Toast.makeText(Activity2.this, "Hello   " + input , Toast.LENGTH_LONG).show();

            Intent intent = new Intent();
            intent.setClass(Activity2.this,MainActivity.class);
            startActivity(intent);
        }
    };


}
