package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private Button btnConfirmar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        btnConfirmar=(Button) findViewById(R.id.btnConfirmar);

        btnConfirmar.setOnClickListener(this::validar);
    }

    private void validar(View view) {
        String clave = et2.getText().toString();
        if(clave.length()==0) {
            Toast notificacion = Toast.makeText(this, "Favor de ingresar una clave", Toast.LENGTH_LONG);
            notificacion.show();
        }else{
            Toast notificacion = Toast.makeText(this, "Espere", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}