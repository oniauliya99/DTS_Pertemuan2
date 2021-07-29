package com.example.aplikasiminmax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextAngka1;
    EditText editTextAngka2;
    TextView textViewHasil;
    Button btnHasil;

    float angka1;
    float angka2;
    String hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAngka1 =  findViewById(R.id.editTextAngka1);
        editTextAngka2 = findViewById(R.id.editTextAngka2);
        textViewHasil = findViewById(R.id.labelHasil);
        btnHasil = findViewById(R.id.btnHasil);


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1 = Float.parseFloat(editTextAngka1.getText().toString()) ;
                angka2 = Float.parseFloat(editTextAngka2.getText().toString()) ;

                if(angka1!=angka2){
                    if (angka1>angka2){
                        hasil= angka1 +" Lebih besar daripada "+angka2;
                    }else {
                        hasil= angka1 +" Lebih kecil daripada "+angka2;
                    }
                }else{
                    hasil= angka1 +" sama dengan "+angka2;
                }

                textViewHasil.setText( String.valueOf(hasil) );

            }
        });
    }

}