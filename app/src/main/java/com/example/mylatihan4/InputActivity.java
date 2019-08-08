package com.example.mylatihan4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity implements View.OnClickListener{
    Button batal;
    protected void onCreate (Bundle saveIntanceState){
        Bundle savedInstanceState = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        batal = (Button)findViewById(R.id.batal);
        batal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.batal:
                Intent btl = new Intent(InputActivity.this,SmartActivity.class);
                startActivity(btl);
                break;
        }

    }
}
