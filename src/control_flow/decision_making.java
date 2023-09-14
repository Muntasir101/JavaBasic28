package control_flow;

/*
Decision-making:
1. if
2. if else
3. if else-if else
4. nested if
 */

public class decision_making {
    public static void main(String[] args) {
        int pass_marks = 40;
        int my_marks = 110;

        if (my_marks > 40 && my_marks < 50) {
            System.out.println("Grade D");
        } else if (my_marks > 50 && my_marks < 60) {
            System.out.println("Grade C");
        } else if (my_marks > 60 && my_marks < 70) {
            System.out.println("Grade B");
        } else if (my_marks > 70 && my_marks < 80) {
            System.out.println("Grade A");
        } else if (my_marks > 80 && my_marks < 100) {
            System.out.println("Grade A+");
        } else {
            System.out.println("Invalid marks.No Grade");
        }

    }
}
