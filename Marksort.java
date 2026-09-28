import java.util.ArrayList;
import java.util.Collections;

public class Marksort {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(92);
        marks.add(65);
        marks.add(88);
        marks.add(71);

        System.out.println("Original marks: " + marks);

        Collections.sort(marks);
        System.out.println("Ascending order: " + marks);

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("Descending order: " + marks);
    }
}

