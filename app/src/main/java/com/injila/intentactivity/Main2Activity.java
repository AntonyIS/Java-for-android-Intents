package com.injila.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button btnActivityMain;
    TextView tvResults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        tvResults.setVisibility(View.GONE);

        btnActivityMain = findViewById(R.id.btnActivityMain);
        tvResults = findViewById(R.id.tvResults);

//        grab data from activity2
        String fullname = getIntent().getStringExtra("data");
        System.out.println(fullname);

        tvResults.setText(fullname);


        btnActivityMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,
                        com.injila.intentactivity.MainActivity.class );
                startActivity(intent);
            }
        });
//        tvResults.setVisibility(View.VISIBLE);
    }
}
