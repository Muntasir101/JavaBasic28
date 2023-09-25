package methods;

public class method_demo1 {
    public static void main(String[] args) {
        test_method_sum();

        //System.out.println(test_method_sub());
        int sub_result =  test_method_sub();
        System.out.println(sub_result);

        System.out.println(test_method_multiply(10,5));
        System.out.println(test_method_multiply(100,5));
    }
    public static void test_method_sum(){
        int number1 = 10;
        int number2 = 5;
        int sum = number1 + number2;
        System.out.println(sum);
    }

    public static int test_method_sub(){
        int number1 = 10;
        int number2 = 5;
        int sub = number1 - number2;
        return sub;
    }
    //Method with parameters
    public static int test_method_multiply(int number1, int number2){
        return number1 * number2;
    }

}
