package com.example.rafli201011401338;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;





public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText user;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.Button);
        user = (EditText)findViewById(R.id.textUsername);
        pass = findViewById(R.id.textPassword);

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String nama = user.getText().toString();
                        String sandi = pass.getText().toString();
                        if (nama.equals("rafli") && sandi.equals("unpam")) {
                            Intent i = new Intent(MainActivity.this, MainActivity3.class);
                            startActivity(i);
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Username atau Password salah!",Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                }
        );
    }
}
