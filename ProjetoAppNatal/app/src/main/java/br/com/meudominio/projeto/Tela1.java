package br.com.meudominio.projeto;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {

    private static final String TAG = "TESTE";
    private static final boolean DEBUG = false;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        Log.d(TAG, "Passou pelo CREATE Tela 1");

        // Inicializar o RadioGroup
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupLinguagem);
        radioGroup.clearCheck();
    }

    public void avancar(View v) {

        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());

        if (radioButton.getText().toString().equals("English")) {
            // Abrir a tela em ENGLISH - Tela 2
            Intent tela2 = new Intent(Tela1.this, Tela2.class);
            startActivity(tela2);
        } else {
            // Abrir a tela em PORTUGUÊS - Tela 3
            Intent tela3 = new Intent(Tela1.this, Tela3.class);
            startActivity(tela3);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Passou pelo START Tela 1");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Passou pelo RESUME Tela 1");

        if (DEBUG) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }

            Toast.makeText(Tela1.this, "RESUME Tela 1", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Passou pelo PAUSE Tela 1");

        if (DEBUG) {
            Toast.makeText(Tela1.this, "PAUSE Tela 1", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Passou pelo STOP Tela 1");

        if (DEBUG) {
            Toast.makeText(Tela1.this, "STOP Tela 1", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Passou pelo RESTART Tela 1");

        if (DEBUG) {
            Toast.makeText(Tela1.this, "RESTART Tela 1", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Passou pelo DESTROY Tela 1");

        if (DEBUG) {
            Toast.makeText(Tela1.this, "DESTROY Tela 1", Toast.LENGTH_LONG).show();
        }
    }
}
