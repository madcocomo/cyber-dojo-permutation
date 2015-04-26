import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        List<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        if (list.size() >= 1) {
            for (int i=1; i<=list.size(); i++) {
                int toMix = list.get(list.size()-i);
                result = mixInto(toMix, result.get(0));
            }
        }
/*
        if (list.size() == 3) {
            result.clear();
            result.add(Arrays.asList(2,2));

            int toMix = list.get(list.size()-3);
            result = mixInto(toMix, result.get(0));
        }
*/
        return result;
    }

    public static List<List<Integer>> mixInto(int toMix, List<Integer> list) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<=list.size(); i++)
        {
            List<Integer>newList = new ArrayList<Integer>(list);
            newList.add(i,toMix);
            if (!result.contains(newList)) {
                result.add(newList);
            }
        }
        return result;        
    }






}

    
