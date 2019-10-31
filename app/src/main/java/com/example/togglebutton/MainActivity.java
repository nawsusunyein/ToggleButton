package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ToggleButton toggleBtn1 = (ToggleButton) findViewById(R.id.toggle1);
        final ToggleButton toggleBtn2 = (ToggleButton) findViewById(R.id.toggle2);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Toggle Button 1 : " + toggleBtn1.getText().toString() + "\n" + "Toggle Button 2 : " + toggleBtn2.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
