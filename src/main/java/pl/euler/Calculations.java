package pl.euler;
import java.math.BigInteger;

public class Calculations {
    public  String calculateAndFindLast10digits(int MAX) {

        BigInteger sum = new BigInteger("1");
        for (int i = 2; i <= MAX; i++)
            sum = sum.add(new BigInteger(i + "").pow(i));
        return sum.toString().substring(sum.toString().length() - 10);
    }
}