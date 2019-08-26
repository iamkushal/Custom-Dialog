package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FullscreenProgressDialog fullscreenProgressDialog;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullscreenProgressDialog = new FullscreenProgressDialog();
        button = findViewById(R.id.clickMeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fullscreenProgressDialog.show(getSupportFragmentManager(), "Progress Dialog");
            }
        });

        /* Below code is to hide the progress dialog after 15 seconds.*/

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                fullscreenProgressDialog.dismiss();
            }
        }, 5000);
    }
}
