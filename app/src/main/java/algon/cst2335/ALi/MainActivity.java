package algon.cst2335.ALi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    Switch sw;
    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );
//        Log.d( TAG, "Message");
//        Log.v( TAG, "Message");
//        Log.i( TAG, "Message");
//        Log.e( TAG, "Message");
        Button loginbotton= findViewById(R.id.button);
        loginbotton.setOnClickListener( clk-> {
            Intent nextPage = new Intent( MainActivity.this, SecondActivity.class);
            EditText emailEditText = findViewById(R.id.emailEditText);
            nextPage.putExtra( "EmailAddress", emailEditText.getText().toString() );


            startActivity( nextPage);
        } );

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

    }
}