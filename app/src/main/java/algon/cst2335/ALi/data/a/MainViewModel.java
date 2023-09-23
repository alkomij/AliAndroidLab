package algon.cst2335.ALi.data.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> editString = new MutableLiveData<>();
    private MutableLiveData<Boolean> isSelected = new MutableLiveData<>();

    public LiveData<String> getEditString() {
        return editString;
    }

    public void setEditString(String value) {
        editString.setValue(value);
    }

    public LiveData<Boolean> getIsSelectedLiveData() {
        return isSelected;
    }

    public void setIsSelected(boolean value) {
        isSelected.setValue(value);
    }
}