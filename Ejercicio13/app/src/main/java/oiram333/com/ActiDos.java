package oiram333.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ActiDos extends AppCompatActivity {
    private WebView web1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acti_dos);

        web1=(WebView) findViewById(R.id.WebView1);
        btn1=(Button) findViewById(R.id.btn1);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("dirección");
        web1.loadUrl("http://"+dato);

        btn1.setOnClickListener(this::btnBack);
    }

    private void btnBack(View view) {
        finish();
    }
}