package by.minsler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: dzmitry.misiuk
 * Date: 1/30/13
 * Time: 4:17 PM
 */
@ManagedBean(name = "qaBean")
@SessionScoped
public class QuestionAnswerBean implements Serializable {
    private static final long serialVersionUID = 6590213052010052031L;

    private int currentProblem;
    private int tries;
    private int score;
    private String answer;
    private String correctAnswer;
    private List<Problem> problems;

    public QuestionAnswerBean() {
        problems = new ArrayList<Problem>();
        problems.add(new Problem("your name", "minsler"));
        problems.add(new Problem("your age", "25"));
        problems.add(new Problem("you operation system", "linux"));
    }

    public String getQuestion() {
        return problems.get(currentProblem).getQuestion();
    }

    public String getAnswer() {
        return answer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getScore() {
        return score;
    }

    public int getTries() {
        return tries;
    }

    public String startOverAction() {
        System.out.println("start over " + tries);
        Collections.shuffle(problems);
        score = 0;
        currentProblem = 0;
        tries = 0;
        answer = "";
        return "startOver";
    }


    public String answerAction() {
        tries++;
        System.out.println(tries);
        if (problems.get(currentProblem).isCorrect(answer)) {
            score++;
            nextProblem();
            if (currentProblem == problems.size()) {
                return "done";
            } else {
                return "success";
            }
        } else if (tries == 1) {
            return "again";
        } else {
            nextProblem();
            if (currentProblem == problems.size()) {
                return "done";
            } else {
                return "failure";
            }
        }
    }

    private void nextProblem() {
        correctAnswer = problems.get(currentProblem).getAnswer();
        currentProblem++;
        tries = 0;
        answer = "";
    }
}