package com.example.user.myweatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
    TextView tvDate, tvKota, tvSuhu,tvCuaca;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDate = (TextView)findViewById(R.id.tv_date);
        tvKota = (TextView)findViewById(R.id.tv_kota);
        tvSuhu = (TextView)findViewById(R.id.tv_suhu);
        tvCuaca = (TextView)findViewById(R.id.tv_cuaca);

        find_weather();
    }

    public void find_weather()
    {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=sleman,id&appid=115fff41be463a8fad02a0ed76114308&units=Imperial";

    }
}
