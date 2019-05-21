package LeetCode.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;

public class Tests {



    @Test
    public void FizzBuzzTest(){
        List<String> testString = Arrays.asList("1", "2", "Fizz","4","Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        Assert.assertThat(testString, is(Solution.fizzBuzz(15)));
        Assert.assertThat(testString, is(Solution_2.fizzBuzz(15)));
    }

}



