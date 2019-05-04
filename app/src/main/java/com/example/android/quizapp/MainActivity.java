package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit answer method is clicked
     */
    public void submit_answer(View v) {

        //Question 1 getting the answer call
        RadioButton apple = (RadioButton) findViewById(R.id.apple);
        boolean answer1 = apple.isChecked();

        answer_to_question1(answer1);

        //Question 2 getting the right answer
        RadioButton answer_is_true = (RadioButton) findViewById((R.id.idTrue));
        boolean answer2 = answer_is_true.isChecked();

        answer_to_question2(answer2);

        //Question 3 getting the right answer
        CheckBox answer_3_1 = (CheckBox) findViewById(R.id.abc_1);
        boolean abc_1 = answer_3_1.isChecked();

        CheckBox answer_3_2 = (CheckBox) findViewById(R.id.is_while);
        boolean $while = answer_3_2.isChecked();

        CheckBox answer_3_3 = (CheckBox) findViewById(R.id.oneAbc);
        boolean oneAbc = answer_3_3.isChecked();

        CheckBox answer_not_1 = (CheckBox) findViewById(R.id.abc);
        boolean abc = answer_not_1.isChecked();

        CheckBox answer_not_2 = (CheckBox) findViewById(R.id.final_1);
        boolean final_1 = answer_not_2.isChecked();

        answer_to_question3(abc, abc_1, $while, final_1, oneAbc);

        //Question 4 getting the right answer
        CheckBox answer_4_1 = (CheckBox) findViewById(R.id.not_mutable);
        boolean not_mutable = answer_4_1.isChecked();

        CheckBox answer_4_2 = (CheckBox) findViewById(R.id.not_data_type);
        boolean not_data_type = answer_4_2.isChecked();
        CheckBox answer_not_4 = (CheckBox) findViewById(R.id.is_mutable);
        boolean is_mutable = answer_not_4.isChecked();

        answer_to_question4(is_mutable, not_mutable, not_data_type);

        //Question 5 getting the right answer
        EditText answer5 = (EditText) findViewById(R.id.isLanguage);
        String isLanguage = answer5.getText().toString();

        answer_to_question5(isLanguage);

        //Question 6 getting the right answer
        RadioButton answer6 = (RadioButton) findViewById(R.id.is_zero);
        boolean is_zero = answer6.isChecked();

        answer_to_question6(is_zero);

        displayMessage();

        score = 0;
    }

    /**
     * This method is to check for the answer of the question1
     *
     * @param answer1
     */
    public void answer_to_question1(boolean answer1) {
        if (answer1) {
            score = score + 1;
        }
    }

    /**
     * This method is to check for the answer of the question2
     *
     * @param answer2
     */
    public void answer_to_question2(boolean answer2) {
        if (answer2) {
            score = score + 1;
        }
    }

    /**
     * This method is to check for the answer of the question3
     *
     * @param answer_a
     * @param answer_b
     * @param answer_c
     * @param answer_d
     * @param answer_e
     */
    public void answer_to_question3(boolean answer_a, boolean answer_b, boolean answer_c, boolean answer_d, boolean answer_e) {
        if (!answer_a && answer_b && answer_c && !answer_d && answer_e) {
            score = score + 3;
        } else if (!answer_a && !answer_b && answer_c && !answer_d && answer_e) {
            score = score + 2;
        } else if (!answer_a && answer_b && !answer_c && !answer_d && answer_e) {
            score = score + 2;
        } else if (!answer_a && answer_b && answer_c && !answer_d && !answer_e) {
            score = score + 2;
        } else if (!answer_a && !answer_b && !answer_c && !answer_d && answer_e) {
            score = score + 1;
        } else if (!answer_a && !answer_b && answer_c && !answer_d && !answer_e) {
            score = score + 1;
        } else if (!answer_a && answer_b && !answer_c && !answer_d && !answer_e) {
            score = score + 1;
        }
    }

    /**
     * This method is to check for the answer of the question4
     *
     * @param answer_a
     * @param answer_b
     * @param answer_c
     */
    public void answer_to_question4(boolean answer_a, boolean answer_b, boolean answer_c) {
        if (!answer_a && answer_b && answer_c) {
            score = score + 2;
        } else if ((!answer_a && !answer_b && answer_c) || (!answer_a && answer_b && !answer_c)) {
            score = score + 1;
        }
    }

    /**
     * This method is to check for the answer of the question5
     *
     * @param answer
     */
    public void answer_to_question5(String answer) {
        if (answer.equalsIgnoreCase("programming language")) {
            score = score + 1;
        }
    }

    public void answer_to_question6(boolean answer) {
        if (answer) {
            score = score + 1;
        }
    }

    /**
     * This method is to display diferent message when the oreder button is pressed
     */
    public void displayMessage() {

        String message;

        if (score <= 3) {
            message = "your score is " + score + "! Try again I know you can do better";

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        } else if (score <= 5) {
            message = "your score is " + score + "! Congratulations!!";

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        } else if (score <= 8) {
            message = "your score is " + score + "! Good Job, you've exceeded my expectation!!";

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }

    }

}
