package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String CATEGORIA = "SENAC";
    private int fNum, sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calculadora);

        Button btSom = (Button) findViewById(R.id.btSom);
        Button btSub = (Button) findViewById(R.id.btSub);
        Button btDiv = (Button) findViewById(R.id.btDiv);
        Button btMul = (Button) findViewById(R.id.btMult);

        TextView tFirstNum = (TextView) findViewById(R.id.tFirstNum);
        TextView tSecondNum = (TextView) findViewById(R.id.tSecondNum);

        fNum = Integer.parseInt(tFirstNum.getText().toString());
        sNum = Integer.parseInt(tSecondNum.getText().toString());

        btSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conta(fNum, sNum, 1);
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conta(fNum, sNum, 2);
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conta(fNum, sNum, 3);
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conta(fNum, sNum, 4);
            }
        });

        Log.v(CATEGORIA, "\nTeste");
    }

    private void conta(int fNum, int sNum, int sinal) {
        TextView res = (TextView) findViewById(R.id.resultado);

        if (sinal == 1) {
            res.setText(fNum+sNum);
        } else if (sinal == 2) {
            res.setText(fNum-sNum);
        } else if (sinal == 3) {
            res.setText(fNum/sNum);
        } else {
            res.setText(fNum*sNum);
        }
    }
}
