package string;

import com.sun.scenario.animation.shared.ClipEnvelope;

public class string_demo {
    public static void main(String[] args) {
        String name =  "Mr.kevin Smith";
        System.out.println(name.length());

        String first_name = "Mr.Green ";
        String last_name = "Wood";
        String full_name = first_name.concat(last_name);
        System.out.println(full_name); //Mr.Green Wood

        System.out.println(full_name.toLowerCase());
        System.out.println(full_name.toUpperCase());
        System.out.println(full_name.equals("Mr.Green Wood"));
    }
}
