package YXDKH;

/**
 * @Classname test：有效的括号
 * @Description TODO
 * @Date 2020/5/14 下午2:55
 * @Created by JWZ
 */
public class ownFailedTest {

    public static void main(String[] args){

        System.out.println(isValid("{()}()"));
    }

    public static boolean isValid(String s) {

        boolean result = true;

        int length = s.length();

        if(length % 2 != 0){
            result = false;
        }

        for(int i = 0,  j = length - 1; i <= j ; i ++ , j--){

            if(transfer(s.charAt(i)) != transfer(s.charAt(j))){
                result = false;
            }
        }

        if(result){
            return result;
        }

        result = true;

        for(int i = 0, j = i + 1 ; j < length ; i = i + 2, j = j + 2){

            if(transfer(s.charAt(i)) != transfer(s.charAt(j))){
                result = false;
            }
        }

        return result;
    }

    public static int transfer(char c){

        int result;
        switch (c){
            case '(':
                result = 0;
                break;
            case ')':
                result = 0;
                break;
            case '{':
                result = 1;
                break;
            case '}':
                result = 1;
                break;
            case '[':
                result = 2;
                break;
            case ']':
                result = 2;
                break;
                default:
                    result = -1;
                    break;
        }
        return result;
    }
}
