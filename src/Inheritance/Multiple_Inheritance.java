package Inheritance;

import java.util.Scanner;

public class Multiple_Inheritance {
	String fatherName;
    String motherName;
    String childName;

    interface Father {
        Scanner sc = new Scanner(System.in);
        
    }

    interface Mother {
    }

    class Child implements Father, Mother {

        

        void fatherMethod() {
            System.out.print("Enter Father Name: ");
            fatherName = Father.sc.nextLine();
        }

        void motherMethod() {
            System.out.print("Enter Mother Name: ");
            motherName = Father.sc.nextLine();
        }

        void childMethod() {
            System.out.print("Enter Child Name: ");
            childName = Father.sc.nextLine();
        }

        void display() {
            System.out.println("\nFamily Details");
            System.out.println("Father Name : " + fatherName);
            System.out.println("Mother Name : " + motherName);
            System.out.println("Child Name  : " + childName);

            System.out.println("\n" + childName + " is the child of "
                    + fatherName + " and " + motherName);
        }
    }

    public static void main(String[] args) {

        Multiple_Inheritance obj = new Multiple_Inheritance();

        Child child = obj.new Child();

        child.fatherMethod();
        child.motherMethod();
        child.childMethod();

        child.display();
    }
}
