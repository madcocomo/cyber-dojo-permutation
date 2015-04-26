import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        List<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        if (list.size() >= 1) {
            for (int i=1; i<=list.size(); i++) {
                int toMix = list.get(list.size()-i);
                //ArrayList<List<Integer>> temp = new ArrayList<List<Integer>>();
                Set<List<Integer>> temp = new LinkedHashSet<List<Integer>>();
                for (List<Integer> partList : result)
                    temp.addAll(mixInto(toMix, partList));
                result.clear();
                result.addAll(temp);
            }
        }
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

    
