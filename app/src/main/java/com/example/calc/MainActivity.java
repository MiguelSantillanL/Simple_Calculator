package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_Display;
    private  boolean primer_Btn = true;
    private int Numero1, Numero2, Resultado;
    private char Operador;
    private float Numero_Real;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_Display = findViewById(R.id.tv_Display);
    }

    public void boton_Clear(View view){
        /*
        String aux = "-2.9999543";
        Numero_Real = Float.parseFloat(aux);
        aux = " ";
        aux = String.valueOf(Numero_Real);
        tv_Display.setText(aux);
        */

        tv_Display.setText("0");
        primer_Btn = true;
    }

    public void Sumar(View view){
        String aux;
        aux = tv_Display.getText().toString();
        Numero1 =Integer.parseInt(aux);
        Operador = '+';
        primer_Btn = true;
    }

    public  void Resta(View view){
        String aux;
        aux = tv_Display.getText().toString();
        Numero1 =Integer.parseInt(aux);
        Operador = '-';
        primer_Btn = true;
    }

    public  void Division(View view){
        String aux;
        aux = tv_Display.getText().toString();
        Numero1 =Integer.parseInt(aux);
        Operador = '/';
        primer_Btn = true;
    }

    public  void Mult(View view){
        String aux;
        aux = tv_Display.getText().toString();
        Numero1 =Integer.parseInt(aux);
        Operador = '*';
        primer_Btn = true;
    }

    public void Igual(View view){
        if(!primer_Btn){
            String aux;
            aux = tv_Display.getText().toString();
            Numero2 =Integer.parseInt(aux);
            switch (Operador){
                case '+':
                    Resultado = Numero1 + Numero2;
                    break;
                case '-':
                    Resultado = Numero1 - Numero2;
                    break;
                case '*':
                    Resultado = Numero1 * Numero2;
                    break;
                case '/':
                    if(Numero2 == 0){
                        tv_Display.setText("Error");
                        return;
                    }
                    else
                        Resultado = Numero1 / Numero2;
                    break;
            }

            aux = String.valueOf(Resultado);
            tv_Display.setText(aux);
        }
    }

    public void Btn_Uno(View view){
        String aux;
        if(primer_Btn){
            aux = "1";
            tv_Display.setText(aux);
            primer_Btn = false;
        }
        else{
            aux = tv_Display.getText().toString();
            aux += '1';
            tv_Display.setText(aux);
        }
    }

    public void Btn_Dos(View view){
        String aux;
        if(primer_Btn){
            aux = "2";
            tv_Display.setText(aux);
            primer_Btn = false;
        }
        else{
            aux = tv_Display.getText().toString();
            aux += '2';
            tv_Display.setText(aux);
        }
    }

    public void Btn_Tres(View view){
        String aux;
        if(primer_Btn){
            aux = "3";
            tv_Display.setText(aux);
            primer_Btn = false;
        }
        else{
            aux = tv_Display.getText().toString();
            aux += '3';
            tv_Display.setText(aux);
        }
    }

    public void Btn_Cuatro(View view){
        String aux;
        if(primer_Btn){
            aux = "4";
            tv_Display.setText(aux);
            primer_Btn = false;
        }
        else{
            aux = tv_Display.getText().toString();
            aux += '4';
            tv_Display.setText(aux);
        }
    }

    public void Btn_Cinco(View view){
        String aux;
        if(primer_Btn){
            aux = "5";
            tv_Display.setText(aux);
            primer_Btn = false;
        }
        else{
            aux = tv_Display.getText().toString();
            aux += '5';
            tv_Display.setText(aux);
        }
    }

    public void Btn_Seis(View view){
        String aux;
        if(primer_Btn){
            aux = "6";
            tv_Display.setText(aux);
            primer_Btn = false;
        }
        else{
            aux = tv_Display.getText().toString();
            aux += '6';
            tv_Display.setText(aux);
        }
    }

    public void Btn_Siete(View view){
        String aux;
        if(primer_Btn){
            aux = "7";
            tv_Display.setText(aux);
            primer_Btn = false;
        }
        else{
            aux = tv_Display.getText().toString();
            aux += '7';
            tv_Display.setText(aux);
        }
    }

    public void Btn_Ocho(View view){
        String aux;
        if(primer_Btn){
            aux = "8";
            tv_Display.setText(aux);
            primer_Btn = false;
        }
        else{
            aux = tv_Display.getText().toString();
            aux += '8';
            tv_Display.setText(aux);
        }
    }

    public void Btn_Nueve(View view){
        String aux;
        if(primer_Btn){
            aux = "9";
            tv_Display.setText(aux);
            primer_Btn = false;
        }
        else{
            aux = tv_Display.getText().toString();
            aux += '9';
            tv_Display.setText(aux);
        }
    }

    public void Btn_Cero(View view){
        String aux;
        if(!primer_Btn){
            aux = tv_Display.getText().toString();
            aux += '0';
            tv_Display.setText(aux);
        }
    }




}//Fin de la actividad principal