package br.com.meudominio.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity {

    private static final String TAG = "TESTE";
    private static final boolean DEBUG = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Log.d(TAG, "Passou pelo CREATE Tela 2");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Passou pelo START Tela 2");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Passou pelo RESUME Tela 2");

        if (DEBUG) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }

            Toast.makeText(Tela2.this, "RESUME Tela 2", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Passou pelo PAUSE Tela 2");

        if (DEBUG) {
            Toast.makeText(Tela2.this, "PAUSE Tela 2", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Passou pelo STOP Tela 2");

        if (DEBUG) {
            Toast.makeText(Tela2.this, "STOP Tela 2", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Passou pelo RESTART Tela 2");

        if (DEBUG) {
            Toast.makeText(Tela2.this, "RESTART Tela 2", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Passou pelo DESTROY Tela 2");

        if (DEBUG) {
            Toast.makeText(Tela2.this, "DESTROY Tela 2", Toast.LENGTH_LONG).show();
        }
    }
}
