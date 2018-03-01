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

        EditText n = (EditText) findViewById(R.id.etName);
        RadioButton h0 = (RadioButton) findViewById(R.id.button0help);
        RadioButton h1 = (RadioButton) findViewById(R.id.button1help);
        RadioButton h2 = (RadioButton) findViewById(R.id.button2help);
        RadioButton h3 = (RadioButton) findViewById(R.id.button3help);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        n.setText(prefs.getString("username", ""));
        h0.setChecked(prefs.getBoolean("help0", false));
        h1.setChecked(prefs.getBoolean("help1", false));
        h2.setChecked(prefs.getBoolean("help2", false));
        h3.setChecked(prefs.getBoolean("help3", true));
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
