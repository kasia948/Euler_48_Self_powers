package pl.euler;

public class HomeCalculations {

    public static void main(String[] args) {
        Calculations calculations = new Calculations();

        long i = calculations.sumAllnumbers(1000);
        System.out.println(i);

        String numberAsString = Long.toString(i);
        System.out.println(numberAsString.substring(numberAsString.length() - 10));

    }
}
