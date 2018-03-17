package pl.euler;

public class HomeCalculations {

    public static void main(String[] args) {
        Calculations calculations = new Calculations();
        String i = calculations.calculateAndFindLast10digits(1000);
        System.out.println(i);
    }
}