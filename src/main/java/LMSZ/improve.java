package LMSZ;

/**
 * @Classname improve
 * @Description TODO
 * @Date 2020/5/14 上午11:37
 * @Created by JWZ
 */
public class improve {

    public static void main(String[] args){

        System.out.println(remanToInt("III"));

    }

    public static int remanToInt(String s){

        int preValue = getValue(s.charAt(0));
        int total = 0;
        int nextValue;

        for(int i = 0 ; i < s.length() ; i ++){

            if(i + 1 >= s.length()){
                total += getValue(s.charAt(i));
                break;
            }

            nextValue = getValue(s.charAt(i + 1));

            if(preValue < nextValue){
                total -= preValue;
            }else{
                total += preValue;
            }

            preValue = nextValue;
        }
        return total;
    }

    public static int getValue(char c){

        int result;
        switch (c){
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
