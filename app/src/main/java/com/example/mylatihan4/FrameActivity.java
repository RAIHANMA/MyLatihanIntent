package com.example.mylatihan4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FrameActivity extends AppCompatActivity implements View.OnClickListener {
    Button simpan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        simpan = (Button)findViewById(R.id.simpan);
        simpan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.simpan:
                Intent sim = new Intent(FrameActivity.this,IntentActivity.class);
                startActivity(sim);
                break;
        }
    }
}
