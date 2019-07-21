package com.gigi.myactivitylifecycledemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tvMessage1,tvMessage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvMessage2=findViewById(R.id.tvMsg2);
        tvMessage1=findViewById(R.id.tvMsg1);


        tvMessage2.setText(R.string.msg2);


        Log.i("ActivityLifeCycle"," onCreate() method is invoked");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityLifeCycle"," onStart() method is invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityLifeCycle"," onResume() method is invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityLifeCycle"," onPause() method is invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityLifeCycle"," onStop() method is invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityLifeCycle"," onDestroy() method is invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityLifeCycle"," onRestart() method is invoked");
    }
}
