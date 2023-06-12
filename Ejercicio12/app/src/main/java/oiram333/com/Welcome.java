package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnBack=(Button) findViewById(R.id.btn2);

        btnBack.setOnClickListener(this::salir);
    }

    private void salir(View view) {
        finish();
    }
}