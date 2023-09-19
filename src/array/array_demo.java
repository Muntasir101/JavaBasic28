package array;
import java.util.Arrays;

public class array_demo {
    public static void main(String[] args) {
        int [] myList = {50,10,34,1};
        String [] student_list = {"kevin","smith","green"};


        // Finding Length
        int myList_length = myList.length;
        System.out.println("Length: "+ myList_length);

        // Accessing First Elements
        int first_element= myList[0];
        System.out.println("First element is: " +first_element);

        // Accessing Last Elements
        int last_element= myList[myList.length-1];
        System.out.println("Last element is: " +last_element);

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        // Finding the largest element
        int max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max Element is " + max);

        // Sorting
        Arrays.sort(myList);

        for (int number : myList){
            System.out.println(number + " ");
        }
    }
}
