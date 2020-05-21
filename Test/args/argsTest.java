package args;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @Classname argsTest
 * @Description TODO
 * @Date 2020/1/17 14:22
 * @Created by JWZ
 */
public class argsTest {


    @Test
    public void test_args(){
        String str = "-p 1 -m 2";
        ArgsAnalysis argsAnalysis = new ArgsAnalysis(str);
        String[] result = argsAnalysis.analysis();
        assertThat(result, is(new String[]{"-p 1", "-m 2"}));
    }
}
