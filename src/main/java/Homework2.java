package org;
import java.util.Scanner;



public class Homework2 {
    public static void main(String[] args) {
        String myfirstName = "Aleks";
        String mylastName = "Milcheva";
        System.out.println(myfirstName);
        System.out.println(mylastName);

        Scanner sc = new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter the first string:");
        str1= sc.next();

        System.out.print("Enter the second  string:");
        str2=sc.next();

        if(str1.equals(str2))
            System.out.println("The string are equal.");
        else
            System.out.println("The Strings are not equal!");

        String testString = "My name is Aleksandrina Milcheva!";
        System.out.println(testString.length());


        System.out.println("The string : My name is Aleksandrina Milcheva" + testString + " " + "words");
        System.out.println(testString + " " + " And i also live in the city of Radomir :");


    }
}
