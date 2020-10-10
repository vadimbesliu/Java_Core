 class Task5 {
    public static void main(String[] args) {
        char array[]=new char [100];
        array[0]='0';
        array[1]='1';
        array[2]='2';
        array[3]='3';
        array[4]='4';
        array[5]='5';
        array[6]='6';
        changePosition(array,2);
        System.out.println(array);
    }

    public static void reverse(char [] array,int k) {
        for (int i = 0; i < k / 2; i++) {
            char character = array[i];
            array[i] = array[k - i - 1];
            array[k - i - 1] = character;
        }
    }
    public static void changePosition(char[]array,int k){

            


    }
        public static void sort(char[]array){



        }

}