import java.util.Scanner;



public class MainProgramm{
 
    public static void printNumbers(String dimeter,int... numbers){
        for(int n : numbers){
            System.out.print(n);
            System.out.print(dimeter);
        }
        System.out.println();
    }   

    public static void main(String args[]){
        

        User usr = new User();
                
        System.out.println(usr.getClass());
    }
};


interface Some{
    default void on(){
        System.out.println("On ");
    }

}

class User implements Some{
   public int age;
   public String name;

   public static int counter;

   {
        this.name = "John";
        this.age = 34;

        User.counter++;
   }


    @Override 
    public String toString(){
        return this.name;
    }
}


