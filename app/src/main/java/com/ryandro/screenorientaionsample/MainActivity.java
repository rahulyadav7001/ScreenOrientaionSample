package com.ryandro.screenorientaionsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String TAG = MainActivity.class.getSimpleName();
    Date date;
    DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
    String myStrValue = "Hello", DATA_KEY = "DATA_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = new Date();
        if (savedInstanceState != null) {
            myStrValue = savedInstanceState.getString(DATA_KEY);
        }

        Log.d("" + TAG, "OnCreat Method Called at : " + dateFormat.format(date.getTime()));
        Log.d(TAG, "My String Value : " + myStrValue);
    }

    @Override
    protected void onStart() {
        super.onStart();
        date = new Date();
        Log.d("" + TAG, "onStart Method Called at : " + dateFormat.format(date.getTime()));
    }

    @Override
    protected void onResume() {
        super.onResume();
        date = new Date();
        Log.d("" + TAG, "onResume Method Called at : " + dateFormat.format(date.getTime()));

        if (myStrValue != null && myStrValue.equalsIgnoreCase("Hello Indians")) {
            myStrValue += " Welcome";

        } else {
            myStrValue += " Indians";
        }
        Log.d(TAG, "My String Value : " + myStrValue);
    }

    @Override
    protected void onPause() {
        super.onPause();
        date = new Date();
        Log.d("" + TAG, "onPause Method Called at : " + dateFormat.format(date.getTime()));
    }

    @Override
    protected void onStop() {
        super.onStop();
        date = new Date();
        Log.d("" + TAG, "onStop Method Called at : " + dateFormat.format(date.getTime()));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        date = new Date();
        Log.d("" + TAG, "onRestart Method Called at : " + dateFormat.format(date.getTime()));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        date = new Date();
        Log.d("" + TAG, "onDestroy Method Called at : " + dateFormat.format(date.getTime()));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        date = new Date();
        Log.d("" + TAG, "onSaveInstanceState Method Called at : " + dateFormat.format(date.getTime()));
        outState.putString(DATA_KEY, myStrValue);
    }

   /* @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        date = new Date();
        Log.d("" + TAG, "onRestoreInstanceState Method Called at : " + dateFormat.format(date.getTime()));
        myStrValue = savedInstanceState.getString(DATA_KEY);
    }*/
}
