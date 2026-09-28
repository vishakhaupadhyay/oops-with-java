import java.util.LinkedHashMap;
import java.util.Map;

public class mapdemo {
    public static void main(String[] args) {

        Map<Integer, Integer> np = new LinkedHashMap<>();

        np.put(10, 100);
        np.put(19, 98);
        np.put(10, 98);
        np.put(48, 78);
        np.put(90, 24);

        for (Map.Entry<Integer, Integer> i : np.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

        np.remove(19);

        if (np.containsKey(10)) {
            System.out.println("marks of roll no " + np.get(10));
        } else {
            System.out.println("student not found");
        }

        np.put(10, 76);

        for (Map.Entry<Integer, Integer> i : np.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}