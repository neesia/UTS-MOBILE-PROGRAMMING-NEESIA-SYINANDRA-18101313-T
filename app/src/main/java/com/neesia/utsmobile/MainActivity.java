package com.neesia.utsmobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.EditText;
    import android.widget.Toast;

    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText txtusername;
    private EditText txtpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtusername = (EditText) findViewById(R.id.txtusername);
        txtpassword = (EditText) findViewById(R.id.txtpassword);
    }

    public void checkLogin(View arg0){

        final String emailedittext = txtusername.getText().toString();
        final String passedittext = txtpassword.getText().toString();
        if (emailedittext.equals("18101313") && passedittext.equals("18101313")){
            //jika login berhasil
            Toast.makeText(getApplicationContext(), "Anda berhasil Login!",Toast.LENGTH_SHORT).show();
            Intent menu = new Intent(MainActivity.this, menu.class);
            MainActivity.this.startActivity(menu);
            finish();
        }else {
            //jika login gagal
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Username atau Password Anda Salah!").setNegativeButton("Retry", null).create().show();
        }
    }
}
