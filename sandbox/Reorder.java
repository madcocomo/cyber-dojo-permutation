import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        ArrayList<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        result.add(list);
        if (list.size() == 2) {
            exchange(list);
            result.add(newList);
        }
        return result;
    }
    
    public List<Integer> exchange(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>();
        newList.add(list.get(1));
        newList.add(list.get(0));
    }
}
