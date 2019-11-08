package com.example.amst_l1_rodriguez_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

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
        switch (view.getId()){
            case btn1.setId(R.id.Sidweb)
                break;
            case btn2.setId(R.id.Academico)
                break;
            case btn3.setId(R.id.Vinculos)
                break;
            case btn4.setId(R.id.Bienestar)
                break;

        }
    }
}
