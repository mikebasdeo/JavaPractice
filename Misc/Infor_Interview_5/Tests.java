package Misc.Infor_Interview_5;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;

public class Tests {

    @Test
    public void ArraysTest(){

        List<String> testString = Arrays.asList("1", "2", "Fizz","4","Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "66", "Fizz", "13", "14", "FizzBuzz");
        List<String> testString2 = Arrays.asList("1", "2", "Fizz","66","Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

        List<String> testString3 = Arrays.asList("");

        List<String> myList = new ArrayList<String>();
        String myString = "66";

        Assert.assertThat(false, is(Solution.isInBoth(myString, testString, testString3)));
    }


}
