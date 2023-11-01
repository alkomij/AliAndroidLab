package algon.cst2335.ALi;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    /**This holds the text at the center of the screen*/
    private TextView tv = null;
    /**This holds the password at the below position of the TextView*/
    private EditText et = null;
    /**This hold the Login button in the down of the page*/
    private Button bt = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editText);
        Button bt = findViewById(R.id.button);

        bt.setOnClickListener(clk -> {
            String password = et.getText().toString();
            boolean isPasswordComplex = checkPasswordComplexity(password);

            if (isPasswordComplex){
                tv.setText("Your password meets the requirements");
            }else {
                tv.setText("You shall not pass!");
            }
        });
    }

    Boolean checkPasswordComplexity(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialSymbol = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("#$%^&*!@?".contains(String.valueOf(c))) {
                hasSpecialSymbol = true;
            }
        }

        if (!hasUpperCase) {
            showToast("Your password does not have an upper case letter");
            return false;
        } else if (!hasLowerCase) {
            showToast("Your password does not have a lower case letter");
            return false;
        } else if (!hasDigit) {
            showToast("Your password does not have a number");
            return false;
        } else if (!hasSpecialSymbol) {
            showToast("Your password does not have a special symbol (#$%^&*!@?)");
            return false;
        }


        return true; //only get here if they're all true

    }

    private boolean isSpecialCharacter(char c){
        switch (c){
            case '#':
            case '*':
            case '?':
            case '!':
            case '@':
            case '$':
            case '%':
            case '^':
            case '&':
                return true;
            default:
                return false;
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}