package lokos.man.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by lokos on 12/07/2016.
 */
public class customFragment extends DialogFragment {
    Button button;
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getActivity(), "Hey am from custom fragment", Toast.LENGTH_SHORT).show();
        }
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       LayoutInflater inf = LayoutInflater.from(getActivity());
        View v = inf.inflate(R.layout.fragment_custom,container,false);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = (Button) view.findViewById(R.id.bttn_ok);
        button.setOnClickListener(listener);
    }
}
