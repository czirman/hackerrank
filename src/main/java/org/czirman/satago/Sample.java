package org.czirman.satago;

public class Sample {

    public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            String divByThree = divByThree(i);
            String divByFive = divByFive(i);

            StringBuilder str = new StringBuilder();
            str.append(divByThree);
            str.append(divByFive);
            Boolean result = str.isEmpty();

            switch (result.toString()){
                case "false":
                    System.out.println(str);
                    break;
                case "true":
                    System.out.println(i);
                    break;
            }
        }
    }

    private static String divByThree(int n) {
        return n % 3 == 0? "Fizz": "";
    }

    private static String divByFive(int n) {
        return n % 5 == 0? "Buzz": "";
    }

}
