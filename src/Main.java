import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer elements[] = {1,2,3,4,5,5,2,3,5,5,4,1,2};
        List<Integer> intList = new LinkedList<>(Arrays.asList(elements));

        maxOccurrences(intList);

    }
    public static void maxOccurrences (List<Integer> list){
        Map<Integer,Integer> occurMap = new HashMap<>();
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            Integer number = itr.next();

            if (occurMap.containsKey(number)){
                occurMap.put(number, occurMap.get(number)+1);
            } else {
                occurMap.put(number,1);
            }
        }
        Collection<Integer> inters = occurMap.values();
        int temp = 0;
        for (int i = 0; i < inters.size(); i++) {
            temp = Math.max(i, temp);
        }


        if (occurMap.isEmpty()){
            System.out.println(0);
        }
        System.out.println(occurMap);
        System.out.println(temp);



    }
}
