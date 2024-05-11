package com.example.semana07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GreenActivity extends AppCompatActivity {
    TextView txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_green);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnRegresarOrange = findViewById(R.id.btnRegresarGreen);
        btnRegresarOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Bundle extras = getIntent().getExtras();
        String txt = (String)extras.get("DATA_FRASES_CELEBRES");

        txtData = findViewById(R.id.txtDataGreen);
        txtData.setText(txt);
    }
}