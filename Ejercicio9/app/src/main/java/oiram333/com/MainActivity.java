package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et1;
    private Button btn1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.et1);
        btn1=(Button) findViewById(R.id.btn1);

        num=(int) (Math.random()*100001);
        String cadena = String.valueOf(num);
        Toast notificacion=Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();

        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String valorIntegrado=et1.getText().toString();
        int valor = Integer.parseInt(valorIntegrado);

        if(valor==num){
            Toast notificacion=Toast.makeText(this,"Muy bien recordaste el numero",Toast.LENGTH_LONG);
            notificacion.show();
        }else{
            Toast notifiacaiones=Toast.makeText(this,"Lo siento pero este no es el numero",Toast.LENGTH_LONG);
            notifiacaiones.show();
        }
    }
}