package com.example.fadingapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    public void fade(View view){
       ImageView doraemon=(ImageView)findViewById(R.id.doraemon);
        ImageView nobita=(ImageView)findViewById(R.id.nobita)
        doraemon.animate().alpha(0f).setDuration(2000);
        nobita.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
