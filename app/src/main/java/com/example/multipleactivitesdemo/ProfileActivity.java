package com.example.multipleactivitesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private Button signout;
    private TextView usernameview;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "ProfileActivity resumed." );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "ProfileActivity started." );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "ProfileActivity stopped." );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "ProfileActivity destroyed." );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        signout = findViewById(R.id.signout_button);

        usernameview = findViewById(R.id.profile_username);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String username = extras.getString("username");
        Log.d("==>", "username from intent:" + username);

        usernameview.setText(username);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Signing out");
                finish(); //aktiviteten är färdig
            }
        });
    }
}