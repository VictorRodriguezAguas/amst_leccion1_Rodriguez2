package com.example.amst_l1_rodriguez_espolservicios;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.Sidweb);
        btn2=(Button)findViewById(R.id.Academico);
        btn3=(Button)findViewById(R.id.Vinculos);
        btn4=(Button)findViewById(R.id.Bienestar);
    }

    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId()){
            case R.id.Sidweb:
                intent=new Intent(MainActivity.this,Sidweb.class);
                break;
            case R.id.Academico:
                intent=new Intent(MainActivity.this,Academico.class);

                break;
            case R.id.Vinculos:
                 intent=new Intent(MainActivity.this,Vinculos.class);

                break;
            case R.id.Bienestar:
                 intent=new Intent(MainActivity.this,Bienestar.class);

                break;

        }startActivity(intent);
    }
}
