package org.xhin.days3navigition.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.xhin.days3navigition.R;

import java.util.Locale;

public class login_activity extends AppCompatActivity {
    Button btnLogin;
    EditText etUsername, etPassword;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etPassword.getText().toString().toUpperCase(Locale.ROOT).equals("ABI")){
                    login_succes();

                }else
                {
                    Toast.makeText(getApplicationContext(), "Mohon periksa kembali password anda!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    private void login_succes(){
        String user_login = etUsername.getText().toString();
        Intent i = new Intent(this,MainActivity.class);

        //send username to homepage
        i.putExtra("Username",user_login);
        startActivity(i);

    }
}