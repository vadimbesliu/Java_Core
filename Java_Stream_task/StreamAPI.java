package Java_Stream_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        StreamAPI streamAPI = new StreamAPI();
        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 4, 6, 6, 7);
        String string1 = "Java core";
        List<String> stringNumberList = Arrays.asList("1", "2", "3", "4", "5");
        List<Character> characterList = Arrays.asList('a', 'b', 'c', 'd');



        streamAPI.showList(integerList1);
        streamAPI.reverseString(string1);
        System.out.println("The second element is: " + streamAPI.getElement(integerList1, 2));
        for (Integer integer : streamAPI.convertList(stringNumberList)) {
            System.out.println(integer.getClass());
        }
        streamAPI.getMaxMinInt(integerList1);
        streamAPI.getMaxMinChar(characterList);
        System.out.println(streamAPI.removeDuplicates1(integerList1));
        System.out.println(streamAPI.removedDuplicates2(integerList1));
        streamAPI.readFile();
    }

    public void showList(List<Integer> list) {
        list.stream().map(it -> it * 2).forEach(System.out::println);
    }

    public void reverseString(String list) {
        System.out.println("Reversed String: " + Stream.of(list).map(it -> new StringBuilder(it)
                .reverse()).collect(Collectors.joining()));
    }

    List<Integer> getElement(List<Integer> list, int n) {
        return list.stream().skip(n - 1).limit(1).collect(Collectors.toList());
    }

    List<Integer> convertList(List<String> list) {
        return list.stream().flatMapToInt(it -> IntStream.of(Integer.parseInt(it))).boxed().
                collect(Collectors.toList());
    }

    public void getMaxMinInt(List<Integer> list) {
        System.out.println("Max value is: " + list.stream().max(Integer::compare).get());
        System.out.println("Min value is: " + list.stream().min(Integer::compare).get());

    }

    public void getMaxMinChar(List<Character> list) {
        System.out.println("Max value is: " + list.stream().max(Character::compare).get());
        System.out.println("Min value is : " + list.stream().min(Character::compare).get());
    }

    public List<Integer> removeDuplicates1(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }
    Set<Integer> removedDuplicates2(List<Integer> list) {
        return list.stream().collect(Collectors.toSet());
    }
    void readFile (){
        try{
            Stream<String> read = Files.lines(Paths.get("C:\\Users\\vbesliu\\IdeaProjects\\JavaTasks\\src\\Java_Stream_task\\file1.txt"));
                    read.forEach(System.out::println);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


}
