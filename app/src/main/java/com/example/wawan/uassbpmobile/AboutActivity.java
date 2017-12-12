package com.example.wawan.uassbpmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        text = (TextView) findViewById(R.id.idText);
        String isi = new String("Dikerjakan oleh: \n"
                +"Edgar Priya D\t 311210013\n"
                +"Hartawan Sugihono \t 311410008\n"
                +"Shenata Hanadam \t 311410013\n");
        text.setText(isi);
    }
}
