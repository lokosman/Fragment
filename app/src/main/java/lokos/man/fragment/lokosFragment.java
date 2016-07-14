package lokos.man.fragment;



import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class lokosFragment extends DialogFragment {

    public lokosFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("!!! Ooops You Have To Register");
        builder.setMessage("In other to add comment here");
        builder.setNegativeButton(R.string.error, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "I was click", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               startActivity(new Intent(getActivity(), ActivitySub.class));
            }
        });

        Dialog dialog = builder.create();
        return dialog;
    }
}
