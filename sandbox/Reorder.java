import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        ArrayList<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        result.add(list);
        if (list.size() == 2) {
            result.add(exchange(list));
        }
        return result;
    }
    
    public static List<Integer> exchange(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>();
        if (!list.get(0).equals(list.get(1))) {
            newList.add(list.get(1));
            newList.add(list.get(0));
        }
        return newList;
    }
}