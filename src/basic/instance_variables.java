package basic;

public class instance_variables {
    static int k = 100; // instance variables

    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1(){
        int i = 20; // Local variable
        int j = 30; // Local variable
        int sum = i + j + k; // k is instance variable
        System.out.println(sum);
    }

    public static void method2(){
        int i = 30;
        int j = 40;
        int sum = i + j + k;  // k is instance variable
        System.out.println(sum);
    }
}
