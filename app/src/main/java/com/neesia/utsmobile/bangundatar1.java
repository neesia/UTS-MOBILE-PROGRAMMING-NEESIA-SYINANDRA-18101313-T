package com.neesia.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bangundatar1 extends AppCompatActivity {
    EditText textpanjang, textlebar, texthasilluas, texthasilkeliling;
    Button btnhitung;
    Double panjang, lebar, keliling, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangundatar1);

        textpanjang = (EditText) findViewById(R.id.txtpanjang);
        textlebar = (EditText) findViewById(R.id.txtlebar);
        texthasilluas = (EditText) findViewById(R.id.txthasilluas);
        texthasilkeliling = (EditText) findViewById(R.id.txthasilkeliling);
        btnhitung = (Button) findViewById(R.id.btnhitung);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strpanjang =((EditText) textpanjang).getText().toString();
                String strlebar = ((EditText)textlebar).getText().toString();

                if (!textpanjang.equals("") && !textlebar.equals("")){
                    panjang = Double.parseDouble(strpanjang);
                    lebar = Double.parseDouble(strlebar);

                    luas = panjang*lebar;
                    texthasilluas.setText("" + luas);
                    keliling = 2*(panjang+lebar);
                    texthasilkeliling.setText(""+keliling);
                }

            }
        });
    }
}
