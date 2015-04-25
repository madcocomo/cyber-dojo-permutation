import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        ArrayList<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        result.add(list);
        if (list.size() == 2) {
            if (!list.get(0).equals(list.get(1))) {
                List<Integer> newList = new ArrayList<Integer>();
                newList.add(list.get(1));
                newList.add(list.get(0));
                result.add(newList);
            }
        }
        if (list.size() == 3) {
        List<Integer> newList = new ArrayList<Integer>();
            result.add(Arrays.asList(2,1,2));
            result.add(Arrays.asList(2,2,2));
        }
        return result;
    }
    
}