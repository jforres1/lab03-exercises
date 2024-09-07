import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {
        List<Integer> duplicates = new ArrayList<Integer>();
        for(int i = 0; i < l.size(); i++){
            for(int j = i + 1; j < l.size(); j++){
                if(l.get(i) == l.get(j)){
                    duplicates.add(l.get(i));
                    break;
                }
            }
        }
        return duplicates;
    }

    public static List<Integer> findModeMap(List<Integer> l){
        List<Integer> duplicates = new ArrayList<Integer>();
        Map<Integer, Integer> aux = new HashMap<Integer, Integer>();
        Integer temp;
        for(Integer i : l){
            temp = aux.get(i);
            if(temp == null){
                aux.put(i, i);
            }else{
                duplicates.add(temp);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));
        System.out.println("Sample 1: " + findModeMap(sample1));
        System.out.println("Sample 2: " + findModeMap(sample2));
        System.out.println("Sample 3: " + findModeMap(sample3));
        System.out.println("Sample 4: " + findModeMap(sample4));
    }

}