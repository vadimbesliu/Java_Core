import java.util.Arrays;

 class Person {
     String name;
     int age;
     String gender;

     public Person(String name, int age, String gender) {
         this.name = name;
         this.age = age;
         this.gender = gender;
     }

     @Override
     public String toString() {
         return "Name: '" + this.name + "', Age: '" + this.age + "', Gender: '" + this.gender + "'";
     }

    public static void main(String[] args) {



        Object asd[]={"Today",new Person("Vadim",24,"male"),323442342,"is",23.63,'a',
                new Person("Panfil",24,"male"),"big","day"};
        sort(asd);

    }
    public static void sort(Object[] a){
        StringBuilder text=new StringBuilder();
        long sum=0;
        int i =0;
        Person persons[]=new Person [2];
        for (Object o: a){
            if(o instanceof String || o instanceof Character){
                text=text.append(o+ " ");
            }
            else if(o instanceof Long || o instanceof Integer){
                sum+=Integer.valueOf(String.valueOf(o));
            }
            if (o instanceof Person){
                persons[i]= (Person) o;
                i++;

            }
        }
        System.out.println(text);
        System.out.println(sum);
        System.out.println(Arrays.toString(persons));
    }
}
