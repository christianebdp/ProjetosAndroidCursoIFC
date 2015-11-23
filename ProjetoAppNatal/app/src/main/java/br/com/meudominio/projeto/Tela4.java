package br.com.meudominio.projeto;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Tela4 extends AppCompatActivity {

    private static final String TAG = "TESTE";
    private static final boolean DEBUG = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
        Log.d(TAG, "Passou pelo CREATE Tela 4");

        Intent intent = getIntent();
        int valor1 = intent.getIntExtra("valor1", 0);
        int valor2 = intent.getIntExtra("valor2", 0);
        boolean somar = intent.getBooleanExtra("somar", false);

        if (savedInstanceState != null) {
            somar = false;
        }

        if (somar) {

            int total = valor1 + valor2;

            // Mostrar uma mensagem na tela para o usuário
            AlertDialog.Builder dialogo = new AlertDialog.Builder(Tela4.this);
            // setando título
            dialogo.setTitle("Resultado");
            // setando mensagem
            dialogo.setMessage("Soma: " + total);
            // setando botão
            dialogo.setNeutralButton("OK", null);
            // chamando o AlertDialog
            dialogo.show();
        }
    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Passou pelo START Tela 4");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Passou pelo RESUME Tela 4");

        if (DEBUG) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }

            Toast.makeText(Tela4.this, "RESUME Tela 4", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Passou pelo PAUSE Tela 4");

        if (DEBUG) {
            Toast.makeText(Tela4.this, "PAUSE Tela 4", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Passou pelo STOP Tela 4");

        if (DEBUG) {
            Toast.makeText(Tela4.this, "STOP Tela 4", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Passou pelo RESTART Tela 4");

        if (DEBUG) {
            Toast.makeText(Tela4.this, "RESTART Tela 4", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Passou pelo DESTROY Tela 4");

        if (DEBUG) {
            Toast.makeText(Tela4.this, "DESTROY Tela 4", Toast.LENGTH_LONG).show();
        }
    }
}
