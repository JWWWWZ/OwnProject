package fizz;

/**
 * @Classname FizzBuzz
 * @Description TODO
 * @Date 2019/12/30 10:23
 * @Created by JWZ
 */
public class FizzBuzz {

    public static void main(String[] args){

    }

    public String fizz(int i){

        String result;
        if(i % 3 == 0 && i % 5 == 0){
            result = "FizzBuzz";
        }else if (i % 3 == 0){
            result= "Fizz";
        }else if(i % 5 == 0){
            result = "Buzz";
        }else{
            result = String.valueOf(i);
        }
        return result;
    }
}
