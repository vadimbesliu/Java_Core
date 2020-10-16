package Java_Collections;

import java.util.*;

public class MergingLists {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1,4,7,6,8,10,12);
        List<Integer> list2 = Arrays.asList(4,8,3,5,8,9,12,13);
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        for(Integer o: list2){
            if(!list3.contains(o)){
                list3.add(o);
            }
        }
        Collections.sort(list3);
        System.out.println(list3);

    }
}
