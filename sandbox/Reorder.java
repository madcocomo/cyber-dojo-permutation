import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        ArrayList<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        result.add(list);
        if (list.size() == 2) {
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(list.get(1));
            newList.add(list.get(0));
            result.add(newList);
        }
        return result;
    }
}
