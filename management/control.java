package management;

import java.util.Scanner;

public class control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary objSalary = new Salary();


            try{
                System.out.println("Show old salaries of employees Press 1  :");
                System.out.println("Show new salaries of employees Press 2  :");
                int input = sc.nextInt();
                if(input == 1){
                    objSalary.increaseSalary(objSalary.oldSalary);
                } else if (input == 2) {
                    objSalary.increaseSalary(objSalary.newSalary);
            }
            }catch (Exception e){
                System.out.println("Error try again..!");
            }
    }
}