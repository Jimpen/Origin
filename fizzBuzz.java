package com.company.Exercise5;

public class fizzBuzz {
    public static void main(String[] args) {
        String s = "";

        for (int counter=1; counter<100; counter++) {
            if (counter % 3 == 0)
                s = "Fizz";
            if (counter % 5 == 0)
                s = s + "Buzz";
            if (counter % 5 != 0 && counter % 3 != 0)
                s = s + counter;
            System.out.println(s);
            s = "";
        }

    }
}
