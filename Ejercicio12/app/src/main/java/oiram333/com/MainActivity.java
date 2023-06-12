package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText password;
    private Button btnLanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password=(EditText) findViewById(R.id.etPassword);
        btnLanzar=(Button) findViewById(R.id.btn1);

        btnLanzar.setOnClickListener(this::ventanaDos);
    }

    private void ventanaDos(View view) {
        String pass = password.getText().toString();

        if(pass.equals("abc123")){
            Intent ventaWelcome = new Intent(this, Welcome.class);
            startActivity(ventaWelcome);
        }else{
            Toast notificacion = Toast.makeText(this,"La clave es incorrecta",
                    Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}