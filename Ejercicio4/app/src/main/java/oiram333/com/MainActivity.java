package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText et1,et2;
    private TextView tv3;
    private RadioButton rb1,rb2;

    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tv3=(TextView) findViewById(R.id.tv3);
        rb1=(RadioButton) findViewById(R.id.rbtn1);
        rb2=(RadioButton) findViewById(R.id.rbtn2);
        btnCalcular=(Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int val1,val2,suma,resta;
        String resultado;
        val1 = Integer.parseInt(et1.getText().toString());
        val2 = Integer.parseInt(et2.getText().toString());

        if(rb1.isChecked()==true){
            suma = val1+val2;
            resultado = String.valueOf(suma);
            tv3.setText(resultado);
        }else if(rb2.isChecked()==true){
            resta = val1-val2;
            resultado = String.valueOf(resta);
            tv3.setText(resultado);
        }
    }
}