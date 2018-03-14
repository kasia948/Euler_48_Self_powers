package pl.euler;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class CalculationsTest {

    @Test
    public void shouldReturnResultFor10(){
        //given
        Calculations calculator= new Calculations();
        //when
        long  result= calculator.sumAllnumbers(10);
        //then
        Assert.assertThat(result, is(10405071317L));
    }

    @Test
    public void shouldReturnResultFor3(){
        //given
        Calculations calculator= new Calculations();
        //when
        long  result= calculator.sumAllnumbers(3);
        //then
        Assert.assertThat(result, is(32L));
    }
}
