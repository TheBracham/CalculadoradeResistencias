package com.example.calculadoraderesistencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Resistencia_Serie extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private TextView tv1;
    private Spinner spinnerA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistencia__serie);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        tv1=(TextView)findViewById(R.id.tv1);

        spinnerA = (Spinner)findViewById(R.id.spinner2);
        String[]opciones={"Ω", "kΩ", "MΩ"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spinnerA.setAdapter(adapter);
    }

    public void ResistenciasS(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String valor3 = et3.getText().toString();
        String valor4 = et4.getText().toString();

        int r1=Integer.parseInt(valor1);
        int r2=Integer.parseInt(valor2);
        int r3=Integer.parseInt(valor3);
        int r4=Integer.parseInt(valor4);

        String selec=spinnerA.getSelectedItem().toString();

        //***Operacion***//

        if(selec.equals("Ω")){
            double ress=r1+r2+r3+r4;
            String resu=String.valueOf(ress);
            tv1.setText(resu);
        }else if(selec.equals("kΩ")){
            double ress2=1000*(r1+r2+r3+r4);
            String resu=String.valueOf(ress2);
            tv1.setText(resu);
        }else if(selec.equals("MΩ")){
            double ress3=100000*(r1+r2+r3+r4);
            String resu=String.valueOf(ress3);
            tv1.setText(resu);
        }



    }

}
