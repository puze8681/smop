package com.example.parktaejun.nosmoking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.parktaejun.nosmoking.Main.MainActivity;

public class RegisterActivity extends AppCompatActivity {

    Button male, femail, regist;
    boolean ifMale = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        View toolbar_view = LayoutInflater.from(this).inflate(R.layout.item_toolbar, null);
        getSupportActionBar().setCustomView(toolbar_view);
        toolbar.setTitle("Smop 회원가입");

        male = (Button)findViewById(R.id.male);
        femail = (Button)findViewById(R.id.femail);
        regist = (Button)findViewById(R.id.register);

        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
