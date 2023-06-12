package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcercaDe extends AppCompatActivity {
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        btnSalir=(Button) findViewById(R.id.btnSalir);

        btnSalir.setOnClickListener(this::salir);
    }

    private void salir(View view) {
        finish();
    }
}