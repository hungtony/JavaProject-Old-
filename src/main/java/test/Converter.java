package test;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String words = scanner.nextLine();
            String[] temp = words.split(" ");
            String result = "\"" + temp[2].replace(";","") + "\":" + "\"" + "\"" + ",(" + temp[1] + ")";
            System.out.println(result);

        }

    }
}
