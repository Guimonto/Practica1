package sdm.pract1.whowantstobeamillionaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){

            case R.id.menu_about:
                Intent about = new Intent(this, AboutActivity.class);
                startActivity(about);
        }
        return super.onOptionsItemSelected(item);
    }

    public void clickButtons(View v){
        switch (v.getId()){

            case R.id.ibPlay:
                Intent play = new Intent(this, GameActivity.class);
                startActivity(play);
                break;

            case R.id.ibScore:
                Intent score = new Intent(this, ScoreActivity.class);
                startActivity(score);
                break;

            case R.id.ibSettings:
                Intent settings = new Intent(this, SettingsActivity.class);
                startActivity(settings);
                break;
        }
    }
}