package br.com.meudominio.projeto;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela3 extends AppCompatActivity {

    private static final String TAG = "TESTE";
    private static final boolean DEBUG = false;

    public static final String PREFS_NAME = "MyPrefsFile";

    private EditText editTextNum1;
    private EditText editTextNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        Log.d(TAG, "Passou pelo CREATE Tela 3");

        final Button buttonSomar = (Button) findViewById(R.id.buttonSomar);
        editTextNum1 = (EditText) findViewById(R.id.editTextNum1);
        editTextNum2 = (EditText) findViewById(R.id.editTextNum2);

        // Regravar dados, se caso for necessário
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        String num1 = settings.getString("num1", new String());
        String num2 = settings.getString("num2", new String());

        if (!num1.equals(new String()) && !num2.equals(new String())) {
            editTextNum1.setText(num1);
            editTextNum2.setText(num2);
        }

        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tela4 = new Intent(Tela3.this, Tela4.class);

                // Passar valores para a próxima tela
                tela4.putExtra("valor1", Integer.parseInt(editTextNum1.getText().toString()));
                tela4.putExtra("valor2", Integer.parseInt(editTextNum2.getText().toString()));
                tela4.putExtra("somar", true);

                // Abrir a tela 4
                startActivity(tela4);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Passou pelo START Tela 3");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Passou pelo RESUME Tela 3");

        if (DEBUG) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }

            Toast.makeText(Tela3.this, "RESUME Tela 3", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Passou pelo PAUSE Tela 3");

        if (DEBUG) {
            Toast.makeText(Tela3.this, "PAUSE Tela 3", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Passou pelo STOP Tela 3");

        if (DEBUG) {
            Toast.makeText(Tela3.this, "STOP Tela 3", Toast.LENGTH_LONG).show();
        }

        // Este método faz com que, quando a aplicação for interrompida,
        // seja inserido um valor na Preference
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();

        // Carrega os valores nas preferênicas
        editor.putString("num1", editTextNum1.getText().toString());
        editor.putString("num2", editTextNum2.getText().toString());

        // Salvar os valores
        editor.commit();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Passou pelo RESTART Tela 3");

        if (DEBUG) {
            Toast.makeText(Tela3.this, "RESTART Tela 3", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Passou pelo DESTROY Tela 3");

        if (DEBUG) {
            Toast.makeText(Tela3.this, "DESTROY Tela 3", Toast.LENGTH_LONG).show();
        }
    }
}
