package modifiers;

public class modifiers_demo {

    final static int k = 100; // instance variables

    public static void main(String[] args) {
        modifiers_demo obj =  new modifiers_demo();
        obj.method1();

        method2();
        method3();
    }

    private void method1(){
        int i = 20; // Local variable
        int j = 30; // Local variable
        int k = 20;
        int sum = i + j + k; // k is instance variable
        System.out.println(sum);
    }

    private static void method2(){
        int i = 30;
        int j = 40;
        int sum = i + j + k;  // k is instance variable
        System.out.println(sum);
    }

    protected static void method3(){
        int i = 30;
        int j = 40;
        int sum = i + j + k;  // k is instance variable
        System.out.println(sum);
    }
}
