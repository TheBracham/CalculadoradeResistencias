package com.example.calculadoraderesistencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Resistencia_Paralela extends AppCompatActivity {

    private EditText et5;
    private EditText et6;
    private EditText et7;
    private EditText et8;
    private TextView tv2;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistencia__paralela);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        et5=(EditText)findViewById(R.id.et5);
        et6=(EditText)findViewById(R.id.et6);
        et7=(EditText)findViewById(R.id.et7);
        et8=(EditText)findViewById(R.id.et8);
        tv2=(TextView)findViewById(R.id.tv2);

        spinner2 = (Spinner)findViewById(R.id.spinner2);
        String[]opciones={"Ω", "kΩ", "MΩ"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spinner2.setAdapter(adapter);

    }

    public void ResistenciaP(View view){
        String valor1 = et5.getText().toString();
        String valor2 = et6.getText().toString();
        String valor3 = et7.getText().toString();
        String valor4 = et8.getText().toString();

        double r5=Double.parseDouble(valor1);
        double r6=Double.parseDouble(valor2);
        double r7=Double.parseDouble(valor3);
        double r8=Double.parseDouble(valor4);

        String selec=spinner2.getSelectedItem().toString();

        //***Operacion***//


        if(selec.equals("Ω")){
            double resp=1/(1/r5+1/r6+1/r7+1/r8);
            String resu=String.valueOf(resp);
            resu=resu +"Ω";
            tv2.setText(resu);
        }else if(selec.equals("kΩ")){
            double resp2=1/(1/r5+1/r6+1/r7+1/r8);
            String resu=String.valueOf(resp2);
            resu=resu +"Ω";
            tv2.setText(resu);
        }else if(selec.equals("MΩ")) {
            double resp3 = 1 / (1 / r5 + 1 / r6 + 1 / r7 + 1 / r8);
            String resu = String.valueOf(resp3);
            resu = resu + "Ω";
            tv2.setText(resu);
        }
    }

    public void recargarP(View view)
    {
        if(view.getId()==R.id.tv1);
        tv2.setText("Resultado borrado zukulentamente");
    }

}
