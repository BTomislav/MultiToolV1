package com.example.guest248.multitool10;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityFlashlight extends AppCompatActivity {
    private Camera camera;
    private Camera.Parameters parametar;
    boolean upaljeno=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitivity_flashlight);

        boolean provjera=getApplication().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        final ImageButton flashlight=(ImageButton) findViewById(R.id.flashlight);



        if (!provjera)
        {
            Toast.makeText(getApplicationContext(),"Ovaj uređaj nema bljeskalicu",Toast.LENGTH_SHORT);
            startActivity(new Intent(this, Glavni_Izbornik.class));
        }
        else{
            this.camera = Camera.open(0);
            parametar = this.camera.getParameters();
        }


        flashlight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!upaljeno){
                    upali();
                }
                else
                {
                    ugasi();
                }
            }
        });
    }
    void ugasi(){
        ImageButton flashlight=(ImageButton) findViewById(R.id.flashlight);
        parametar.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
        this.camera.setParameters(parametar);
        this.camera.stopPreview();
        upaljeno = false;
        flashlight.setBackgroundResource(R.drawable.buttonoff);
    }
    void upali(){
        ImageButton flashlight=(ImageButton) findViewById(R.id.flashlight);
        if(this.camera != null){
            parametar.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            this.camera.setParameters(parametar);
            this.camera.startPreview();
            upaljeno = true;
            flashlight.setBackgroundResource(R.drawable.buttonon);
        }
    }
}
