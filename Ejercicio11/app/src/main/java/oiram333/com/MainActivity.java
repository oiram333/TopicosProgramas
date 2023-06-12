package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAcercaDe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAcercaDe=(Button) findViewById(R.id.btnLanza);

        btnAcercaDe.setOnClickListener(this::lanzar);
    }

    private void lanzar(View view) {
        Intent ventanAcercaDe = new Intent(this,AcercaDe.class);
        startActivity(ventanAcercaDe);
    }
}