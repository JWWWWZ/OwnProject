package fizzbuzz;

/**
 * @Classname NumberOutPut
 * @Description TODO
 * @Date 2020/1/8 10:44
 * @Created by JWZ
 */
public class NumberOutPut {

    private int num;

    public NumberOutPut(int num){
        this.num = num;
    }
    @Override
    public String toString() {

        if(num % 3 == 0 && num % 5 == 0){
            return "fizzbuzz";
        }else if(num % 5 == 0){
            return "buzz";
        }else if (num % 3 == 0){
            return "fizz";
        }else{
            return String.valueOf(num);
        }

    }
}
