package com.flavor.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.flavor.test.BuildConfig.FLAVOR;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.demoTest)).setText("Build Type = "+BuildConfig.BUILD_TYPE +" FLAVOR= "+ FLAVOR +" = "+ "URL=>  "+BuildConfig.URL_BASE );
    }
}
