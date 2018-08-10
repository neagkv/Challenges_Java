package src.stringSorter;

import java.util.ArrayList;

public class StringDivide {

    ArrayList<String> first;
    ArrayList<String> second;
    ArrayList<String> last;


    public StringDivide() {
    }

    public StringDivide(ArrayList<String> first, ArrayList<String> second, ArrayList<String> last) {
        this.first = first;
        this.second = second;
        this.last = last;
    }

    public ArrayList<String> getFirst() {
        return first;
    }

    public void setFirst(ArrayList<String> first) {
        this.first = first;
    }

    public ArrayList<String> getSecond() {
        return second;
    }

    public void setSecond(ArrayList<String> second) {
        this.second = second;
    }

    public ArrayList<String> getLast() {
        return last;
    }

    public void setLast(ArrayList<String> last) {
        this.last = last;
    }
}
