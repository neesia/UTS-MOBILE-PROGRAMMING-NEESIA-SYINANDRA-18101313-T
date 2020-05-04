package com.neesia.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bangundatar2 extends AppCompatActivity {
    EditText textjarijari, texthasilluas, texthasilkeliling;
    Button btnhitung;
    Double jarijari, keliling, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangundatar2);

        textjarijari = (EditText) findViewById(R.id.txtjarijari);
        texthasilluas = (EditText) findViewById(R.id.txthasilluas);
        texthasilkeliling = (EditText) findViewById(R.id.txthasilkeliling);
        btnhitung = (Button) findViewById(R.id.btnhitung);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strjarijari =((EditText) textjarijari).getText().toString();

                if (!textjarijari.equals("")){
                    jarijari = Double.parseDouble(strjarijari);
                    luas = 3.14*jarijari*jarijari;
                    texthasilluas.setText("" + luas);
                    keliling = 2*3.14*jarijari;
                    texthasilkeliling.setText(""+keliling);
                }

            }
        });
    }
}
