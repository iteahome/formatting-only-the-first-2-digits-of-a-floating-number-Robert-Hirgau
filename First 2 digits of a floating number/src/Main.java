public class Main {

    public static void main(String[] args) {
	/*
    Using String.format() method, please display in the console the first 2 digits of a floating number (float or double: e.g. 1.93211 -> display only 1.93)
     */

        double nr1 = 1.93211;
        System.out.println(nr1);

        System.out.printf("%.2f%n", nr1);

    }
}