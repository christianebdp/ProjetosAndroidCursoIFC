package duastelas.com.br.projetoduastelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TESTE";
    private static final boolean DEBUG = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // onCreate nativo da plataforma
        super.onCreate(savedInstanceState);

        // relacionando nosso layout com a nossa activity
        setContentView(R.layout.activity_main);

        if(DEBUG) {
            Log.d(TAG, "Passou pelo CREATE Tela 1");
        }

        // Buscando os componentes pelo seu ID
        final EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        final Button buttonSaudacoes = (Button) findViewById(R.id.buttonSaudacao);
        final Button buttonAbrirTela2 = (Button) findViewById(R.id.buttonAbrirTela2);
        final Button buttonSomar = (Button) findViewById(R.id.buttonSomar);
        final EditText editTextNum1 = (EditText) findViewById(R.id.editTextNum1);
        final EditText editTextNum2 = (EditText) findViewById(R.id.editTextNum2);

        buttonSaudacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Conteúdo do campo de texto
                String nome = editTextNome.getText().toString();

                // Mostrar uma mensagem na tela para o usuário
                Toast.makeText(MainActivity.this, "Oi " + nome +
                        "! Parabéns pelo seu primeiro app!", Toast.LENGTH_LONG).show();
            }
        });

        buttonAbrirTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Abrir a tela 2
                Intent tela2 = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(tela2);
            }
        });

        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tela2 = new Intent(MainActivity.this, SegundaActivity.class);

                // Passar valores para segunda Tela
                tela2.putExtra("valor1", Integer.parseInt(editTextNum1.getText().toString()));
                tela2.putExtra("valor2", Integer.parseInt(editTextNum2.getText().toString()));
                tela2.putExtra("somar", true);

                // Abrir a tela 2
                startActivity(tela2);
            }
        });
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

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }

        Toast.makeText(MainActivity.this, "RESUME Tela 1", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Passou pelo PAUSE Tela 1");
        Toast.makeText(MainActivity.this, "PAUSE Tela 1", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Passou pelo STOP Tela 1");
        Toast.makeText(MainActivity.this, "STOP Tela 1", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Passou pelo RESTART Tela 1");
        Toast.makeText(MainActivity.this, "RESTART Tela 1", Toast.LENGTH_LONG).show();
    }
}
