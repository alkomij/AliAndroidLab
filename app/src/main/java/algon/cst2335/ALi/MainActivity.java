package algon.cst2335.ALi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This is the main activity for the password complexity checker app.
 *
 * @author Ali Komijani
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {

    /** This holds the text at the center of the screen */
    private TextView tv = null;

    /** This holds the text at the center of the screen */
    private EditText et = null;

    /** This holds the text at the center of the screen */
    private Button btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        et = findViewById(R.id.editText);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(clk -> {
            String password = et.getText().toString();

            checkPasswordComplexity(password);
        });
    }

    /**
     * Checks the complexity of a password and displays a Toast message indicating which criteria are missing.
     *
     * @param password The password to be checked for complexity.
     * @return true if the password meets the complexity criteria, false otherwise.
     */
    private boolean checkPasswordComplexity(String password) {
        boolean foundUpperCase, foundLowerCase, foundNumber, foundSpecial;
        foundUpperCase = foundLowerCase = foundNumber = foundSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                foundUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                foundLowerCase = true;
            } else if (Character.isDigit(c)) {
                foundNumber = true;
            } else if (isSpecialCharacter(c)) {
                foundSpecial = true;
            }
        }

        if (!foundUpperCase) {
            Toast.makeText(this, "Your password does not have an upper case letter", Toast.LENGTH_LONG).show();
            return false;
        } else if (!foundLowerCase) {
            Toast.makeText(this, "Your password does not have a lower case letter", Toast.LENGTH_LONG).show();
            return false;
        } else if (!foundNumber) {
            Toast.makeText(this, "Your password does not have a number", Toast.LENGTH_LONG).show();
            return false;
        } else if (!foundSpecial) {
            Toast.makeText(this, "Your password does not have a special symbol (@#$%^&*!)", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }

    /**
     * Checks if a character is a special character (#$%^&*!@?).
     *
     * @param c The character to be checked.
     * @return true if the character is a special character, false otherwise.
     */
    private boolean isSpecialCharacter(char c) {
        switch (c) {
            case '#':
            case '$':
            case '%':
            case '^':
            case '&':
            case '*':
            case '!':
            case '@':
            case '?':
                return true;
            default:
                return false;
        }
    }
}
