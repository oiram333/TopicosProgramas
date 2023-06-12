package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail;
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail=(EditText) findViewById(R.id.etEmail);
        btn1=(Button) findViewById(R.id.btn1);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        etEmail.setText(prefe.getString("mail",""));

        btn1.setOnClickListener(this::confirmar);
    }

    private void confirmar(View view) {
        SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("mail", etEmail.getText().toString());
        editor.commit();
        finish();
    }
}