package com.example.guest248.multitool10;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.media.MediaRecorder.VideoSource.CAMERA;

public class Glavni_Izbornik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView naslov=(TextView) findViewById(R.id.naslov);
        setContentView(R.layout.activity_glavni__izbornik);
        ImageButton konverter=(ImageButton) findViewById(R.id.konverter);
        ImageButton kalkulator=(ImageButton) findViewById(R.id.kalkulator);
        ImageButton qr=(ImageButton) findViewById(R.id.qrscanner);
        ImageButton flashlight=(ImageButton) findViewById(R.id.flashlight1);
        ImageButton stoperica=(ImageButton) findViewById(R.id.stoperica);
        konverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Glavni_Izbornik.this, KonverterActivity.class);
                startActivity(intent);
            }
        });
        kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Glavni_Izbornik.this, Kalkulator.class);
                startActivity(intent);
            }
        });
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Glavni_Izbornik.this, QrscannerActivity.class);
                startActivity(intent);
            }
        });
        flashlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Glavni_Izbornik.this, ActivityFlashlight.class);
                startActivity(intent);
            }
        });
        stoperica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Glavni_Izbornik.this, StopericaActivity.class);
                startActivity(intent);
            }
        });
        if (ContextCompat.checkSelfPermission(Glavni_Izbornik.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(Glavni_Izbornik.this, Manifest.permission.CAMERA)) {
                ActivityCompat.requestPermissions(Glavni_Izbornik.this, new String[]{Manifest.permission.CAMERA}, CAMERA);

            } else {

                ActivityCompat.requestPermissions(Glavni_Izbornik.this, new String[]{Manifest.permission.CAMERA}, CAMERA);
            }
        } else {

        }
    }
}
