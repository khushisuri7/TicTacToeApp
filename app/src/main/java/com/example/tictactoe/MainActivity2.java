package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText player1Name;
    private EditText player2Name;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
      player1Name=findViewById(R.id.player1);
      player2Name=findViewById(R.id.player2);
      String player1 =player1Name.getText().toString();
      String player2 =player2Name.getText().toString();

    button2=findViewById(R.id.button2);
           button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity2.this,MainActivity.class);
             intent.putExtra("PLAYER_NAMES",new String[]{player1,player2});
            startActivity(intent);
        }
    });

    }
}
