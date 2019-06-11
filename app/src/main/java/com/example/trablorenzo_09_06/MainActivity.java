package com.example.trablorenzo_09_06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quant = 0;
    double valor = 0;

    public void cafe_mais(View view) {
        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);

        quant++;
        x.setText("Quantidade: " + quant);
        valor = valor + 4;
        y.setText("Valor Total: R$" + valor);
    }

    public void cafe_menos(View view) {

        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);

        if (quant > 0 && valor > 0) {
            quant--;
            x.setText("Quantidade: " + quant);
            valor = valor - 4;
            y.setText("Valor Total: R$" + valor);
        }
    }



    public void cafeLeite_mais(View view) {
        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);

        quant++;
        x.setText("Quantidade: " + quant);
        valor = valor + 5;
        y.setText("Valor Total: R$" + valor);
    }

    public void cafeLeite_menos(View view) {

        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);

        if (quant > 0 && valor > 0) {
            quant--;
            x.setText("Quantidade: " + quant);
            valor = valor - 5;
            y.setText("Valor Total: R$" + valor);
        }
    }



    public void cafeNewba_mais(View view) {
        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);

        quant++;
        x.setText("Quantidade: " + quant);
        valor = valor + 10;
        y.setText("Valor Total: R$" + valor);
    }

    public void cafeNewba_menos(View view) {

        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);

        if (quant > 0 && valor > 0) {
            quant--;
            x.setText("Quantidade: " + quant);
            valor = valor - 10;
            y.setText("Valor Total: R$" + valor);
        }
    }


}
