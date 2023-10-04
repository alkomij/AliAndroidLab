// Generated by view binder compiler. Do not edit!
package algon.cst2335.ALi.databinding;

import algon.cst2335.ALi.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final CheckBox checkBox;

  @NonNull
  public final ImageButton myImageButton;

  @NonNull
  public final ImageView myImageView;

  @NonNull
  public final Switch mySwitch;

  @NonNull
  public final EditText myedittext;

  @NonNull
  public final RadioGroup radioButton;

  @NonNull
  public final RadioButton radioButtonNo;

  @NonNull
  public final RadioButton radioButtonYes;

  @NonNull
  public final TextView textView;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button button,
      @NonNull CheckBox checkBox, @NonNull ImageButton myImageButton,
      @NonNull ImageView myImageView, @NonNull Switch mySwitch, @NonNull EditText myedittext,
      @NonNull RadioGroup radioButton, @NonNull RadioButton radioButtonNo,
      @NonNull RadioButton radioButtonYes, @NonNull TextView textView) {
    this.rootView = rootView;
    this.button = button;
    this.checkBox = checkBox;
    this.myImageButton = myImageButton;
    this.myImageView = myImageView;
    this.mySwitch = mySwitch;
    this.myedittext = myedittext;
    this.radioButton = radioButton;
    this.radioButtonNo = radioButtonNo;
    this.radioButtonYes = radioButtonYes;
    this.textView = textView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.checkBox;
      CheckBox checkBox = ViewBindings.findChildViewById(rootView, id);
      if (checkBox == null) {
        break missingId;
      }

      id = R.id.myImageButton;
      ImageButton myImageButton = ViewBindings.findChildViewById(rootView, id);
      if (myImageButton == null) {
        break missingId;
      }

      id = R.id.myImageView;
      ImageView myImageView = ViewBindings.findChildViewById(rootView, id);
      if (myImageView == null) {
        break missingId;
      }

      id = R.id.mySwitch;
      Switch mySwitch = ViewBindings.findChildViewById(rootView, id);
      if (mySwitch == null) {
        break missingId;
      }

      id = R.id.myedittext;
      EditText myedittext = ViewBindings.findChildViewById(rootView, id);
      if (myedittext == null) {
        break missingId;
      }

      id = R.id.radioButton;
      RadioGroup radioButton = ViewBindings.findChildViewById(rootView, id);
      if (radioButton == null) {
        break missingId;
      }

      id = R.id.radioButtonNo;
      RadioButton radioButtonNo = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonNo == null) {
        break missingId;
      }

      id = R.id.radioButtonYes;
      RadioButton radioButtonYes = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonYes == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, button, checkBox, myImageButton,
          myImageView, mySwitch, myedittext, radioButton, radioButtonNo, radioButtonYes, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}