package com.neesia.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bangunruang extends AppCompatActivity {
    EditText textsisi, texthasil;
    Button btnhitung;
    Double sisi, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangunruang);

        textsisi = (EditText) findViewById(R.id.txtsisi);
        texthasil = (EditText) findViewById(R.id.txthasil);
        btnhitung = (Button) findViewById(R.id.btnhitung);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strsisi =((EditText) textsisi).getText().toString();

                if (!textsisi.equals("")){
                    sisi= Double.parseDouble(strsisi);
                    hasil = sisi*sisi*sisi;
                    texthasil.setText(""+hasil);
                }

            }
        });
    }
}
