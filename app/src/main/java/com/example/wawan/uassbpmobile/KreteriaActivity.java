package com.example.wawan.uassbpmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Date;

public class KreteriaActivity extends AppCompatActivity {

    Spinner budget, date, dimension, weight, screen, max, pixel, photo, sensor;
    String [] price = {"CHEAP", "MEDIUM", "EXPENSIVE"};
    String [] tanggal = {"LATTER", "EARLIER"};
    String [] dimensi = {"SMALL", "MEDIUM", "WIDE"};
    String [] berat = {"LIGHT", "INTERMEDIATE", "HEAVY"};
    String [] layar = {"LESS", "MORE"};
    String [] maks = {"LOW", "MEDIUM", "HIGH"};
    String [] pixels = {"LOW", "MEDIUM", "HIGH"};
    String [] foto = {"LOW", "MEDIUM", "HIGH"};
    String [] sensors = {"SMALL", "MEDIUM", "WIDE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kreteria);
        budget = (Spinner) findViewById(R.id.idBudget);
        date = (Spinner) findViewById(R.id.idDateRelease);
        dimension = (Spinner) findViewById(R.id.idDimension);
        weight = (Spinner) findViewById(R.id.idWeight);
        screen = (Spinner) findViewById(R.id.idScreenDots);
        max = (Spinner) findViewById(R.id.idMaxResolution);
        pixel = (Spinner) findViewById(R.id.idEffectivePixel);
        photo = (Spinner) findViewById(R.id.idPhotoDetectors);
        sensor = (Spinner) findViewById(R.id.idSensorSize);
        ArrayAdapter<String> adapterBudget = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,price);
        ArrayAdapter<String> adapterDate = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,tanggal);
        ArrayAdapter<String> adapterDimension = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,dimensi);
        ArrayAdapter<String> adapterWeight = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,berat);
        ArrayAdapter<String> adapterScreen = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,layar);
        ArrayAdapter<String> adapterMax = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,maks);
        ArrayAdapter<String> adapterPixel = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,pixels);
        ArrayAdapter<String> adapterPhoto = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,foto);
        ArrayAdapter<String> adapterSensor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,sensors);

        budget.setAdapter(adapterBudget);
        date.setAdapter(adapterDate);
        dimension.setAdapter(adapterDimension);
        weight.setAdapter(adapterWeight);
        screen.setAdapter(adapterScreen);
        max.setAdapter(adapterMax);
        pixel.setAdapter(adapterPixel);
        photo.setAdapter(adapterPhoto);
        sensor.setAdapter(adapterSensor);

    }

    public void onButtonKembali(View view) {
        finish();
    }

    public void onButtonLanjutkan(View view) {
        Intent i = new Intent(this, RekomendasiActivity.class);
        startActivity(i);
    }
}
