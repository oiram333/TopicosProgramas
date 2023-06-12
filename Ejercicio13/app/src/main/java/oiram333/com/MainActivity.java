package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private Button btnLanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.etWeb);
        btnLanzar=(Button) findViewById(R.id.btnVer);

        btnLanzar.setOnClickListener(this::ver);
    }

    private void ver(View view) {
        Intent verWeb = new Intent(this, ActiDos.class);
        verWeb.putExtra("dirección",et1.getText().toString());
        startActivity(verWeb);
    }
}