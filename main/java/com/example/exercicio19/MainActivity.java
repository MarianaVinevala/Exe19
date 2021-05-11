package com.example.exercicio19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edt);
        txt1=findViewById(R.id.txts);
        txt2=findViewById(R.id.txtd);
        txt3=findViewById(R.id.txth);

    }
    public  void OnClick(View v)
    {

        int ht = Integer.parseInt(editText.getText().toString());
        txt1.setText((ht/24/7) + " Semanas ");
        txt2.setText((ht%(24*7)/24) + " Dias ");
        txt3.setText((ht%(24*7))%24 + " Horas ");
    }
}
