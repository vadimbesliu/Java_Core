 class Task2 {
    public static void main(String[] args) {
        String asd="The quick brown fox";
        String reversed="";
        for(int i=asd.length()-1;i>=0;i--){
            reversed+=asd.charAt(i);
        }
        System.out.println(reversed);
    }
}
