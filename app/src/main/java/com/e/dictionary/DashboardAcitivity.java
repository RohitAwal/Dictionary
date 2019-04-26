package com.e.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardAcitivity extends AppCompatActivity {

    Button btnOpenCountrty,btnOpenCaptial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_acitivity);

        btnOpenCaptial = findViewById(R.id.btnOpenCaptial);
        btnOpenCountrty = findViewById(R.id.btnOpenCountry);

        btnOpenCountrty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardAcitivity.this,CaptitalActivity.class);
                startActivity(intent);

            }
        });
    }
}
