package com.neesia.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    private Button persegipanjang;
    private Button lingkaran;
    private Button kubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        persegipanjang = findViewById(R.id.btnpersegipanjang);
        lingkaran = findViewById(R.id.btnlingkaran);
        kubus = findViewById(R.id.btnkubus);

        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent persegipanjang = new Intent(menu.this, bangundatar1.class);
                startActivity(persegipanjang);
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lingkaran = new Intent(menu.this, bangundatar2.class);
                startActivity(lingkaran);
            }
        });

        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kubus = new Intent(menu.this, bangunruang.class);
                startActivity(kubus);
            }
        });
    }
}
