package com.example.mylatihan4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RelativActivity extends AppCompatActivity implements View.OnClickListener {
    Button daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativ);
        daftar =(Button)findViewById(R.id.daftar);
        daftar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.daftar:
                Intent daf = new Intent(RelativActivity.this,InputActivity.class);
                startActivity(daf);
                break;
        }

    }
}
