package com.example.wawan.uassbpmobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutClick(View view) {
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }

    public void rekomendasiClick(View view) {
        Intent i = new Intent(this, KreteriaActivity.class);
        startActivity(i);
    }

    public void createClick(View view) {
    }

    public void updateClick(View view) {
    }

    public void readClick(View view) {
        Intent i = new Intent(this, ReadDataActivity.class);
        startActivity(i);
    }

    public void exitClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("QUIT");
        builder.setMessage("Apakah kamu yakin mau keluar? ");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "OK telah di klik",Toast.LENGTH_SHORT).show();
                finish();
            }
        })
                .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Batal telah di klik",Toast.LENGTH_SHORT).show();
                    }
                });
        builder.create().show();
    }
}
