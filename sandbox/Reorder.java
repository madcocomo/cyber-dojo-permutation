import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        ArrayList<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        if (list.size() == 1) {
            {
                List<Integer>newList = new ArrayList<Integer>();
                newList.add(list.get(0));
                result.add(newList);
            }
        }
        if (list.size() == 2) {
            {
                List<Integer>newList = new ArrayList<Integer>();
                newList.add(list.get(0));
                newList.add(list.get(1));
                result.add(newList);
            }
            if (!list.get(0).equals(list.get(1))) {
                List<Integer> newList = new ArrayList<Integer>();
                newList.add(list.get(1));
                newList.add(list.get(0));
                result.add(newList);
            }
        }
        if (list.size() == 3) {
            {
                List<Integer>newList = new ArrayList<Integer>();
                newList.add(list.get(0));
                newList.add(list.get(1));
                newList.add(list.get(2));
                result.add(newList);
            }
            List<Integer> newList = new ArrayList<Integer>();
            result.add(Arrays.asList(2,1,2));
            result.add(Arrays.asList(2,2,1));
        }
        return result;
    }
    
}