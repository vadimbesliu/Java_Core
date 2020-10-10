import java.util.Scanner;

 class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce a number to check if it is palindrome");
        int a=sc.nextInt();
        int b=0;
        int c=a;
        for(;c>0;c/=10){
            int digit=c%10;
            b=b*10+digit;
        }
        if (a==b) System.out.println("The number is palindrome");
        else System.out.println("The number is not palindrome");
    }
}
