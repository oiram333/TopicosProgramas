package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv3;
    private Button btnCalcular;
    private CheckBox checkSumar, checkRestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        checkSumar=(CheckBox) findViewById(R.id.checkSumar);
        checkRestar=(CheckBox) findViewById(R.id.checkRestar);
        tv3=(TextView) findViewById(R.id.tv3);
        btnCalcular=(Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this::calcular);
    }

    public void calcular(View v){
        float val1,val2,suma,resta;
        String resuSuma, resuResta;

        val1=Float.parseFloat(et1.getText().toString());
        val2=Float.parseFloat(et2.getText().toString());

        if(checkSumar.isChecked()==true && checkRestar.isChecked()==true){
            suma = val1+val2;
            resuSuma = String.valueOf(suma);
            resta = val1 - val2;
            resuResta = String.valueOf(resta);
            tv3.setText("El resultado de la suma es: "+resuSuma+"\n y el resultado de la resta es: "+resuResta);
        } else if(checkRestar.isChecked()==true){
            resta = val1 - val2;
            resuResta = String.valueOf(resta);
            tv3.setText(resuResta);
        }else if(checkSumar.isChecked()==true){
            suma = val1+val2;
            resuSuma = String.valueOf(suma);
            tv3.setText(resuSuma);
        }
    }
}