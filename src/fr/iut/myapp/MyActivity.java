package fr.iut.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("Lifecycle", "passed by onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startMyActivity();
            }
        });
    }


    protected void startMyActivity(){
        Intent intent = new Intent(getApplicationContext(), ActiviteB.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        Log.i("Lifecycle", "passed by onStart()");
        super.onStart();

    }

    @Override
    protected void onResume() {
        Log.i("Lifecycle", "passed by onResume()");
        super.onResume();

    }

    @Override
    protected void onPause() {
        Log.i("Lifecycle", "passed by onPause()");
        super.onPause();

    }

    @Override
    protected void onStop() {
        Log.i("Lifecycle", "passed by onStop()");
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.i("Lifecycle", "passed by onDestroy()");
        super.onDestroy();

    }
}

