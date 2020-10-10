import java.util.Scanner;

 class Task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the number between 0 and 1000");
        int a=sc.nextInt();
        int result=0;
        if(a>0 & a<1000){
            for(;a>0;a/=10){
                result= result + a%10;}
            System.out.println("The sum of the digits is: " + result);
        }
        else System.out.println("The number is not in the range of 0 and 1000");
    }
}
