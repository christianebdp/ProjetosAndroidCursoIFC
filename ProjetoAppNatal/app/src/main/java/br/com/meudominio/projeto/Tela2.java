package br.com.meudominio.projeto;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class Tela2 extends AppCompatActivity {

    private static final String TAG = "TESTE";
    private static final boolean DEBUG = false;

    private static final String NOEL = "HOU, HOU, HOU, HOU";
    private Button buttonSayHoHoHo;
    private Button buttonSay;
    private EditText editTextSay;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Log.d(TAG, "Passou pelo CREATE Tela 2");

        buttonSayHoHoHo = (Button) findViewById(R.id.buttonSayHoHoHo);
        buttonSay = (Button) findViewById(R.id.buttonSay);
        editTextSay = (EditText) findViewById(R.id.editTextSay);

        textToSpeech = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.ENGLISH);
                }
            }
        });

        buttonSay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = editTextSay.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        buttonSayHoHoHo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), NOEL, Toast.LENGTH_SHORT).show();
                textToSpeech.speak(NOEL, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
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

        if(textToSpeech !=null){
            textToSpeech.stop();
            textToSpeech.shutdown();
        }

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
