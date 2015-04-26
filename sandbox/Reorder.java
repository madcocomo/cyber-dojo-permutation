import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        ArrayList<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        if (list.size() == 1 || list.size() == 2) {
            {
                List<Integer>newList = new ArrayList<Integer>();
                newList.add(list.get(list.size()-1));
                result.add(newList);
            }
        }
        if (list.size() == 2) {
            ArrayList<List<Integer>> result1 = 
                new ArrayList<List<Integer>>();
            {
                List<Integer> newList = new ArrayList<Integer>(result.get(0));
                newList.add(0,list.get(0));
                result1.add(newList);
            }

            {
                List<Integer> newList = new ArrayList<Integer>(result.get(0));
                newList.add(list.get(0));
                result1.add(newList);
            }
            result = result1;
        }
        if (list.size() == 3) {
            ArrayList<List<Integer>> result2 = 
                new ArrayList<List<Integer>>();
            result.add(Arrays.asList(2,2));
            {
                List<Integer>newList = new ArrayList<Integer>(result.get(0));
                newList.add(0,list.get(0));
                result2.add(newList);
            }
            {
                List<Integer>newList = new ArrayList<Integer>(result.get(0));
                newList.add(1,list.get(0));
                result2.add(newList);
            }
            {
                List<Integer>newList = new ArrayList<Integer>(result.get(0));
                newList.add(list.get(0));
                result2.add(newList);
            }
            result = result2;
        }
        return result;
    }
    
}