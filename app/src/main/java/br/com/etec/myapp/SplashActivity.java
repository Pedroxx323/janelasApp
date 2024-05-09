package br.com.etec.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {
    //declarando variavel global do tipo do componente
    Button btnAbrirLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.splash_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //apresentar a variavel java para a variavel xml
        btnAbrirLogin = findViewById(R.id.btnlogin);
        //criar ação ou evento para o componente (Button)
        btnAbrirLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando o intent com o contexto e a janela a ser aberta
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                //abrir outra janela com o metodo startActivity
                startActivity(intent);
                //fechando janela atual
                finish();
            }
        });
    }
}