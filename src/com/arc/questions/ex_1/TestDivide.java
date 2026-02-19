package com.arc.questions.ex_1;

public class TestDivide {
    public static void main(String[] args) {
        int x;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        x = sc.nextInt();
//
//        System.out.println(100/x);

        try {
            int y = 5;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {

//            System.out.printf(y);
        }
    }
}
