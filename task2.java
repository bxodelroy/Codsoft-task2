import java.util.Scanner;
import java.util.*;
class Grades{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            System.out.println("Enter the name of the subject: ");
            String str= sc.next();
            System.out.println("Enter the marks of that subject out of 100: ");
             int b=sc.nextInt();
			 sum=sum+b;
             i++;
        }
		System.out.println("Total marks is: " +sum);
		int f=(100*n);
		System.out.println("Out of "+f+ " marks");
		int c= (sum/n);
		System.out.println("Average marks is: " +c+ "%");
		
		if(c==100){
			System.out.println("YOU'VE SECURED A+ GRADES");
		}
		else if(c>=80){
			System.out.println("YOU'VE SECURED B+ GRADES");
		}
		else if(c>=60){
			System.out.println("YOU'VE SECURED C+ GRADES");
		}
        else if(c>=50){
			System.out.println("YOU'VE SECURED D+ GRADES");
		}
		else if(c>=30){
			System.out.println("YOU'VE SECURED E+ GRADES");
		}
		else if(c<=29){
			System.out.println("YOU'VE FAILED YOUR EXAMS ");
		}
    }
}
