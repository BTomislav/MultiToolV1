package com.example.guest248.multitool10;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Handler;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StopericaActivity extends AppCompatActivity {

    TextView textView ;

    Button pokreni, zaustavi, obrisi, oznaci ;

    long MillisecondTime, StartTime, TimeBuff, UpdateTime = 0L ;

    Handler handler;

    int Sekunde, Minute, Milisekunde ;

    ListView listView ;

    String[] ListElements = new String[] {  };

    List<String> ListElementsArrayList ;

    ArrayAdapter<String> adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stoperica);

        textView = (TextView)findViewById(R.id.textView);
        pokreni = (Button)findViewById(R.id.button);
        zaustavi = (Button)findViewById(R.id.button2);
        obrisi = (Button)findViewById(R.id.button3);
        oznaci = (Button)findViewById(R.id.button4) ;
        listView = (ListView)findViewById(R.id.listview1);

        handler = new Handler() ;

        ListElementsArrayList = new ArrayList<String>(Arrays.asList(ListElements));

        adapter = new ArrayAdapter<String>(StopericaActivity.this,
                android.R.layout.simple_list_item_1,
                ListElementsArrayList
        );

        listView.setAdapter(adapter);

        pokreni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartTime = SystemClock.uptimeMillis();
                handler.postDelayed(runnable, 0);

                obrisi.setEnabled(false);

            }
        });

        zaustavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TimeBuff += MillisecondTime;

                handler.removeCallbacks(runnable);

                obrisi.setEnabled(true);

            }
        });

        obrisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MillisecondTime = 0L ;
                StartTime = 0L ;
                TimeBuff = 0L ;
                UpdateTime = 0L ;
                Sekunde = 0 ;
                Minute = 0 ;
                Milisekunde = 0 ;

                textView.setText("00:00:00");

                ListElementsArrayList.clear();

                adapter.notifyDataSetChanged();
            }
        });

        oznaci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ListElementsArrayList.add(textView.getText().toString());

                adapter.notifyDataSetChanged();

            }
        });

    }

    public Runnable runnable = new Runnable() {

        public void run() {

            MillisecondTime = SystemClock.uptimeMillis() - StartTime;

            UpdateTime = TimeBuff + MillisecondTime;

            Sekunde = (int) (UpdateTime / 1000);

            Minute = Sekunde / 60;

            Sekunde = Sekunde % 60;

            Milisekunde = (int) (UpdateTime % 1000);

            textView.setText("" + Minute + ":"
                    + String.format("%02d", Sekunde) + ":"
                    + String.format("%03d", Milisekunde));

            handler.postDelayed(this, 0);
        }

    };

}
