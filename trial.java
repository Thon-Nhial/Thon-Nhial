import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
       int marks =0;
        System.out.println("enter your marks");
        Scanner input = new Scanner(System.in);
        marks = input.nextInt();
       if (marks>=85){
           System.out.println("You A");

       }else if (marks>=75){
           System.out.println("You B");
       }else if (marks>=65){
           System.out.println("You c");
       }else if (marks>=50){
           System.out.println("You D");
       }else {
               System.out.println("You have failed!");
           }
       }
    }



