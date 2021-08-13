package com.example.loginpagetask1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText login_name,login_password;
    Button login_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_name = findViewById(R.id.login_name);
        login_password = findViewById(R.id.login_pswd);
        login_bt = findViewById(R.id.login_btn);

        login_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validUser()) {
                    if (login_name.getText().toString().trim().equals("ADMIN") && login_password.getText().toString().trim().equals("0000")) {
                        adminLogin();
                    }
                    else if (login_name.getText().toString().trim().equals("kajal") && login_password.getText().toString().equals("1234")) {
                        userLogin();
                    }
                    else if (login_name.getText().toString().trim().equals("khushi") && login_password.getText().toString().equals("1111")) {
                        userLogin();
                    }
                    else if (login_name.getText().toString().trim().equals("kat") && login_password.getText().toString().equals("4444")) {
                        userLogin();
                    }
                    else if (login_name.getText().toString().trim().equals("kevin") && login_password.getText().toString().equals("1010")) {
                        userLogin();
                    }
                    else if (login_name.getText().toString().trim().equals("jay") && login_password.getText().toString().equals("2020")) {
                        userLogin();
                    }
                }
            }
        });
    }

    private void userLogin() {
        Intent intent = new Intent(LoginActivity.this,RecyclerviewActivity.class);
        startActivity(intent);
    }

    private void adminLogin() {

        Intent intent = new Intent(LoginActivity.this,ListviewActivity.class);
        startActivity(intent);
    }

    private boolean validUser() {
        if (login_name.getText().toString().isEmpty() && login_password.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Enter Details",Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
