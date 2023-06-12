package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private ImageButton iBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView) findViewById(R.id.tv1);
        iBtn1=(ImageButton) findViewById(R.id.iBtn);
        iBtn1.setOnClickListener(this::click);
    }

    public void click(View v){
        tv1.setText("Llamando...");
    }
}