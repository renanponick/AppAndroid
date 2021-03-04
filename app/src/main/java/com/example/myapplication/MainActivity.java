package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String CATEGORIA = "SENAC";
    EditText tFirstNum, tSecondNum;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calculadora);

        res = (TextView) findViewById(R.id.result);
        tFirstNum = (EditText) findViewById(R.id.tFirstNum);
        tSecondNum = (EditText) findViewById(R.id.tSecondNum);

        Button btSom = (Button) findViewById(R.id.btSom);
        Button btSub = (Button) findViewById(R.id.btSub);
        Button btDiv = (Button) findViewById(R.id.btDiv);
        Button btMul = (Button) findViewById(R.id.btMult);

        btSom.setOnClickListener(onClickSom());
        btSub.setOnClickListener(onClickSub());
        btDiv.setOnClickListener(onClickMul());
        btMul.setOnClickListener(onClickDiv());
    }

    private View.OnClickListener onClickSom(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v){
                float fNum = Float.parseFloat(tFirstNum.getText().toString());
                float sNum = Float.parseFloat(tSecondNum.getText().toString());
                res.setText(String.valueOf(fNum+sNum));
            }
        };
    }
    private View.OnClickListener onClickSub(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v){
                float fNum = Float.parseFloat(tFirstNum.getText().toString());
                float sNum = Float.parseFloat(tSecondNum.getText().toString());
                res.setText(String.valueOf(fNum-sNum));
            }
        };
    }
    private View.OnClickListener onClickDiv(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v){
                float fNum = Float.parseFloat(tFirstNum.getText().toString());
                float sNum = Float.parseFloat(tSecondNum.getText().toString());
                res.setText(String.valueOf(fNum*sNum));
            }
        };
    }
    private View.OnClickListener onClickMul(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v){
                float fNum = Float.parseFloat(tFirstNum.getText().toString());
                float sNum = Float.parseFloat(tSecondNum.getText().toString());
                res.setText(String.valueOf(fNum/sNum));
            }
        };
    }
}
