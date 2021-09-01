package com.example.guest248.multitool10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;


public class Kalkulator extends AppCompatActivity {

    Button decimal, clear, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, zbroj, oduzmi, pomnozi, podijeli, izracun;
    TextView unos, koraci;
    float[] polje;
    String temp, chkUnos;
    char[] funkcije;
    int i;
    char x;
    float rez, pastrez2, pastrez, rezultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        unos = (EditText) findViewById(R.id.editText);
        decimal = (Button) findViewById(R.id.decimal);
        clear = (Button) findViewById(R.id.btnClear);
        num0 = (Button) findViewById(R.id.num0);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        zbroj = (Button) findViewById(R.id.plus);
        oduzmi = (Button) findViewById(R.id.minus);
        pomnozi = (Button) findViewById(R.id.mnozenje);
        podijeli = (Button) findViewById(R.id.dijeljenje);
        izracun = (Button) findViewById(R.id.izracun);
        koraci = (TextView) findViewById(R.id.textView);

        i = 0;
        polje = new float[50];
        funkcije = new char[50];
        temp = "";
        pastrez = 1;
        pastrez2 = 1;
        x = '\u0000';




        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "0");
                temp = temp + "0";
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "1");
                temp = temp + "1";
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "2");
                temp = temp + "2";
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "3");
                temp = temp + "3";
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "4");
                temp = temp + "4";
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "5");
                temp = temp + "5";
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "6");
                temp = temp + "6";
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "7");
                temp = temp + "7";
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "8");
                temp = temp + "8";
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + "9");
                temp = temp + "9";
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + ".");
                temp = temp + ".";
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Reset();
            }
        });

        zbroj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = '+';
                Funkcije(x);
            }
        });

        oduzmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = '-';
                Funkcije(x);
            }
        });

        pomnozi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = '*';
                Funkcije(x);

            }
        });

        podijeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = '/';
                Funkcije(x);
            }
        });


        izracun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i>0){ //
                    if(temp == "") {
                        temp = koraci.getText().toString();
                    }
                    polje[i] = Float.parseFloat(temp);
                    funkcije[i] = '+';
                    unos.setText(unos.getText() + String.valueOf(funkcije[i]));
                    Izracun();
                    if(i<2) {
                        pastrez2 = 1;
                        pastrez = 1;

                    }else{
                        pastrez2 = pastrez;
                        pastrez = Float.valueOf(koraci.getText().toString());
                    }
                    koraci.setText(Float.toString(rez)); //
                    unos.setText("");
                    temp = "";
                    Arrays.fill(polje, 0);
                    Arrays.fill(funkcije, '\u0000');
                    i = 0;
                    x = '\u0000';
                }
            }
        });

    }

    void Funkcije(char x){
        if(i>0){ //
            if(temp == "") {
                temp = koraci.getText().toString();
            }
            polje[i] = Float.parseFloat(temp);
            funkcije[i] = x;
            unos.setText(unos.getText() + String.valueOf(funkcije[i]));

            Izracun();

            if(i<2) {
                pastrez2 = 1;
                pastrez = 1;

            }else{
                pastrez2 = pastrez;
                pastrez = Float.valueOf(koraci.getText().toString());
            }
            koraci.setText(Float.toString(rez)); //

            i++;
        }else {
            polje[i] = Float.parseFloat(temp);
            funkcije[i] = x;
            unos.setText(unos.getText() + String.valueOf(funkcije[i]));
            i++;
        }
        temp = "";
    }

    void Izracun(){
        if (funkcije[i-1] == '+') {
            if (i<2){
                rez = polje[i - 1] + polje[i];
            }else{
                rez = Float.valueOf(koraci.getText().toString()) + polje[i];
            }
        }

        else if (funkcije[i-1] == '-') {
            if (i<2){
                rez = polje[i - 1] - polje[i];
            }else{
                rez = Float.valueOf(koraci.getText().toString()) - polje[i];
            }
        }

        else if (funkcije[i-1] == '*') {
            if(i<2){
                rez = polje[i-1] * polje[i];

            }else{
                rez = Float.valueOf(koraci.getText().toString()) * polje[i];
            }
        }

        else if (funkcije[i-1] == '/') {
            if(i<2){
                rez = polje[i-1] / polje[i];

            }else{
                rez = Float.valueOf(koraci.getText().toString()) / polje[i];
            }
        }

    }

    void Reset(){
        unos.setText("");
        koraci.setText("");
        temp = "";
        Arrays.fill(polje, 0);
        Arrays.fill(funkcije, '\u0000');
        i = 0;
        pastrez = 1;
        pastrez2 = 1;
        x = '\u0000';
    }
}
