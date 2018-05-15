package com.example.axity.expressotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button btnMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();
        setUpActions();
    }

    private void setUpView() {
        tvMessage = findViewById(R.id.tvMessage);
        btnMessage = findViewById(R.id.btnMessage);
    }

    private void setUpActions() {
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMessage.setText("Prueba Exitosa");
            }
        });
    }

}
