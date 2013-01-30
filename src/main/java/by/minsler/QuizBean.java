package by.minsler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: dzmitry.misiuk
 * Date: 1/30/13
 * Time: 12:37 PM
 */
@ManagedBean(name = "quizBean")
@ViewScoped
public class QuizBean implements Serializable {


    private int currentIndex;
    private int score;
    private List<ProblemBean> problems = new ArrayList<ProblemBean>();

    public QuizBean() {
        problems.add(new ProblemBean(new int[]{1, 1, 2, 3, 5}, 8));
        problems.add(new ProblemBean(new int[]{1, 1, 1, 1, 1}, 1));
        problems.add(new ProblemBean(new int[]{1, 2, 4, 9}, 25));
        problems.add(new ProblemBean(new int[]{0, 0, 0, 0, 0}, 0));
    }

    public void setProblems(List<ProblemBean> problems) {
        this.problems = problems;
        score = 0;
        currentIndex = 0;
    }

    public int getScore() {
        return score;
    }

    public ProblemBean getCurrentProblem() {
        return problems.get(currentIndex);
    }

    public String getAnswer() {
        return "";
    }

    public void setAnswer(String answer) {
        try {
            int a = Integer.parseInt(answer);
            if (getCurrentProblem().getSolution() == a) {
                score++;
            }
            currentIndex = (currentIndex + 1) % problems.size();
        } catch (NumberFormatException e) {
            System.out.println("bad number format: " + answer);
        }
    }
}