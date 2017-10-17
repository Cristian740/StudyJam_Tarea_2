package com.example.cristian.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double numero1,numero2,resultado;
    String operador;
    String tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickigual(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("*"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("/"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(resultado.toString());
    }


    //numeros
    public void onClickuno(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "1");
    }

    public void onClickdos(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "2");
    }


    public void onClicktres(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "3");
    }

    public void onClickcuatro(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "4");
    }

    public void onClickcinco(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "5");
    }

    public void onClickseis(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "6");
    }

    public void onClicksiete(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "7");
    }

    public void onClickocho(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "8");
    }

    public void onClicknueve(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "9");
    }

    public void onClickcero(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + "0");
    }

    public void onClickpunto(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText(tv.getText() + ".");
    }

    public void onClickrestar(View view) {
        operador="-";
        CapturaPrimerNumero(view);
    }

    public void onClicksumar(View view) {
        operador="+";
        CapturaPrimerNumero(view);
    }

    public void onClickmultiplicar(View view) {
        operador="*";
        CapturaPrimerNumero(view);
    }

    public void onClickdividir(View view) {
        operador="/";
        CapturaPrimerNumero(view);
    }

    private void CapturaPrimerNumero(View view) {
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        //guardamos el numero que este en la caja de texto
        numero1 = Double.parseDouble(tv.getText().toString());
        //ponemos la pantalla vacia
        tv.setText("");
    }

    public void onClickborrar(View view) {
        //inicializacion de las variables
        numero1=0.0;
        numero2=0.0;
        //borra la caja de texto
        TextView tv = (TextView) findViewById(R.id.txtnumero) ;
        tv.setText("");
    }
}
