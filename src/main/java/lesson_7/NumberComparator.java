package lesson_7;

public class NumberComparator {

    public NumberComparator() {}

    public int compare(int a, int b) {
        if (a < b) return -1;
        if (a > b) return 1;
        return 0;
    }
}
