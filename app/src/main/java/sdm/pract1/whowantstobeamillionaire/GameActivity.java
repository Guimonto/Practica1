package sdm.pract1.whowantstobeamillionaire;

import android.content.Intent;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import sdm.pract1.whowantstobeamillionaire.pojo.Question;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {
//En este espacio solo se pueden crear variables pero NO inicializarlas, porque hace que se cierre la aplicacion

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private List<Question> questions;
    private TextView play_for;
    private TextView number_question;
    private TextView current_question;
    private int ind;
    private int points;
    private int correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        /*Inicializamos aqui las variables*/
        b1 = (Button) findViewById(R.id.option1);
        b2 = (Button) findViewById(R.id.option2);
        b3 = (Button) findViewById(R.id.option3);
        b4 = (Button) findViewById(R.id.option4);
        play_for = (TextView) findViewById(R.id.PF_MN);
        number_question = (TextView) findViewById(R.id.QT_NB);
        current_question = (TextView) findViewById(R.id.question);
        points = 0; correct = 0;

        /*Obtenemos la lista de preguntas*/
        questions = generateQuestionList();
        /*Indice de preguntas*/
        ind = 0;
        /*Mostramos por pantalla la primera pregunta*/
        assingation(ind);
    }

    private void game(){

    }

    public void assingation(int index){
        int a = index;
        play_for.setText("100$");
        number_question.setText(questions.get(a).getNumber());
        current_question.setText(questions.get(a).getText());
        b1.setText(questions.get(a).getAnswer1());
        b2.setText(questions.get(a).getAnswer2());
        b3.setText(questions.get(a).getAnswer3());
        b4.setText(questions.get(a).getAnswer4());
    }

    public void clickButtons(View v){
        correct = Integer.parseInt(questions.get(ind).getRight());
        switch (v.getId()){
            case R.id.option1:
                if (correct == 1){
                    b1.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    b2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b4.setBackgroundColor(getResources().getColor(R.color.colorRed));
                }
                else{
                    b1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b2.setEnabled(false);b3.setEnabled(false);b4.setEnabled(false);
                }
                break;
            case R.id.option2:
                if (correct == 2) {
                    b2.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    b1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b4.setBackgroundColor(getResources().getColor(R.color.colorRed));
                }
                else{
                    b2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b1.setEnabled(false);b3.setEnabled(false);b4.setEnabled(false);
                }
                break;

            case R.id.option3:
                if (correct == 3) {
                    b3.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    b1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b4.setBackgroundColor(getResources().getColor(R.color.colorRed));
                }
                else {
                    b3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b1.setEnabled(false);b2.setEnabled(false);b4.setEnabled(false);
                }
                break;

            case R.id.option4:
                if (correct == 4) {
                    b4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    b1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                }
                else {
                    b4.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.game_menu, menu);

        menu.findItem(R.id.menu_phone).setVisible(true);
        menu.findItem(R.id.menu_fifty).setVisible(true);
        menu.findItem(R.id.menu_people).setVisible(true);

        return true;
    }

   @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){

            case R.id.menu_fifty:
                //Intent about = new Intent(this, AboutActivity.class);
                //startActivity(about);

                b1.setEnabled(false);
                break;

            case R.id.menu_people:
                b2.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                break;

            case R.id.menu_phone:
                b4.setBackgroundColor(getResources().getColor(R.color.colorRed));
                b3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;

            case R.id.menu_cancel:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public List<Question> generateQuestionList() {
        List<Question> list = new ArrayList<Question>();
        Question q = null;

        q = new Question(
                "1",
                "Which is the Sunshine State of the US?",
                "North Carolina",
                "Florida",
                "Texas",
                "Arizona",
                "2",
                "2",
                "2",
                "1",
                "4"
        );
        list.add(q);

        q = new Question(
                "2",
                "Which of these is not a U.S. state?",
                "New Hampshire",
                "Washington",
                "Wyoming",
                "Manitoba",
                "4",
                "4",
                "4",
                "2",
                "3"
        );
        list.add(q);

        q = new Question(
                "3",
                "What is Book 3 in the Pokemon book series?",
                "Charizard",
                "Island of the Giant Pokemon",
                "Attack of the Prehistoric Pokemon",
                "I Choose You!",
                "3",
                "2",
                "3",
                "1",
                "4"
        );
        list.add(q);

        q = new Question(
                "4",
                "Who was forced to sign the Magna Carta?",
                "King John",
                "King Henry VIII",
                "King Richard the Lion-Hearted",
                "King George III",
                "1",
                "3",
                "1",
                "2",
                "3"
        );
        list.add(q);

        q = new Question(
                "5",
                "Which ship was sunk in 1912 on its first voyage, although people said it would never sink?",
                "Monitor",
                "Royal Caribean",
                "Queen Elizabeth",
                "Titanic",
                "4",
                "4",
                "4",
                "1",
                "2"
        );
        list.add(q);

        q = new Question(
                "6",
                "Who was the third James Bond actor in the MGM films? (Do not include &apos;Casino Royale&apos;.)",
                "Roger Moore",
                "Pierce Brosnan",
                "Timothy Dalton",
                "Sean Connery",
                "1",
                "3",
                "3",
                "2",
                "3"
        );
        list.add(q);

        q = new Question(
                "7",
                "Which is the largest toothed whale?",
                "Humpback Whale",
                "Blue Whale",
                "Killer Whale",
                "Sperm Whale",
                "4",
                "2",
                "2",
                "2",
                "3"
        );
        list.add(q);

        q = new Question(
                "8",
                "In what year was George Washington born?",
                "1728",
                "1732",
                "1713",
                "1776",
                "2",
                "2",
                "2",
                "1",
                "4"
        );
        list.add(q);

        q = new Question(
                "9",
                "Which of these rooms is in the second floor of the White House?",
                "Red Room",
                "China Room",
                "State Dining Room",
                "East Room",
                "2",
                "2",
                "2",
                "3",
                "4"
        );
        list.add(q);

        q = new Question(
                "10",
                "Which Pope began his reign in 963?",
                "Innocent III",
                "Leo VIII",
                "Gregory VII",
                "Gregory I",
                "2",
                "1",
                "2",
                "3",
                "4"
        );
        list.add(q);

        q = new Question(
                "11",
                "What is the second longest river in South America?",
                "Parana River",
                "Xingu River",
                "Amazon River",
                "Rio Orinoco",
                "1",
                "1",
                "1",
                "2",
                "3"
        );
        list.add(q);

        q = new Question(
                "12",
                "What Ford replaced the Model T?",
                "Model U",
                "Model A",
                "Edsel",
                "Mustang",
                "2",
                "4",
                "4",
                "1",
                "3"
        );
        list.add(q);

        q = new Question(
                "13",
                "When was the first picture taken?",
                "1860",
                "1793",
                "1912",
                "1826",
                "4",
                "4",
                "4",
                "1",
                "3"
        );
        list.add(q);

        q = new Question(
                "14",
                "Where were the first Winter Olympics held?",
                "St. Moritz, Switzerland",
                "Stockholm, Sweden",
                "Oslo, Norway",
                "Chamonix, France",
                "4",
                "1",
                "4",
                "2",
                "3"
        );
        list.add(q);

        q = new Question(
                "15",
                "Which of these is not the name of a New York tunnel?",
                "Brooklyn-Battery",
                "Lincoln",
                "Queens Midtown",
                "Manhattan",
                "4",
                "4",
                "4",
                "1",
                "3"
        );
        list.add(q);

        return list;
    }
}
