package com.example.multipleactivitesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button signin;
    private EditText username;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "MainActivity resumed." );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "MainActivity started." );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "MainActivity stopped." );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MainActivity destroyed." );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>", "MainActivity created." );


        username = findViewById(R.id.signin_name);

        signin = findViewById(R.id.signin_button);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Onclick detected");
                Log.d("==>", "username:"+username.getText().toString());
                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("username", username.getText().toString());

                startActivity(intent);
                Log.d("==>", "Intent worked." );
            }

        });
    }
}