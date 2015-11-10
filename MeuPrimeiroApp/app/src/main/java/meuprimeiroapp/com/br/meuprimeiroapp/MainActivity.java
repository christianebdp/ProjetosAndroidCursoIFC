package meuprimeiroapp.com.br.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* Quando aplicamos a anotação @Override em um método,
    estamos deixando explícito no código fonte que esse método é uma reescrita.
    Obviamente, essa anotação só pode ser aplicada em métodos reescritos.
    Caso contrário um erro de compilação é gerado.
    A anotação @Override é opcional, mas você deve utilizar ela:
    - primeiro argumento para utilizarmos a anotação @Override é a legibilidade do código,
    pois os métodos reescritos são facilmente identificados na leitura do código fonte.
    - segundo argumento é a verificação realizada pelo compilador nos métodos anotados com Override.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

    /* Diferente de outros paradigmas de programação em que os aplicativos são lançados com um método main(),
    o sistema Android inicia o código em uma instância Activity chamando métodos específicos,
    que correspondem a determinados estágios do seu ciclo de vida.

    Há uma sequência de métodos que iniciam uma Activity
    e uma sequência de métodos que interrompem uma Activity
    */
        // onCreate nativo da plataforma
        super.onCreate(savedInstanceState);

        // relacionando nossa activity com nosso layout
        setContentView(R.layout.activity_main);

        // Buscando os componentes pelo seu ID
        final EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        final Button buttonSaudacao = (Button) findViewById(R.id.buttonSaudacao);

        buttonSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Conteúdo do campo de texto
                String nome = editTextNome.getText().toString();

                // Mostrar uma mensagem na tela para o usuário
                Toast.makeText(MainActivity.this,
                        "Oi " + nome + "! Parabéns pelo seu primeiro app!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
