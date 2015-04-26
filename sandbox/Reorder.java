import java.util.*;

public class Reorder {

    public static List<List<Integer>> orders(List<Integer> list) {
        List<List<Integer>> result = 
            new ArrayList<List<Integer>>();
        if (list.size() == 1 || list.size() == 2) {
            int toMix = list.get(list.size()-1);

            {
                List<Integer>newList = new ArrayList<Integer>();
                newList.add(0,toMix);
                result.add(newList);
            }
        }

        if (list.size() == 2) {
            int toMix = list.get(list.size()-2);

            ArrayList<List<Integer>> result1 = 
                new ArrayList<List<Integer>>();
            {
                List<Integer> newList = new ArrayList<Integer>(result.get(0));
                newList.add(0,toMix);
                result1.add(newList);
            }

            {
                List<Integer> newList = new ArrayList<Integer>(result.get(0));
                newList.add(1,toMix);
                result1.add(newList);
            }
            result = result1;
        }
        if (list.size() == 3) {
            result.add(Arrays.asList(2,2));
            int toMix = list.get(list.size()-3);

            List<List<Integer>> result1 = mixInto(toMix, result.get(0));
            result = result1;
        }
        return result;
    }

    public static List<List<Integer>> mixInto(int toMix, List<Integer> list) {
        ArrayList<List<Integer>> result1 = new ArrayList<List<Integer>>();
        for(int i=0; i<=list.size(); i++)
        {
            List<Integer>newList = new ArrayList<Integer>(list);
            newList.add(i,toMix);
            result1.add(newList);
        }
/*
        {
int i = 1;
            List<Integer>newList = new ArrayList<Integer>(list);
            newList.add(i,toMix);
            result1.add(newList);
        }
        {
int i = 2;
            List<Integer>newList = new ArrayList<Integer>(list);
            newList.add(i,toMix);
            result1.add(newList);
        }
*/
        return result1;        
    }






}

    
