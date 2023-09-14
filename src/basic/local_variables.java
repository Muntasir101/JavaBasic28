package basic;

public class local_variables {
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1(){
        int i = 20; // Local variable
        int j = 30; // Local variable
        int sum = i + j;
        System.out.println(sum);
    }

    public static void method2(){
        int i = 30;
        int j = 40;
        int sum = i + j;
        System.out.println(sum);
    }
}
