package by.minsler;

import java.io.Serializable;

/**
 * User: dzmitry.misiuk
 * Date: 1/30/13
 * Time: 4:03 PM
 */
public class Problem implements Serializable {

    private static final long serialVersionUID = -5107365079495451445L;

    private String question;
    private String answer;

    public Problem(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }


    public String getAnswer() {
        return answer;
    }


    public boolean isCorrect(String answer) {
        return this.answer.equalsIgnoreCase(answer);
    }
}