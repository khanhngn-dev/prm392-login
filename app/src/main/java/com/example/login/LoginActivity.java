package com.example.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_instagram);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button = findViewById(R.id.login_button);
        EditText usernameInput = findViewById(R.id.email_input);
        EditText passwordInput = findViewById(R.id.password_input);
        button.setOnClickListener(v -> {
            String message;
            if (usernameInput.getText().toString().equals("admin") && passwordInput.getText().toString().equals("123456"))
            {
                message = "Login successfully";
            } else {
                message = "Login failed";
            }
            Snackbar snackbar = Snackbar.make(findViewById(R.id.main), message, Snackbar.LENGTH_SHORT);
            snackbar.show();
        });
    }
}