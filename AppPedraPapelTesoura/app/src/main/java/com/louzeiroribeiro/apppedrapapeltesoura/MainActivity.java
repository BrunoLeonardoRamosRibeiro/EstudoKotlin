package com.louzeiroribeiro.apppedrapapeltesoura;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void selecionarPedra(View view) {
        verificarGanhador("pedra");
    }

    public void selecionarPapel(View view) {
        verificarGanhador("papel");
    }

    public void selecionarTesoura(View view) {
        verificarGanhador("tesoura");
    }

    private void verificarGanhador(String escolhaUsuario) {

        String escolhaApp = geraEscolhaAleatoriaApp();

        TextView textoResultado = findViewById(R.id.text_resultado);

        if (
                (escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
                        (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
                        (escolhaApp == "tesoura" && escolhaUsuario == "papel")
        ) {
            // App é vencedor
            textoResultado.setText("Você perdeu :(");


        } else if (
                (escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
                        (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
                        (escolhaUsuario == "tesoura" && escolhaApp == "papel")
        ) {
            // Usuário venceu
            textoResultado.setText("Você venceu!! :)");
        } else {
            // Empate
            textoResultado.setText("Empatamos ;)");
        }

    }

    private String geraEscolhaAleatoriaApp() {
        String[] opcoes = {"pedra", "papel", "tesoura"};

        int numeroAleatorio = new Random().nextInt(3);

        String escolhaApp = opcoes[numeroAleatorio];

        ImageView imagemApp = findViewById(R.id.image_app);

        switch (escolhaApp) {
            case "pedra":
                imagemApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemApp.setImageResource(R.drawable.tesoura);
                break;

        }

        return escolhaApp;
    }
}