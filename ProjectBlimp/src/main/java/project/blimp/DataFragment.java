package project.blimp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Taylor on 3/18/14.
 */

public class DataFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        return inflater.inflate(R.layout.data_fragment, container, false);
    }

    public void setDataFragmentTxt(String string){
        TextView textView = (TextView) getView().findViewById(R.id.data);
        //textView.setText(string);
        textView.setText("made it here");
    }
}