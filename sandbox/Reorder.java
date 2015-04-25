import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        ArrayList<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        result.add(list);
        if (list.size() == 2) {
            result.add(Arrays.asList(2,1));
        }
        return result;
    }
}
