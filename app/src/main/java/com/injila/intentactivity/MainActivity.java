package com.injila.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnActivity2,btnActivity3;
    EditText etfirstname,etlastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity2 = findViewById(R.id.btnActivity2);
        btnActivity3 = findViewById(R.id.btnActivity3);
        etfirstname = findViewById(R.id.etfirstname);
        etlastname = findViewById(R.id.etlastname);

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etfirstname.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter firstname", Toast.LENGTH_SHORT).show();
                }else if(etlastname.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter lastname", Toast.LENGTH_SHORT).show();
                }else{
//                    grab data
                    String firstname = etfirstname.getText().toString().trim();
                    String lastname = etlastname.getText().toString().trim();

                    String fullname = firstname + " " + lastname;
//                    loadt intent with data

                    Intent intent = new Intent(MainActivity.
                            this,com.injila.intentactivity.Main2Activity.class);
//                    intent.putExtra()- loads the intent with data
//                    takes a hash table as its argument
                    intent.putExtra("data", fullname);
                    startActivity(intent);

                }

            }
        });
    }
}
