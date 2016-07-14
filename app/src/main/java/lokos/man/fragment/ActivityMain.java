package lokos.man.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMain extends AppCompatActivity {

    lokosFragment frag;
    customFragment custom;
    Button bttn;
    Button bttnCustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      bttn = (Button) findViewById(R.id.bttn);
        bttnCustom = (Button) findViewById(R.id.button);
       // frag = new lokosFragment();
       // FragmentManager manager = getSupportFragmentManager();
      //  FragmentTransaction trans = manager.beginTransaction();
      //  trans.add(R.id.rootLayout,frag,"LokosFragment");
      //  trans.commit();

    }

    public void Click(View view) {
        frag = new lokosFragment();
        frag.show(getSupportFragmentManager(),"lokosFragment");
    }

    public void custom(View view) {
        custom = new customFragment();
       custom.show(getSupportFragmentManager(),"customFragment");
    }
}
