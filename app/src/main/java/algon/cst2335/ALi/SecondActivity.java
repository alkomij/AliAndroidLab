package algon.cst2335.ALi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent fromPrevious = getIntent();
        String emailAddress = fromPrevious.getStringExtra("EmailAddress");
        TextView textview = findViewById(R.id.textView);
        textview.setText("Welcome back " + emailAddress);
        EditText ed = findViewById(R.id.editTextPhone);
        Button callbotton = findViewById(R.id.button2);
        callbotton.setOnClickListener( clk-> {
            String phoneNumber = ed.getText().toString();
            Intent call = new Intent(Intent.ACTION_DIAL);
            call.setData(Uri.parse("tel:" + phoneNumber));
            startActivity(call);
        } );
    }
}