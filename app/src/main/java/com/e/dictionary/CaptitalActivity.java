package com.e.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CaptitalActivity extends AppCompatActivity {

    TextView TVcapital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captital);
        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String meaning = bundle.getString("meaning");
            TVcapital = findViewById(R.id.TVcaptial);
            TVcapital.setText(meaning);
        }
        else
        {
            Toast.makeText(this,"No Meaning",Toast.LENGTH_SHORT).show();
        }
    }
}
