package calculator;
import java.util.*;

public class Calci {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        /**
         * 1-> +
         * 2-> -
         * 3-> *
         * 4-> /
         * 5-> %
         */


        switch (operator) {
            case1:
            System.out.println(a + b);
            break;
            case2:
            System.out.println(a - b);
            break;
            case3:
            System.out.println(a * b);
            break;
            case4:
            System.out.println(a == b);

            break;

//            System.out.println(a % b);
//            break;

        }

    }


