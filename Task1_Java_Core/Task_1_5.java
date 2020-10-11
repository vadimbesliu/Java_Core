package Task1_Java_Core;

public class Task_1_5 {
    public static void main(String[] args) {
        int array[] = new int[6];
        array[0] = 1;
        array[1] = 3;
        array[2] = 2;
        array[3] = 4;
        array[4] = 18;
        array[2] = 14;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println("");
        sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }

    }
    public static int []  sort(int [] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int maxElementIndex = i;
            for (int j = i; j >= 0; j--) {
                if (array[j] > array[maxElementIndex]) {
                    maxElementIndex = j;
                }
            }
            reverse(array, maxElementIndex + 1);
            reverse(array, i + 1);
        }
        return array;
    }
    public static void reverse(int []array,int k){
        if(array==null || array.length<2)
            return;
        for (int i=0;i<k/2;i++){
            int temp=array[i];
            array[i]=array[k-i-1];
            array[k-i-1]=temp;
        }
    }
}
