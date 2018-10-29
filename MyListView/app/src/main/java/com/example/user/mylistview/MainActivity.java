package com.example.user.mylistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRecycler = (Button)findViewById(R.id.btn_recycler);
        btnRecycler.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_recycler:
                Intent moveIntent = new Intent(MainActivity.this, MyyRecyclerView.class);
                startActivity(moveIntent);
                break;
        }
    }
}
