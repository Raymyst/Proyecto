package com.example.pro;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView icono, icono1, icono2, icono3, icono4, icono5, icono6, icono7,icono8, icono9, icono10, icono11, icono12, icono13, icono14;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.texto);
        icono = findViewById(R.id.icono);
        icono1 = findViewById(R.id.icono1);
        icono2 = findViewById(R.id.icono2);
        icono3 = findViewById(R.id.icono3);
        icono4 = findViewById(R.id.icono4);
        icono5 = findViewById(R.id.icono5);
        icono6 = findViewById(R.id.icono6);
        icono7 = findViewById(R.id.icono7);
        icono8 = findViewById(R.id.icono8);
        icono9 = findViewById(R.id.icono9);
        icono10= findViewById(R.id.icono10);
        icono11 = findViewById(R.id.icono11);
        icono12 = findViewById(R.id.icono12);
        icono13 = findViewById(R.id.icono13);
        icono14 = findViewById(R.id.icono14);
        // ... y así sucesivamente para las otras 5 imágenes

        // Asigna un OnClickListener a cada ImageView
        icono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.bird);
                textView.setText("    BIRD");
            }
        });

        icono1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.elefant);
                textView.setText(" ELEFANT");
            }
        });

        icono2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.snake);
                textView.setText("  SNAKE");
            }
        });

        icono3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.dolphin);
                textView.setText("DOLPHIN");
            }
        });

        icono4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.cow);
                textView.setText("    COW");
            }
        });

        icono5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.tiger);
                textView.setText("TIGER");
            }
        });
        icono6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.chicken);
                textView.setText("CHICKEN");
            }
        });

        icono7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.dog);
                textView.setText("    DOG");
            }
        });
        icono8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.sheep);
                textView.setText("  SHEEP");
            }
        });

        icono9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.kat);
                textView.setText("    CAT");
            }
        });


        icono10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.monkey);
                textView.setText("MONKEY");
            }
        });
        icono11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.leon);
                textView.setText("    LION");
            }
        });

        icono12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.crocodale);
                textView.setText("CROCODALE");
            }
        });
        icono13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.pig);
                textView.setText("   PIG");
            }
        });

        icono14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.horse);
                textView.setText("  HORSE");
            }
        });


        // Repite lo anterior para las otras 5 imágenes, cambiando el recurso de sonido

    }

    private void playSound(int soundResource) {
        mediaPlayer = MediaPlayer.create(this, soundResource);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
            }
        });
    }
}