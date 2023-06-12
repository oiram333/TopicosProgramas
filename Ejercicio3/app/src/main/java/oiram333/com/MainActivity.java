package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //Inicializamos los componentes.
    EditText et1,et2;
    Button btnSumar;
    TextView et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Referenciamos los componentes mediante su ID.
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(TextView) findViewById(R.id.et3);
        btnSumar=(Button) findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(this);
    }

    //Metodo en el cual se realiza la operación.
    @Override
    public void onClick(View v) {
        //Convertimos los Strings a valor numérico.
        int valor1 = Integer.parseInt(et1.getText().toString());
        int valor2 = Integer.parseInt(et2.getText().toString());
        int r = valor1+valor2;
        //Mostramos el resultado en pantalla.
        et3.setText("El resultado es: "+r);
    }
}
