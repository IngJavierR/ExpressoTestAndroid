package com.example.axity.expressotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etInputUsername;
    EditText etInputPwd;
    TextView tvStatusMessage;
    Button btnMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();
        setUpActions();
    }

    private void setUpView() {
        etInputUsername = findViewById(R.id.et_input_username);
        etInputPwd = findViewById(R.id.et_input_pwd);
        tvStatusMessage = findViewById(R.id.tv_status_message);
        btnMessage = findViewById(R.id.btn_message);
    }

    private void setUpActions() {
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                if(validateUser(
                        MainActivity.this.etInputUsername.getText().toString(),
                        MainActivity.this.etInputPwd.getText().toString())) {
                    //MainActivity.this.tvStatusMessage.setText("Login valido");
                    startActivity(intent);
                } else {
                    MainActivity.this.tvStatusMessage.setText("Login incorrecto");
                }
            }
        });
    }

    public boolean validateUser(String usr, String pwd) {
        return ("Javier".equals(usr) && "Axity".equals(pwd));
    }

}
