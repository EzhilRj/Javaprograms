package NestedIf_condition;

public class Nested_If {

    public static void main(String[] args) {

        /*
         * Create a program to find the grade of a student
         * marks >= 90 => A Grade
         * marks >= 75 => B Grade
         * marks >= 60 => C Grade
         * marks >= 40 => D Grade
         * marks < 40 => Fail
         *
         */
        int marks = 66;

        if (marks > 90) {
            System.out.println("A Grade");
        } else if (marks > 75) {
            System.out.println("B Grade");
        } else if (marks > 60) {
            System.out.println("C Grade");
        } else if (marks > 40) {
            System.out.println("D Grade");
        } else {
            System.out.println("Fail");
        }


        /*
         *
         * int num1, num2, num3
         * 100, 400, 300
         *
         *
         */

    }

}
