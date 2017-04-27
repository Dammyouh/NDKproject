package com.example.ndkproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView mTextView = (TextView)this.findViewById(R.id.textView);
         NdkJniUtils jni = new NdkJniUtils();
         mTextView.setText(jni.getCLanguageString());
    }
}
