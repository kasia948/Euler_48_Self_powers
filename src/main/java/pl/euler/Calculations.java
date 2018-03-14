package pl.euler;

import static java.lang.Math.*;

public class Calculations {
    public long sumAllnumbers(long max) {
        long sum = 0;
        double x = 1;

        while (x <= max) {
            sum = sum + (long) pow(x, x);
            x++;
        }
        return sum;
    }

}
