package sdm.pract1.whowantstobeamillionaire;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    @Override
    protected  void onPause(){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("username", ((EditText) findViewById(R.id.etName)).getText().toString());
        editor.putBoolean("help0", findViewById(R.id.button0help).isSelected());
        editor.putBoolean("help1", findViewById(R.id.button1help).isSelected());
        editor.putBoolean("help2", findViewById(R.id.button2help).isSelected());
        editor.putBoolean("help3", findViewById(R.id.button3help).isSelected());

        editor.apply();
        super.onPause();
    }

}
