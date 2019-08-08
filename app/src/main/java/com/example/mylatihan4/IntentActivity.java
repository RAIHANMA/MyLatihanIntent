package com.example.mylatihan4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class IntentActivity extends AppCompatActivity implements View.OnClickListener {
    Button backed;
    protected void onCreate (Bundle saveIntanceState){
        Bundle savedInstanceState = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        backed = (Button)findViewById(R.id.backed);
        backed.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.backed:
                Intent back = new Intent(IntentActivity.this,MainActivity.class);
                startActivity(back);
                break;
        }
    }
}
