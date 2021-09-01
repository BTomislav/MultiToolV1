package com.example.guest248.multitool10;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class KonverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konverter);
        final Button btn=(Button) findViewById(R.id.pretvori);
        final ImageButton inverse = (ImageButton) findViewById(R.id.inverse);
        final Spinner glavnispinner = (Spinner) findViewById(R.id.glavniizbornik);
        final Spinner vrijednost1 = (Spinner) findViewById(R.id.vrijednost1);
        final Spinner vrijednost2 = (Spinner) findViewById(R.id.vrijednost2);
        ArrayAdapter<CharSequence> adp1 = ArrayAdapter.createFromResource(this,
                R.array.prvi, android.R.layout.simple_spinner_item);
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        glavnispinner.setAdapter(adp1);

        glavnispinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {
                final Spinner vrijednost1 = (Spinner) findViewById(R.id.vrijednost1);
                final Spinner vrijednost2 = (Spinner) findViewById(R.id.vrijednost2);
                final ImageButton inverse = (ImageButton) findViewById(R.id.inverse);
                final TextView rezultat = (TextView) findViewById(R.id.rezultat);
                EditText unos=(EditText) findViewById(R.id.unos);
                if (position==0){
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(KonverterActivity.this,
                            R.array.tempizb, android.R.layout.simple_list_item_1);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    vrijednost1.setAdapter(adapter);
                    vrijednost2.setAdapter(adapter);
                    unos.setText("0");
                    btn.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   final int pos=vrijednost1.getSelectedItemPosition();
                                                   final int pos2=vrijednost2.getSelectedItemPosition();
                                                   Temperatura(pos, pos2);
                                                   closeKeyboard();
                                               }
                                           }
                    );

                }
                if (position==1){
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( KonverterActivity.this,
                            R.array.duljinaizb, android.R.layout.simple_list_item_1);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    vrijednost1.setAdapter(adapter);
                    vrijednost2.setAdapter(adapter);
                    unos.setText("1");
                    btn.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   final int pos=vrijednost1.getSelectedItemPosition();
                                                   final int pos2=vrijednost2.getSelectedItemPosition();
                                                   Duljina(pos,pos2);
                                                   closeKeyboard();
                                               }
                                           }
                    );
                }
                if (position==2){
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(KonverterActivity.this,
                            R.array.valutaizb, android.R.layout.simple_list_item_1);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    vrijednost1.setAdapter(adapter);
                    vrijednost2.setAdapter(adapter);
                    unos.setText("1");
                    btn.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   final int pos=vrijednost1.getSelectedItemPosition();
                                                   final int pos2=vrijednost2.getSelectedItemPosition();
                                                   Valuta(pos, pos2);
                                                   closeKeyboard();
                                               }
                                           }
                    );
                }
                if (position==3){
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(KonverterActivity.this,
                            R.array.masaizb, android.R.layout.simple_list_item_1);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    vrijednost1.setAdapter(adapter);
                    vrijednost2.setAdapter(adapter);
                    unos.setText("1");
                    btn.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   final int pos=vrijednost1.getSelectedItemPosition();
                                                   final int pos2=vrijednost2.getSelectedItemPosition();
                                                   Masa(pos, pos2);
                                                   closeKeyboard();
                                               }
                                           }
                    );
                }
                if (position==4){
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(KonverterActivity.this,
                            R.array.brzinaizb, android.R.layout.simple_list_item_1);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    vrijednost1.setAdapter(adapter);
                    vrijednost2.setAdapter(adapter);
                    unos.setText("1");
                    btn.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   final int pos=vrijednost1.getSelectedItemPosition();
                                                   final int pos2=vrijednost2.getSelectedItemPosition();
                                                   Brzina(pos, pos2);
                                                   closeKeyboard();
                                               }
                                           }
                    );
                }
                if (position==5){
                    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(KonverterActivity.this,
                            R.array.vrijemeizb, android.R.layout.simple_list_item_1);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    vrijednost1.setAdapter(adapter);
                    vrijednost2.setAdapter(adapter);
                    unos.setText("1");
                    btn.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   final int pos=vrijednost1.getSelectedItemPosition();
                                                   final int pos2=vrijednost2.getSelectedItemPosition();
                                                   Vrijeme(pos, pos2);
                                                   closeKeyboard();
                                               }
                                           }
                    );

                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        inverse.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           final TextView teta = (TextView) findViewById(R.id.textView2);
                                           final int pos=vrijednost1.getSelectedItemPosition();
                                           final int pos2=vrijednost2.getSelectedItemPosition();
                                           vrijednost1.setSelection(pos2);
                                           vrijednost2.setSelection(pos);
                                           int pos3=glavnispinner.getSelectedItemPosition();
                                           if (pos3==0)
                                           {
                                               Temperatura(pos2,pos);
                                           }
                                           else if (pos3==1)
                                           {
                                               Duljina(pos2,pos);
                                           }
                                           else if (pos3==2)
                                           {
                                               Valuta(pos2,pos);
                                           }
                                           else if (pos3==3)
                                           {
                                               Masa(pos2,pos);
                                           }
                                           else if (pos3==4)
                                           {
                                               Brzina(pos2,pos);
                                           }
                                           else if (pos3==5)
                                           {
                                               Vrijeme(pos2,pos);
                                           }

                                       }
                                   }
        );

    }
    void  Temperatura(int pos, int pos2) {
        final TextView rezultat = (TextView) findViewById(R.id.rezultat);
        final EditText unos = (EditText) findViewById(R.id.unos);
        final Spinner vrijednost1 = (Spinner) findViewById(R.id.vrijednost1);
        final Spinner vrijednost2 = (Spinner) findViewById(R.id.vrijednost2);
        final ImageButton inverse = (ImageButton) findViewById(R.id.inverse);

        if (pos==0) //celzijus
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"°C");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj+273.15;
                rez=Math.round(rez*100);
                rez=rez/100;
                rezultat.setText(Double.toString(rez)+"K");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=((vrj*1.8)+32);
                rez=Math.round(rez*100);
                rez=rez/100;
                rezultat.setText(Double.toString(rez)+"°F");
            }
        }
        else if (pos==1) //kelvin
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj-273.15;
                rez=Math.round(rez*100);
                rez=rez/100;
                rezultat.setText(Double.toString(rez)+"°C");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"K");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=((vrj*1.8)-459.67);
                rez=Math.round(rez*100);
                rez=rez/100;
                rezultat.setText(Double.toString(rez)+"°F");
            }
        }
        else if (pos==2) //fahrenheit
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=((vrj-32)/1.8);
                rez=Math.round(rez*100);
                rez=rez/100;
                rezultat.setText(Double.toString(rez)+"°C");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=((vrj+459.67)*((float)5/(float)9));
                rez=Math.round(rez*100);
                rez=rez/100;
                rezultat.setText(Double.toString(rez)+"K");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"°F");
            }
        }
    }
    void Duljina(int pos, int pos2){
        final TextView rezultat = (TextView) findViewById(R.id.rezultat);
        final EditText unos = (EditText) findViewById(R.id.unos);
        if (pos==0) //kilometar
        {
            if (pos2 == 0) {   //kilometar
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"km");
            }
            else if(pos2 == 1){   //hektometar
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){  //metar
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){  //decimetar
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){  //centimetar
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){  //milimetar
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){  //mikrometar
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10000000;
                rez=rez*100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){  //nanometar
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100000000;
                rez=rez*10000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){  //inc
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*39370.1;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){  //stopa
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*3280.84;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){ //jard
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1093.61;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){  //milja
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.621371;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==1) //hektometar
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000000;
                rez=rez*100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10000000;
                rez=rez*10000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*3937.01;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*328.084;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*109.361;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0621371;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==2)  //metar
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10000;
                rez=rez*100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100000;
                rez=rez*10000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*39.3701;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*3.28084;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1.09361;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.000621371;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==3)  //decimetar
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100000000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*39.3701;
                rez=rez/10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.328084;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.109361;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.000062137;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==4)  //centimetar
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)100000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10000000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.393701;
                rez=rez/100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0328084;
                rez=rez/100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0109361;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0000062137;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==5)  //milimetar
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000000;
                rez=Math.round(rez*1000000);
                rez=rez/1000000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)100000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0393701;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.00328084;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.00109361;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.00000062137;
                rez=Math.round(rez*10000000);
                rez=rez/10000000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==6)  //mikrometar
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000000000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)100000000;
                rez=Math.round(rez*100000000);
                rez=rez/100000000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000000;
                rez=Math.round(rez*1000000);
                rez=rez/1000000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)100000;
                rez=Math.round(rez*1000000);
                rez=rez/1000000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.00003937;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0000032808;
                rez=Math.round(rez*1000000);
                rez=rez/1000000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0000010936;
                rez=Math.round(rez*1000000);
                rez=rez/1000000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.00000000062137;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==7)  //nanometar
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000000000;
                rez=rez/1000;
                rez=rez*10000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rez=rez/10000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000000000;
                rez=rez/100;
                rez=rez*10000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rez=rez/10000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000000;
                rez=rez/1000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)100000;
                rez=rez/1000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10000;
                rez=rez/1000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000;
                rez=rez/1000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj/1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.00000003937;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0000000032808;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0000000010936;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.00000000000062137;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==8)  //inch
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.0000254;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0254;
                rez=rez/100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0254;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0254;
                rez=rez*10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0254;
                rez=rez*100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0254;
                rez=rez*1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*25400;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*25400000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0833333;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0277778;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*0.000015783;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==9)  //stopa
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.3048;
                rez=rez/1000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.3048;
                rez=rez/100;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.3048;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.3048;
                rez=rez*10;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.3048;
                rez=rez*100;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.3048;
                rez=rez*1000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*304800;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)304800000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)12;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.333333;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.000189394;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==10)  //jard
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.9144;
                rez=rez/1000;
                rez=Math.round(rez*10000000);
                rez=rez/10000000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.9144;
                rez=rez/100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.9144;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.9144;
                rez=rez*10;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.9144;
                rez=rez*100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*914.4;
                rez=Math.round(rez*1000000);
                rez=rez/1000000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*914400;
                rez=Math.round(rez*10000000);
                rez=rez/10000000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)914400000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)36;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)3;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.000568182;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"M");
            }
        }
        if (pos==11)  //milja
        {
            if (pos2 == 0) {
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)1609.34;
                rez=rez/1000;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"km");
            }
            else if(pos2 == 1){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)1609.34;
                rez=rez/100;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"hm");
            }
            else if(pos2 == 2){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1609.34;
                rez=Math.round(rez*10000000);
                rez=rez/10000000;
                rezultat.setText(Double.toString(rez)+"m");
            }
            else if(pos2 == 3){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*16093.4;
                rez=Math.round(rez*10000000);
                rez=rez/10000000;
                rezultat.setText(Double.toString(rez)+"dm");
            }
            else if(pos2 == 4){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*160934;
                rez=Math.round(rez*100000000);
                rez=rez/100000000;
                rezultat.setText(Double.toString(rez)+"cm");
            }
            else if(pos2 == 5){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)1609000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"mm");
            }
            else if(pos2 == 6){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1609000000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"μm");
            }
            else if(pos2 == 7){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1609000000;
                rez=rez*1000;
                rez=Math.round(rez*1000000000);
                rez=rez/1000000000;
                rezultat.setText(Double.toString(rez)+"nm");
            }
            else if(pos2 == 8){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)63360;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"in");
            }
            else if(pos2 == 9){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)5280;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"ft");
            }
            else if(pos2 == 10){
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)1760;
                rez=Math.round(rez*100000);
                rez=rez/100000;
                rezultat.setText(Double.toString(rez)+"yd");
            }
            else if(pos2 == 11){
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+"M");
            }
        }
    }
    void Valuta(int pos, int pos2){
        final TextView rezultat = (TextView) findViewById(R.id.rezultat);
        final EditText unos = (EditText) findViewById(R.id.unos);
        if (pos == 0){	//HRK
            if(pos2 == 0){		//HRK
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" HRK");
            }
	        else if(pos2 == 1){	//EUR
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj / 7.422405;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" EUR");
            }
            else if(pos2 == 2){	//USD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj / 6.050709;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" USD");
            }
            else if(pos2 == 3){	//GBP
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj / 8.528559;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" GBP");
            }
            else if(pos2 == 4){	//CHF
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj / 6.301388;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CHF");
            }
            else if(pos2 == 5){	//DKK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj / 0.996764;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" DKK");
            }
            else if(pos2 == 6){	//CZK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj / 0.292739;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CZK");
            }
            else if(pos2 == 7){	//CAD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj / 4.724938;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CAD");
            }
            else if(pos2 == 8){	//NOK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj / 0.773820;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" NOK");
            }
        }
        if (pos == 1){	//EUR
            if(pos2 == 0){		//HRK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 7.422405;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" HRK");
            }
	        else if(pos2 == 1){	//EUR
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" EUR");
            }
            else if(pos2 == 2){	//USD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.23293;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" USD");
            }
            else if(pos2 == 3){	//GBP
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.870728;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" GBP");
            }
            else if(pos2 == 4){	//CHF
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.17838;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CHF");
            }
            else if(pos2 == 5){	//DKK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 7.44686;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" DKK");
            }
            else if(pos2 == 6){	//CZK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 25.3329;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CZK");
            }
            else if(pos2 == 7){	//CAD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.56721;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CAD");
            }
            else if(pos2 == 8){	//NOK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 9.64483;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" NOK");
            }
        }
        if (pos == 2){	//USD
            if(pos2 == 0){		//HRK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 6.00903;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" HRK");
            }
	        else if(pos2 == 1){	//EUR
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.808112;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" EUR");
            }
            else if(pos2 == 2){	//USD
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" USD");
            }
            else if(pos2 == 3){	//GBP
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.705218;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" GBP");
            }
            else if(pos2 == 4){	//CHF
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.953994;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CHF");
            }
            else if(pos2 == 5){	//DKK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 6.01959;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" DKK");
            }
            else if(pos2 == 6){	//CZK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 20.4829;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CZK");
            }
            else if(pos2 == 7){	//CAD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.26737;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CAD");
            }
            else if(pos2 == 8){	//NOK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 7.79765;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" NOK");
            }
        }
        if (pos == 3){	//GBP
            if(pos2 == 0){		//HRK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 8.528559;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" HRK");
            }
	        else if(pos2 == 1){	//EUR
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.14638;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" EUR");
            }
            else if(pos2 == 2){	//USD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.41814;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" USD");
            }
            else if(pos2 == 3){	//GBP
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" GBP");
            }
            else if(pos2 == 4){	//CHF
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.35298;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CHF");
            }
            else if(pos2 == 5){	//DKK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 8.53827;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" DKK");
            }
            else if(pos2 == 6){	//CZK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 29.0495;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CZK");
            }
            else if(pos2 == 7){	//CAD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.79677;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CAD");
            }
            else if(pos2 == 8){	//NOK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 11.0600;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" NOK");
            }
        }
        if (pos == 4){	//CHF
            if(pos2 == 0){		//HRK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 6.301388;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" HRK");
            }
            else if(pos2 == 1){	//EUR
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.847433;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" EUR");
            }
            else if(pos2 == 2){	//USD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.04846;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" USD");
            }
            else if(pos2 == 3){	//GBP
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.739060;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" GBP");
            }
            else if(pos2 == 4){	//CHF
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" CHF");
            }
            else if(pos2 == 5){	//DKK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 6.31136;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" DKK");
            }
            else if(pos2 == 6){	//CZK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 21.4767;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CZK");
            }
            else if(pos2 == 7){	//CAD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.32798;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CAD");
            }
            else if(pos2 == 8){	//NOK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 8.17646;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" NOK");
            }
        }
        if (pos == 5){	//DKK
            if(pos2 == 0){		//HRK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.996764;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" HRK");
            }
	        else if(pos2 == 1){	//EUR
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.134284;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" EUR");
            }
            else if(pos2 == 2){	//USD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.166097;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" USD");
            }
            else if(pos2 == 3){	//GBP
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.117099;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" GBP");
            }
            else if(pos2 == 4){	//CHF
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.158358;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CHF");
            }
            else if(pos2 == 5){	//DKK
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" DKK");
            }
            else if(pos2 == 6){	//CZK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3.40248;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CZK");
            }
            else if(pos2 == 7){	//CAD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.210308;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CAD");
            }
            else if(pos2 == 8){	//NOK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.29460;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" NOK");
            }
        }
        if (pos == 6){	//CZK
            if(pos2 == 0){		//HRK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.292739;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" HRK");
            }
	        else if(pos2 == 1){	//EUR
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.0394753;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" EUR");
            }
            else if(pos2 == 2){	//USD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.0488021;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" USD");
            }
            else if(pos2 == 3){	//GBP
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.0344354;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" GBP");
            }
            else if(pos2 == 4){	//CHF
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.0465708;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CHF");
            }
            else if(pos2 == 5){	//DKK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.293968;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" DKK");
            }
            else if(pos2 == 6){	//CZK
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" CZK");
            }
            else if(pos2 == 7){	//CAD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.0617980;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CAD");
            }
            else if(pos2 == 8){	//NOK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.380642;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" NOK");
            }
        }
        if (pos == 7){	//CAD
            if(pos2 == 0){		//HRK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 4.724938;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" HRK");
            }
	        else if(pos2 == 1){	//EUR
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.638860;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" EUR");
            }
            else if(pos2 == 2){	//USD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.789583;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" USD");
            }
            else if(pos2 == 3){	//GBP
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.557219;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" GBP");
            }
            else if(pos2 == 4){	//CHF
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.753640;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CHF");
            }
            else if(pos2 == 5){	//DKK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 4.75773;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" DKK");
            }
            else if(pos2 == 6){	//CZK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 16.1854;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CZK");
            }
            else if(pos2 == 7){	//CAD
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" CAD");
            }
            else if(pos2 == 8){	//NOK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 6.16192;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" NOK");
            }
        }
        if (pos == 8){	//NOK
            if(pos2 == 0){		//HRK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.773820;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" HRK");
            }
	        else if(pos2 == 1){	//EUR
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.103667;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" EUR");
            }
            else if(pos2 == 2){	//USD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.128112;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" USD");
            }
            else if(pos2 == 3){	//GBP
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.0903755;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" GBP");
            }
            else if(pos2 == 4){	//CHF
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.122261;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CHF");
            }
            else if(pos2 == 5){	//DKK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.771777;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" DKK");
            }
            else if(pos2 == 6){	//CZK
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 2.62547;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CZK");
            }
            else if(pos2 == 7){	//CAD
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.62177;
                rez = Math.round(rez*100);
                rez = rez / 100;
                rezultat.setText(Double.toString(rez)+" CAD");
            }
            else if(pos2 == 8){	//NOK
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" NOK");
            }
        }
    }
    void Masa(int pos, int pos2){
        final TextView rezultat = (TextView) findViewById(R.id.rezultat);
        final EditText unos = (EditText) findViewById(R.id.unos);
        if (pos==0) //tona
        {
            if (pos2 == 0) { //tona
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" t");
            }
            else if(pos2 == 1){ //kilogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" kg");
            }
            else if(pos2 == 2){  //dekagram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" dkg");
            }
            else if(pos2 == 3){  //gram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" g");
            }
            else if(pos2 == 4){   //miligram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" mg");
            }
            else if(pos2 == 5){   //mikrogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000000000;
                rez=rez*1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" µg");
            }
            else if(pos2 == 6){   //ounce
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)35274;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" ℥");
            }
            else if(pos2 == 7){ //pound
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)2204.62;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" lb");
            }
            else if(pos2 == 8){ //ston
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)157.473;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" st");
            }
        }

        if (pos==1) //kilogram
        {
            if (pos2 == 0) { //tona
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj/(float)1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" t");
            }
            else if(pos2 == 1){ //kilogram
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" kg");
            }
            else if(pos2 == 2){  //dekagram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*100;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" dkg");
            }
            else if(pos2 == 3){  //gram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" g");
            }
            else if(pos2 == 4){   //miligram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" mg");
            }
            else if(pos2 == 5){   //mikrogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" µg");
            }
            else if(pos2 == 6){   //ounce
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)35.274;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" ℥");
            }
            else if(pos2 == 7){ //pound
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)2.20462;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" lb");
            }
            else if(pos2 == 8){ //ston
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.157473;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" st");
            }
        }
        if (pos==2) //dekagram
        {
            if (pos2 == 0) { //tona
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj/(float)100000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" t");
            }
            else if(pos2 == 1){ //kilogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj/(float)100;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" kg");
            }
            else if(pos2 == 2){  //dekagram
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" dkg");
            }
            else if(pos2 == 3){  //gram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" g");
            }
            else if(pos2 == 4){   //miligram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" mg");
            }
            else if(pos2 == 5){   //mikrogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*10000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" µg");
            }
            else if(pos2 == 6){   //ounce
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.35274;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" ℥");
            }
            else if(pos2 == 7){ //pound
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0220462;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" lb");
            }
            else if(pos2 == 8){ //ston
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.00157473;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" st");
            }
        }
        if (pos==3) //gram
        {
            if (pos2 == 0) { //tona
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj/(float)1000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" t");
            }
            else if(pos2 == 1){ //kilogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj/(float)1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" kg");
            }
            else if(pos2 == 2){  //dekagram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" dkg");
            }
            else if(pos2 == 3){  //gram
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" g");
            }
            else if(pos2 == 4){   //miligram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" mg");
            }
            else if(pos2 == 5){   //mikrogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" µg");
            }
            else if(pos2 == 6){   //ounce
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.035274;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" ℥");
            }
            else if(pos2 == 7){ //pound
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.00220462;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" lb");
            }
            else if(pos2 == 8){ //ston
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.000157473;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" st");
            }
        }
        if (pos==4) //miligram
        {
            if (pos2 == 0) { //tona
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj/(float)1000000;
                rez=(float)rez/(float)1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" t");
            }
            else if(pos2 == 1){ //kilogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj/(float)1000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" kg");
            }
            else if(pos2 == 2){  //dekagram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" dkg");
            }
            else if(pos2 == 3){  //gram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" g");
            }
            else if(pos2 == 4){   //miligram
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" mg");
            }
            else if(pos2 == 5){   //mikrogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=vrj*1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" µg");
            }
            else if(pos2 == 6){   //ounce
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.000035274;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" ℥");
            }
            else if(pos2 == 7){ //pound
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.00000220462;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" lb");
            }
            else if(pos2 == 8){ //ston
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.000000157473;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" st");
            }
        }
        if (pos==5) //mikrogram
        {
            if (pos2 == 0) { //tona
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj/(float)1000000;
                rez=(float)rez/(float)1000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" t");
            }
            else if(pos2 == 1){ //kilogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj/(float)1000000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" kg");
            }
            else if(pos2 == 2){  //dekagram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)10000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" dkg");
            }
            else if(pos2 == 3){  //gram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" g");
            }
            else if(pos2 == 4){   //miligram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj/(float)1000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" mg");
            }
            else if(pos2 == 5){   //mikrogram
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" µg");
            }
            else if(pos2 == 6){   //ounce
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.000000035274;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" ℥");
            }
            else if(pos2 == 7){ //pound
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.00000000220462;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" lb");
            }
            else if(pos2 == 8){ //ston
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.000000000157473;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" st");
            }
        }
        if (pos==6) //ounce
        {
            if (pos2 == 0) { //tona
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj*(float)0.00002835;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" t");
            }
            else if(pos2 == 1){ //kilogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj*(float)0.0283495;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" kg");
            }
            else if(pos2 == 2){  //dekagram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)2.83495;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" dkg");
            }
            else if(pos2 == 3){  //gram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)28.3495;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" g");
            }
            else if(pos2 == 4){   //miligram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)28349.5;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" mg");
            }
            else if(pos2 == 5){   //mikrogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)28350000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" µg");
            }
            else if(pos2 == 6){   //ounce
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" ℥");
            }
            else if(pos2 == 7){ //pound
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0625;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" lb");
            }
            else if(pos2 == 8){ //ston
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.00446429;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" st");
            }
        }
        if (pos==7) //pound
        {
            if (pos2 == 0) { //tona
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj*(float)0.000453592;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" t");
            }
            else if(pos2 == 1){ //kilogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj*(float)0.453592;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" kg");
            }
            else if(pos2 == 2){  //dekagram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)45.3592;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" dkg");
            }
            else if(pos2 == 3){  //gram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)453.592;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" g");
            }
            else if(pos2 == 4){   //miligram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)453592;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" mg");
            }
            else if(pos2 == 5){   //mikrogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)453600000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" µg");
            }
            else if(pos2 == 6){   //ounce
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)16;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" ℥");
            }
            else if(pos2 == 7){ //pound
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" lb");
            }
            else if(pos2 == 8){ //ston
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)0.0714286;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" st");
            }
        }
        if (pos==8) //stone
        {
            if (pos2 == 0) { //tona
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj*(float)0.00635029;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" t");
            }
            else if(pos2 == 1){ //kilogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez= (float)vrj*(float)6.35029;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" kg");
            }
            else if(pos2 == 2){  //dekagram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)635.029;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" dkg");
            }
            else if(pos2 == 3){  //gram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)6350.29;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" g");
            }
            else if(pos2 == 4){   //miligram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)6350000;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" mg");
            }
            else if(pos2 == 5){   //mikrogram
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)63500000;
                rez=rez*100;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" µg");
            }
            else if(pos2 == 6){   //ounce
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)224;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" ℥");
            }
            else if(pos2 == 7){ //pound
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez=(float)vrj*(float)14;
                rez=Math.round(rez*1000);
                rez=rez/1000;
                rezultat.setText(Double.toString(rez)+" lb");
            }
            else if(pos2 == 8){ //ston
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" st");
            }
        }
    }
    void Brzina(int pos, int pos2){
        final TextView rezultat = (TextView) findViewById(R.id.rezultat);
        final EditText unos = (EditText) findViewById(R.id.unos);
        if (pos == 0){	//km/h
            if(pos2 == 0){		//km/h
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" km/h");
            }
	        else if(pos2 == 1){	//m/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.277778;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" m/s");
            }
            else if(pos2 == 2){	//ft/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.911344;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ft/s");
            }
            else if(pos2 == 3){	//mph
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.621371;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mph");
            }
            else if(pos2 == 4){	//knot
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.539957;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" kn");
            }
            else if(pos2 == 5){	//Jard/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.3037814717605;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" yd/s");
            }
        }
        if (pos == 1){	//m/s
            if(pos2 == 0){		//km/h
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3.6;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" km/h");
            }
	        else if(pos2 == 1){	//m/s
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" m/s");
            }
            else if(pos2 == 2){	//ft/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3.280839895013;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ft/s");
            }
            else if(pos2 == 3){	//mph
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 2.236936292054;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mph");
            }
            else if(pos2 == 4){	//knot
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.943844492441;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" kn");
            }
            else if(pos2 == 5){	//Jard/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.093613298338;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" yd/s");
            }
        }
        if (pos == 2){	//ft/s
            if(pos2 == 0){		//km/h
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.09728;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" km/h");
            }
	        else if(pos2 == 1){	//m/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.3048;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" m/s");
            }
            else if(pos2 == 2){	//ft/s
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" ft/s");
            }
            else if(pos2 == 3){	//mph
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.681818182;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mph");
            }
            else if(pos2 == 4){	//knot
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.5924838013;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" kn");
            }
            else if(pos2 == 5){	//Jard/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.3333333;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" yd/s");
            }
        }
        if (pos == 3){	//mph
            if(pos2 == 0){		//km/h
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.609344;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" km/h");
            }
	        else if(pos2 == 1){	//m/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.44704;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" m/s");
            }
            else if(pos2 == 2){	//ft/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.46666667;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ft/s");
            }
            else if(pos2 == 3){	//mph
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" mph");
            }
            else if(pos2 == 4){	//knot
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.8689762419;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" kn");
            }
            else if(pos2 == 5){	//Jard/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.48888888889;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" yd/s");
            }
        }
        if (pos == 4){	//knot
            if(pos2 == 0){		//km/h
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.852;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" km/h");
            }
	        else if(pos2 == 1){	//m/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.514444444;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" m/s");
            }
            else if(pos2 == 2){	//ft/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.687809857101;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ft/s");
            }
            else if(pos2 == 3){	//mph
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.150779448024;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mph");
            }
            else if(pos2 == 4){	//knot
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" kn");
            }
            else if(pos2 == 5){	//Jard/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.5626032857;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" yd/s");
            }
        }
        if (pos == 5){	//Jard/s
            if(pos2 == 0){		//km/h
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3.29184;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" km/h");
            }
	        else if(pos2 == 1){	//m/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 0.9144;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" m/s");
            }
            else if(pos2 == 2){	//ft/s
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ft/s");
            }
            else if(pos2 == 3){	//mph
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 2.045454545455;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mph");
            }
            else if(pos2 == 4){	//knot
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1.777451403888;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" kn");
            }
            else if(pos2 == 5){	//Jard/s
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" yd/s");
            }
        }
    }
    void Vrijeme(int pos, int pos2){
        final TextView rezultat = (TextView) findViewById(R.id.rezultat);
        final EditText unos = (EditText) findViewById(R.id.unos);
        if (pos == 0){	//sekunda
            if(pos2 == 0){		//sekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" s");
            }
            else if(pos2 == 1){	//milisekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 1000;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ms");
            }
            else if(pos2 == 2){	//minuta
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)60;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" min");
            }
            else if(pos2 == 3){	//sat
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)3600;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" h");
            }
            else if(pos2 == 4){	//dan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)86400;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" d.");
            }
            else if(pos2 == 5){	//tjedan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)604800;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" tj.");
            }
            else if(pos2 == 6){	//mjesec
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)2592000;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mj.");
            }
            else if(pos2 == 7){	//godina
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)31536000;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" god.");
            }
        }
        if (pos == 1){	//milisekunda
            if(pos2 == 0){//sekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)1000;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" s");
            }
            else if(pos2 == 1){	//milisekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" ms");
            }
            else if(pos2 == 2){	//minuta
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)0.000016667;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" min");
            }
            else if(pos2 == 3){	//sat
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)0.000000277778;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" h");
            }
            else if(pos2 == 4){	//dan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)0.000000011574;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" d.");
            }
            else if(pos2 == 5){	//tjedan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)0.0000000016534;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" tj.");
            }
            else if(pos2 == 6){	//mjesec
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)0.00000000038052;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mj.");
            }
            else if(pos2 == 7){	//godina
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)0.00000000003171;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" god.");
            }
        }
        if (pos == 2){	//minuta
            if(pos2 == 0){		//sekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 60;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" s");

            }
            else if(pos2 == 1){	//milisekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)60000;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ms");
            }
            else if(pos2 == 2){	//minuta
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" min");
            }
            else if(pos2 == 3){	//sat
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)60;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" h");
            }
            else if(pos2 == 4){	//dan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)1440;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" d.");
            }
            else if(pos2 == 5){	//tjedan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)10080;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" tj.");
            }
            else if(pos2 == 6){	//mjesec
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)43200;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mj.");
            }
            else if(pos2 == 7){	//godina
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)525600;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" god.");
            }
        }
        if (pos == 3){	//sat
            if(pos2 == 0){	//sekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3600;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" s");

            }
            else if(pos2 == 1){	//milisekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)3600000;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ms");
            }
            else if(pos2 == 2){	//minuta
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)60;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" min");
            }
            else if(pos2 == 3){	//sat
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" h");
            }
            else if(pos2 == 4){	//dan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)24;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" d.");
            }
            else if(pos2 == 5){	//tjedan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)168;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" tj.");
            }
            else if(pos2 == 6){	//mjesec
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)720;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mj.");
            }
            else if(pos2 == 7){	//godina
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)8760;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" god.");
            }
        }
        if (pos == 4){	//dan
            if(pos2 == 0){	//sekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3600 * 24;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" s");

            }
            else if(pos2 == 1){	//milisekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)3600000 * 24;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ms");
            }
            else if(pos2 == 2){	//minuta
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)60 * 24;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" min");
            }
            else if(pos2 == 3){	//sat
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)24;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" h");
            }
            else if(pos2 == 4){	//dan
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" d.");
            }
            else if(pos2 == 5){	//tjedan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)7;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" tj.");
            }
            else if(pos2 == 6){	//mjesec
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)30;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mj.");
            }
            else if(pos2 == 7){	//godina
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)365;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" god.");
            }
        }
        if (pos == 5){	//tjedan
            if(pos2 == 0){	//sekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3600 * 24 * 7;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" s");

            }
            else if(pos2 == 1){	//milisekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)3600000*24*7;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ms");
            }
            else if(pos2 == 2){	//minuta
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)60 * 24*7;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" min.");
            }
            else if(pos2 == 3){	//sat
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)24*7;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" h");
            }
            else if(pos2 == 4){	//dan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)7;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" d.");
            }
            else if(pos2 == 5){	//tjedan
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" tj.");
            }
            else if(pos2 == 6){	//mjesec
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)0.230137;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mj.");
            }
            else if(pos2 == 7){	//godina
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)0.0191781;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" god.");
            }
        }
        if (pos == 6){	//mjesec
            if(pos2 == 0){	//sekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3600 * 24 *30;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" s");

            }
            else if(pos2 == 1){	//milisekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)3600000*24*30;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ms");
            }
            else if(pos2 == 2){	//minuta
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)60 * 24*30;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" min");
            }
            else if(pos2 == 3){	//sat
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)24*30;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" h");
            }
            else if(pos2 == 4){	//dan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)30;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" d.");
            }
            else if(pos2 == 5){	//tjedan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)4.34524;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" tj.");
            }
            else if(pos2 == 6){	//mjesec
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" mj.");
            }
            else if(pos2 == 7){	//godina
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj/(float)12;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" god.");
            }
        }
        if (pos == 7){	//godina
            if(pos2 == 0){	//sekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = vrj * 3600 * 24 *365;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" s");

            }
            else if(pos2 == 1){	//milisekunda
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)3600000*24*365;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" ms");
            }
            else if(pos2 == 2){	//minuta
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)60 * 24*365;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" min");
            }
            else if(pos2 == 3){	//sat
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)24*365;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" h");
            }
            else if(pos2 == 4){	//dan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)365;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" d.");
            }
            else if(pos2 == 5){	//tjedan
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)52.1429;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" tj.");
            }
            else if(pos2 == 6){	//mjesec
                double vrj = Double.parseDouble(unos.getText().toString());
                double rez = (float)vrj*(float)12;
                rez = Math.round(rez*1000);
                rez = rez / 1000;
                rezultat.setText(Double.toString(rez)+" mj.");
            }
            else if(pos2 == 7){	//godina
                double vrj = Double.parseDouble(unos.getText().toString());
                rezultat.setText(Double.toString(vrj)+" god.");
            }
        }
    }
    private void closeKeyboard() {
        final EditText unos = (EditText) findViewById(R.id.unos);
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(unos.getWindowToken(), 0);
    }
}