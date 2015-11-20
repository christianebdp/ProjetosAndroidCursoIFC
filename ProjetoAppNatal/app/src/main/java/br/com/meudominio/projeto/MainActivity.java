package br.com.meudominio.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TESTE";
    private static final boolean DEBUG = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Passou pelo CREATE Main");
    }

    public void avancar(View v) {

        // Abrir próxima tela
        Intent tela1 = new Intent(MainActivity.this, Tela1.class);
        startActivity(tela1);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Passou pelo START Main");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Passou pelo RESUME Main");

        if (DEBUG) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }

            Toast.makeText(MainActivity.this, "RESUME Main", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Passou pelo PAUSE Main");

        if (DEBUG) {
            Toast.makeText(MainActivity.this, "PAUSE Main", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Passou pelo STOP Main");

        if (DEBUG) {
            Toast.makeText(MainActivity.this, "STOP Main", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Passou pelo RESTART Main");

        if (DEBUG) {
            Toast.makeText(MainActivity.this, "RESTART Main", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Passou pelo DESTROY Main");

        if (DEBUG) {
            Toast.makeText(MainActivity.this, "DESTROY Main", Toast.LENGTH_LONG).show();
        }
    }
}
