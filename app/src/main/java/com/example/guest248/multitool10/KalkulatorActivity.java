package com.example.guest248.multitool10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class KalkulatorActivity extends AppCompatActivity {


    final char zbrajanje = '+';
    final char oduzimanje = '-';
    final char mnozenje = '*';
    final char dijeljenje = '/';
    char operacija;
    double vrj1 = Double.NaN;
    double vrj2;
    String unostekst;
    int i=1;

    String[] polje = new String[50];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);


        final EditText unos = (EditText) findViewById(R.id.editText);
        final Button decimal = (Button) findViewById(R.id.decimal);
        final Button clear = (Button) findViewById(R.id.btnClear);
        final Button num0 = (Button) findViewById(R.id.num0);
        final Button num1 = (Button) findViewById(R.id.num1);
        final Button num2 = (Button) findViewById(R.id.num2);
        final Button num3 = (Button) findViewById(R.id.num3);
        final Button num4 = (Button) findViewById(R.id.num4);
        final Button num5 = (Button) findViewById(R.id.num5);
        final Button num6 = (Button) findViewById(R.id.num6);
        final Button num7 = (Button) findViewById(R.id.num7);
        final Button num8 = (Button) findViewById(R.id.num8);
        final Button num9 = (Button) findViewById(R.id.num9);
        final Button zbroj = (Button) findViewById(R.id.plus);
        final Button oduzmi = (Button) findViewById(R.id.minus);
        final Button pomnozi = (Button) findViewById(R.id.mnozenje);
        final Button podijeli = (Button) findViewById(R.id.dijeljenje);
        final Button izracun = (Button) findViewById(R.id.izracun);
        final TextView koraci = (TextView) findViewById(R.id.textView);


        /*izracun.setOnClickListener(new View.OnClickListener() {      //dasdasdasdas
            @Override
            public void onClick(View v) {
                izracunaj();
            }
        });*/

        /*decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unos.setText(unos.getText() + ".");
            }
        });*/

            num0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "0");
                    unostekst=unos.getText().toString()+"0";
                }
            });

            num1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "1");
                    unostekst=unos.getText().toString()+"1";
                }
            });

            num2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "2");
                    unostekst=unos.getText().toString()+"2";
                }
            });

            num3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "3");
                    unostekst=unos.getText().toString()+"3";
                }
            });

            num4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "4");
                    unostekst=unos.getText().toString()+"4";
                }
            });

            num5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "5");
                    unostekst=unos.getText().toString()+"5";
                }
            });

            num6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "6");
                    unostekst=unos.getText().toString()+"6";
                }
            });

            num7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "7");
                    unostekst=unos.getText().toString()+"7";
                }
            });

            num8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "8");
                    unostekst=unos.getText().toString()+"8";
                }
            });

            num9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unos.setText(unos.getText() + "9");
                    unostekst=unos.getText().toString()+"9";
                }
            });

            zbroj.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (i-1==0 && unos.getText().toString().equals("") || polje[i-1].equals("+") || polje[i-1].equals("-") || polje[i-1].equals("*") || polje[i-1].equals("/"))
                { Toast.makeText(getApplicationContext(), "Ova operacija nije moguća", Toast.LENGTH_SHORT).show();
                }
                else{
                    polje[i]=unostekst;
                    unostekst="";
                    i++;
                    polje[i]="+";
                    i++;
                    unos.setText(unos.getText() + "+");
                }

            }
            });

            oduzmi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (polje[i-1].equals("+") || polje[i-1].equals("-") || polje[i-1].equals("*") || polje[i-1].equals("/"))
                    {
                        Toast.makeText(getApplicationContext(), "Ova operacija nije moguća", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        polje[i]=unostekst;
                        unostekst="";
                        i++;
                        polje[i]="-";
                        i++;
                        unos.setText(unos.getText() + "-");
                    }

                }
            });

            pomnozi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ( polje[i-1].equals("+") || polje[i-1].equals("-") || polje[i-1].equals("*") || polje[i-1].equals("/"))
                    {
                        Toast.makeText(getApplicationContext(), "Ova operacija nije moguća", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        polje[i]=unostekst;
                        unostekst="";
                        i++;
                        polje[i]="*";
                        i++;
                        unos.setText(unos.getText() + "*");
                    }

                }
            });

            podijeli.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (polje[i-1].equals("+") || polje[i-1].equals("-") || polje[i-1].equals("*") || polje[i-1].equals("/"))
                    {
                        Toast.makeText(getApplicationContext(), "Ova operacija nije moguća", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        polje[i]=unostekst;
                        unostekst="";
                        i++;
                        polje[i]="/";
                        i++;
                        unos.setText(unos.getText() + "/");
                    }
                }
            });

            izracun.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    computeCalculation();
                }
            });

            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(unos.getText().length() > 0) {
                        CharSequence currentText = unos.getText();
                        unos.setText(currentText.subSequence(0, currentText.length()-1));
                    }
                    else {
                        vrj1 = Double.NaN;
                        vrj2 = Double.NaN;
                        unos.setText("");
                        koraci.setText("");
                    }
                }
            });
        }

    private void computeCalculation() {
        final EditText unos = (EditText) findViewById(R.id.editText);
        if(!Double.isNaN(vrj1)) {
            vrj2 = Double.parseDouble(unos.getText().toString());
            unos.setText(null);

            if(operacija == zbrajanje)
                vrj1 = this.vrj1 + vrj2;
            else if(operacija == oduzimanje)
                vrj1 = this.vrj1 - vrj2;
            else if(operacija == mnozenje)
                vrj1 = this.vrj1 * vrj2;
            else if(operacija == dijeljenje)
                vrj1 = this.vrj1 / vrj2;
        }
        else {
            try {
                vrj1 = Double.parseDouble(unos.getText().toString());
            }
            catch (Exception e){}
        }
    }

   /* private void izracunaj(){
        final EditText unos = (EditText) findViewById(R.id.editText);
        final Button decimal = (Button) findViewById(R.id.decimal);
        final Button clear = (Button) findViewById(R.id.btnClear);
        final Button num0 = (Button) findViewById(R.id.num0);
        final Button num1 = (Button) findViewById(R.id.num1);
        final Button num2 = (Button) findViewById(R.id.num2);
        final Button num3 = (Button) findViewById(R.id.num3);
        final Button num4 = (Button) findViewById(R.id.num4);
        final Button num5 = (Button) findViewById(R.id.num5);
        final Button num6 = (Button) findViewById(R.id.num6);
        final Button num7 = (Button) findViewById(R.id.num7);
        final Button num8 = (Button) findViewById(R.id.num8);
        final Button num9 = (Button) findViewById(R.id.num9);
        final Button zbroj = (Button) findViewById(R.id.plus);
        final Button oduzmi = (Button) findViewById(R.id.minus);
        final Button pomnozi = (Button) findViewById(R.id.mnozenje);
        final Button podijeli = (Button) findViewById(R.id.dijeljenje);
        final Button izracun = (Button) findViewById(R.id.izracun);
        final TextView koraci = (TextView) findViewById(R.id.textView);

        String[] polje = new String[500];
        unos.getText()

    }*/
}

