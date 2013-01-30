package by.minsler;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * User: dzmitry.misiuk
 * Date: 1/30/13
 * Time: 12:25 PM
 */
public class ProblemBean implements Serializable {

    private ArrayList<Integer> list;
    private int solution;

    public ProblemBean() {
    }

    public ProblemBean(int[] values, int solution) {
        this.solution = solution;
        list = new ArrayList<Integer>();
        for (int i : values) {
            list.add(i);
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }
}