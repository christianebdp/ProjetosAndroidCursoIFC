package duastelas.com.br.projetoduastelas;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    private static final String TAG = "TESTE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Log.d(TAG, "Passou pelo CREATE Tela 2");

        Intent intent = getIntent();
        int valor1 = intent.getIntExtra("valor1", 0);
        int valor2 = intent.getIntExtra("valor2", 0);
        boolean somar = intent.getBooleanExtra("somar", false);

        if (somar) {

            int total = valor1 + valor2;

            // Mostrar uma mensagem na tela para o usuário
            AlertDialog.Builder dialogo = new AlertDialog.Builder(SegundaActivity.this);
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

        Log.d("TESTE", "Passou pelo START Tela 2");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("TESTE", "Passou pelo RESUME Tela 2");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }

        Toast.makeText(SegundaActivity.this, "RESUME Tela 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("TESTE", "Passou pelo PAUSE Tela 2");
        Toast.makeText(SegundaActivity.this, "PAUSE Tela 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("TESTE", "Passou pelo STOP Tela 2");
        Toast.makeText(SegundaActivity.this, "STOP Tela 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("TESTE", "Passou pelo RESTART Tela 2");
        Toast.makeText(SegundaActivity.this, "RESTART Tela 2", Toast.LENGTH_LONG).show();
    }
}
