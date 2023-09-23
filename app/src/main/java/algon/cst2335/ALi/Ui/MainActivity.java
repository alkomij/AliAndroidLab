package algon.cst2335.ALi.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import algon.cst2335.ALi.data.a.MainViewModel;
import algon.cst2335.ALi.databinding.ActivityMainBinding;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    private MainViewModel model;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());

        model = new ViewModelProvider(this).get(MainViewModel.class);

        // Find and initialize the ImageButton
        imageButton = variableBinding.myImageButton;

        // Observe changes in the LiveData
        model.getEditString().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                variableBinding.myedittext.setText("Your edit text has: " + s);
            }
        });

        variableBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editTextValue = variableBinding.myedittext.getText().toString();
                model.setEditString(editTextValue);
            }
        });

        model.getIsSelectedLiveData().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean selected) {
                variableBinding.checkBox.setChecked(selected);
                variableBinding.radioButtonYes.setChecked(selected);
                variableBinding.radioButtonNo.setChecked(!selected);
                variableBinding.mySwitch.setChecked(selected);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int width = imageButton.getWidth();
                int height = imageButton.getHeight();
                String toastMessage = "The width = " + width + " and height = " + height;
                Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
