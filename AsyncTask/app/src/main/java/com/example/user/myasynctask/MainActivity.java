package com.example.user.myasynctask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnGo;
    private ProgressBar progressBar;
    private TextView tvOutput;
    Integer count =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGo = (Button)findViewById(R.id.btn_go);
        btnGo.setText("Start");
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
        progressBar.setMax(10);
        tvOutput = (TextView)findViewById(R.id.tv_output);
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                count =1;
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(0);
                switch (view.getId()) {
                    case R.id.btn_go:
                        new MyTask().execute(10);
                        break;
                }
    }
};
        btnGo.setOnClickListener(listener);
    }

    class MyTask extends AsyncTask<Integer, Integer, String> {
        @Override
        protected String doInBackground(Integer... params) {
            for (; count <= params[0]; count++) {
                try {
                    Thread.sleep(1000);
                    publishProgress(count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Task Completed.";
        }
        @Override
        protected void onPostExecute(String result) {
            progressBar.setVisibility(View.GONE);
            tvOutput.setText(result);
            btnGo.setText("Restart");
        }
        @Override
        protected void onPreExecute() {
            tvOutput.setText("Task Starting...");
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            tvOutput.setText("Running..."+ values[0]);
            progressBar.setProgress(values[0]);
        }
    }
}

