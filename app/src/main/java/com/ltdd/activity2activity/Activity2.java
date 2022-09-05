package com.ltdd.activity2activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    private EditText edtEmail;
    private Button btnUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        getSupportActionBar().setTitle("Activity 2");
        edtEmail= findViewById(R.id.edit_Text_email);
        btnUpdate= findViewById(R.id.bnt_Update);
        edtEmail.setText(AppUltil.nEmail);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }
        });
    }

    private void backActivity() {
        String strEmailUpdate = edtEmail.getText().toString().trim();

        AppUltil.nEmail = strEmailUpdate;
        finish();
    }


}