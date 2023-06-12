package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;
    private Spinner spinner;
    private Button btnCalcular;

    String []opciones={"sumar","restar","multiplicar","dividir"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tv3=(TextView) findViewById(R.id.tv3);
        btnCalcular=(Button) findViewById(R.id.btnCalcular);
        spinner=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);

        btnCalcular.setOnClickListener(this::calcular);
    }

    public void calcular(View v){
        float val1,val2;
        String resultado,selec = spinner.getSelectedItem().toString();

        val1=Float.parseFloat(et1.getText().toString());
        val2=Float.parseFloat(et2.getText().toString());

        if(selec.equals("sumar")){
            float suma = val1+val2;
            resultado = String.valueOf(suma);
            tv3.setText(resultado);
        }else if(selec.equals("restar")){
            float restar = val1-val2;
            resultado = String.valueOf(restar);
            tv3.setText(resultado);
        }else if(selec.equals("multiplicar")){
            float multiplicar = val1*val2;
            resultado = String.valueOf(multiplicar);
            tv3.setText(resultado);
        }else if(selec.equals("dividir")){
            float dividir = val1/val2;
            resultado = String.valueOf(dividir);
            tv3.setText(resultado);
        }
    }
}