package com.example.shawn59.myblog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import com.example.shawn59.myblog.model.AuthUser;


public class MainActivity extends AppCompatActivity {

    EditText editLogin;
    EditText editPassword;
    EditText editFIO;

    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // элементы
        editLogin = (EditText) findViewById(R.id.idEditLogin);
        editPassword = (EditText) findViewById(R.id.idEditPassword);
        /*buttonLogin = (Button) findViewById(R.id.idButtonLogin);*/
    }
    //обработчик
    public void onLoginClick(View v) {
        String login = editLogin.getText().toString();
        String password = editPassword.getText().toString();
        if (login != "" && password != "") {
            AuthUser request = new AuthUser();
            request.start(login, password);
        }
    }

    public void onRegPageClick(View v) {
        //перек
        Intent intent = new Intent(this, BlogActivity.class);
        startActivity(intent);
    }
}
