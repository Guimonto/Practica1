package sdm.pract1.whowantstobeamillionaire;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
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
    private int ind; /*Indice*/
    private int points; /*Puntos*/
    private int correct; /*Respuesta correcta*/

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
        points = R.string.price0; correct = 0;

        b1.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        b2.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        b3.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        b4.setBackgroundColor(getResources().getColor(R.color.colorGrey));

        /*Obtenemos la lista de preguntas*/
        questions = generateQuestionList();
        /*Indice de preguntas*/
        ind = 0;
        /*Mostramos por pantalla la primera pregunta*/
        assingation(ind);
    }

    private void game(){
        /*Si el indice es menor o igual que 15 incrementamos una unidad*/
        if(ind <= 15) ind++;
        else {
            /*Partida finalizada*/
            ind = 0;
        }
        /*Habilitamos los botones*/
        b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
        /*Dejamos el color original*/
        b1.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        b2.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        b3.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        b4.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        /*Ejecutamos la siguiente pregunta*/
        assingation(ind);
    }

    public void assingation(int index){
        int a = index;
        switch (a) {
            case 0:
                play_for.setText(R.string.price100);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 1:
                play_for.setText(R.string.price200);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 2:
                play_for.setText(R.string.price300);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 3:
                play_for.setText(R.string.price500);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 4:
                play_for.setText(R.string.price1000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 5:
                play_for.setText(R.string.price2000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 6:
                play_for.setText(R.string.price4000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 7:
                play_for.setText(R.string.price8000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 8:
                play_for.setText(R.string.price16000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 9:
                play_for.setText(R.string.price32000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 10:
                play_for.setText(R.string.price64000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 11:
                play_for.setText(R.string.price125000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 12:
                play_for.setText(R.string.price250000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 13:
                play_for.setText(R.string.price500000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;

            case 14:
                play_for.setText(R.string.price1000000);
                number_question.setText(questions.get(a).getNumber());
                current_question.setText(questions.get(a).getText());
                b1.setText(questions.get(a).getAnswer1());
                b2.setText(questions.get(a).getAnswer2());
                b3.setText(questions.get(a).getAnswer3());
                b4.setText(questions.get(a).getAnswer4());
                break;
        }
    }

    public void clickButtons(View v){
        correct = Integer.parseInt(questions.get(ind).getRight());
        switch (v.getId()){
            case R.id.option1:
                if (correct == 1){
                    points = points + 100;
                    b1.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    b2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b4.setBackgroundColor(getResources().getColor(R.color.colorRed));

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            game();
                        }
                    },3000);
                }
                else{
                    b1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b2.setEnabled(false);b3.setEnabled(false);b4.setEnabled(false);
                }
                break;
            case R.id.option2:
                if (correct == 2) {
                    points = points + 100;
                    b2.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    b1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b4.setBackgroundColor(getResources().getColor(R.color.colorRed));

                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            game();
                        }
                    },3000);
                }
                else{
                    b2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b1.setEnabled(false);b3.setEnabled(false);b4.setEnabled(false);
                }
                break;

            case R.id.option3:
                if (correct == 3) {
                    points = points + 100;
                    b3.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    b1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b4.setBackgroundColor(getResources().getColor(R.color.colorRed));

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            game();
                        }
                    },3000);
                }
                else {
                    b3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b1.setEnabled(false);b2.setEnabled(false);b4.setEnabled(false);
                }
                break;

            case R.id.option4:
                if (correct == 4) {
                    points = points + 100;
                    b4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    b1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    b3.setBackgroundColor(getResources().getColor(R.color.colorRed));

                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            game();
                        }
                    },3000);
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
                if(Integer.parseInt(questions.get(ind).getFifty1()) == 1 && Integer.parseInt(questions.get(ind).getFifty2()) == 2) {
                    b1.setEnabled(false); b2.setEnabled(false);
                } else {
                    if (Integer.parseInt(questions.get(ind).getFifty1()) == 1 && Integer.parseInt(questions.get(ind).getFifty2()) == 3) {
                        b1.setEnabled(false); b3.setEnabled(false);
                    } else {
                        if (Integer.parseInt(questions.get(ind).getFifty1()) == 1 && Integer.parseInt(questions.get(ind).getFifty2()) == 4) {
                            b1.setEnabled(false); b4.setEnabled(false);
                        } else {
                            if (Integer.parseInt(questions.get(ind).getFifty1()) == 2 && Integer.parseInt(questions.get(ind).getFifty2()) == 3) {
                                b2.setEnabled(false); b3.setEnabled(false);
                            } else {
                                if (Integer.parseInt(questions.get(ind).getFifty1()) == 2 && Integer.parseInt(questions.get(ind).getFifty2()) == 4) {
                                    b2.setEnabled(false); b4.setEnabled(false);
                                } else {
                                    if (Integer.parseInt(questions.get(ind).getFifty1()) == 3 && Integer.parseInt(questions.get(ind).getFifty2()) == 4) {
                                        b3.setEnabled(false); b4.setEnabled(false);
                                    }
                                }
                            }
                        }
                    }
                }
                findViewById(R.id.menu_fifty).setEnabled(false);
                break;

            case R.id.menu_people:
                if(Integer.parseInt(questions.get(ind).getAudience()) == 1) {
                    b1.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                } else {
                    if(Integer.parseInt(questions.get(ind).getAudience()) == 2) {
                        b2.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                    }
                    else {
                        if(Integer.parseInt(questions.get(ind).getAudience()) == 3) {
                            b3.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                        }
                        else {
                            if(Integer.parseInt(questions.get(ind).getAudience()) == 4) {
                                b4.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                            }
                        }
                    }
                }
                findViewById(R.id.menu_people).setEnabled(false);
                break;

            case R.id.menu_phone:
                if(Integer.parseInt(questions.get(ind).getPhone()) == 1) {
                    b1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                } else {
                    if(Integer.parseInt(questions.get(ind).getPhone()) == 2) {
                        b2.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                    else {
                        if(Integer.parseInt(questions.get(ind).getPhone()) == 3) {
                            b3.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                        }
                        else {
                            if(Integer.parseInt(questions.get(ind).getPhone()) == 4) {
                                b4.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }
                    }
                }
                findViewById(R.id.menu_phone).setEnabled(false);
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
                "Who was the third James Bond actor in the MGM films? (Do not include &apos;Casino Royale&apos?",
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
