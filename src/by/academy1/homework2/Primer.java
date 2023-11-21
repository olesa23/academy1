package by.academy1.homework2;

public class Primer {
    public static void main(String[] args) {
        int marks[] = {4, 10, 8, 4, 5, 6, 1, 3};
        int m = marks[0] + marks[1];
        for (int i = 1; i < marks.length - 1; i++) {
            if (marks[i] + marks[i + 1] > m)
                m = marks[i] + marks[i + 1];
        }
        System.out.println("m=" + m);
    }
}

