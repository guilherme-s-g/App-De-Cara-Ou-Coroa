package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity
{
    private Button buttonVoltar;
    private ImageView imageResultado;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Bundle dados = getIntent().getExtras();
        numero = dados.getInt("numero");
        buttonVoltar = findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
        imageResultado = findViewById(R.id.imageResultado);
        geradorResultado();
    }
    public void geradorResultado()
    {
        try
        {
            switch (numero)
            {
                case 0: imageResultado.setImageResource(R.drawable.moeda_cara);
                break;
                case 1: imageResultado.setImageResource(R.drawable.moeda_coroa);
                break;
            }
        }
        catch (Exception e)
        {
            System.out.println("Erro");
        }
    }
}