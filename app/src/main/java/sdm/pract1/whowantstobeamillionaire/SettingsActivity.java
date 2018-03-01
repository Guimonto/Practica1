package sdm.pract1.whowantstobeamillionaire;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        ((EditText) findViewById(R.id.etName)).setText(prefs.getString("username", ""));
        ((RadioButton) findViewById(R.id.button0help)).setChecked(prefs.getBoolean("help0", false));
        ((RadioButton) findViewById(R.id.button1help)).setChecked(prefs.getBoolean("help1", false));
        ((RadioButton) findViewById(R.id.button2help)).setChecked(prefs.getBoolean("help2", false));
        ((RadioButton) findViewById(R.id.button3help)).setChecked(prefs.getBoolean("help3", true));
    }

    @Override
    protected  void onPause(){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("username", ((EditText) findViewById(R.id.etName)).getText().toString());
        editor.putBoolean("help0", ((RadioButton) findViewById(R.id.button0help)).isChecked());
        editor.putBoolean("help1", ((RadioButton) findViewById(R.id.button1help)).isChecked());
        editor.putBoolean("help2", ((RadioButton) findViewById(R.id.button2help)).isChecked());
        editor.putBoolean("help3", ((RadioButton) findViewById(R.id.button3help)).isChecked());

        editor.apply();
        super.onPause();
    }
}
