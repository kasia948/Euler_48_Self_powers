package pl.euler;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class CalculationsTest {

    @Test
    public void shouldReturnResultFor10() {
        //given
        Calculations calculator = new Calculations();
        //when
        String result = calculator.calculateAndFindLast10digits(10);
        //then
        Assert.assertThat(result, is("0405071317"));
    }

    @Test
    public void shouldReturnResultFor1000() {
        //given
        Calculations calculator = new Calculations();
        //when
        String result = calculator.calculateAndFindLast10digits(1000);
        //then
        Assert.assertThat(result, is("9110846700"));
    }
}
