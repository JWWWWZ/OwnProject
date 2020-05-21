package recursive;

/**
 * @Classname FizzBuzz
 * @Description TODO
 * @Date 2019/12/1 17:27
 * @Created by JWZ
 */
public class test {

    public static void main(String[] args){


    }

    private int recursive(int i){

        int time = recursive(i);

        if(i == 1){

            time = time +1;
        }
        return i;
    }
}
