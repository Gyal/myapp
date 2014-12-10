package fr.iut.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActiviteB extends MyActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("lifestyle", "passed by onCreateClasseB()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        // Création d'un bouton
        Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startMyActivity();
            }
        });

    }

    protected void startMyActivity(){
        Intent intent = new Intent(getApplicationContext(), MyActivity.class);
        startActivity(intent);
    }

    }

