package sdm.pract1.whowantstobeamillionaire;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ScoreActivity extends AppCompatActivity {

    List<HighScore> ScoreListUser;
    List<HighScore> ScoreListFriends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TabHost host = (TabHost) findViewById(R.id.my_tab_host);
        host.setup();
        TabHost.TabSpec spec = host.newTabSpec(String.valueOf(R.id.tab1));
        spec.setIndicator("Local", getResources().getDrawable(R.drawable.descarga));
        spec.setContent(R.id.tab1);
        host.addTab(spec);
        spec = host.newTabSpec(String.valueOf(R.id.tab2));
        spec.setIndicator("Friends", getResources().getDrawable(R.drawable.descarga2));
        spec.setContent(R.id.tab2);
        host.addTab(spec);

        ScoreListUser = new ArrayList<>();
        ScoreListUser.addAll(getMockUserScore());

        ScoreListFriends = new ArrayList<>();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.score_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.delete_score:

                AlertDialog.Builder  builder = new AlertDialog.Builder(this);

                builder.setMessage(R.string.delete_score);

                builder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        ScoreListUser.clear();

                    }
                });
        }
    }

    private List<HighScore> getMockUserScore(){
        List<HighScore> result = new ArrayList<>();
        HighScore item;

        item = new HighScore();
        item.setName("Guillermo");
        item.setScoring("1500");
        result.add(item);

        return result;
    }
}
