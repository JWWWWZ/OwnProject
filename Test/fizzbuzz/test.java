package fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/1/8 10:36
 * @Created by JWZ
 */
public class test {

    @Test
    public void test_normal_num(){
        String result = getNumberResult(1);
        assertThat(result, is("1"));
    }

    @Test
    public void test_num_can_be_divided_3(){
        String result = getNumberResult(3);
        assertThat(result, is("fizz"));
    }

    @Test
    public void test_num_can_be_divided_5(){
        String result = getNumberResult(5);
        assertThat(result, is("buzz"));
    }

    @Test
    public void test_num_can_be_divided_by_3_and_5(){
        String result = getNumberResult(15);
        assertThat(result, is("fizzbuzz"));
    }

    private String getNumberResult(int i) {
        NumberOutPut numberOutPut = new NumberOutPut(i);
        return numberOutPut.toString();
    }
}
