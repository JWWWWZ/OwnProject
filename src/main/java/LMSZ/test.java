package LMSZ;

/**
 * @Classname test：罗马数字实现
 * @Description TODO
 * @Date 2020/5/14 上午11:32
 * @Created by JWZ
 */
public class test {

    public static void main(String[] args){

        System.out.println(romanToInt("MDCL"));
    }

    public static int romanToInt(String s) {

        String[] arrs = s.split("");

        String beforeFlag;
        String afterFlag;

        int beforeValue;
        int afterValue;
        int total = 0;

        for(int i = 0 ; i < arrs.length ; i++){
            beforeFlag = arrs[i];

            if(i + 1 == arrs.length){
                afterFlag = "";
            }else{
                afterFlag = arrs[i + 1];
            }

            beforeValue = transfer(beforeFlag);
            afterValue = transfer(afterFlag);

            if(beforeValue < afterValue){
                total = total + (- beforeValue);
            }else{
                total = total + beforeValue;
            }
        }

        return total;
    }

    private static int transfer(String flag){

        int result = 0;
        switch(flag){
            case "I": result = 1;
                break;
            case "V": result = 5;
                break;
            case "X": result = 10;
                break;
            case "L": result = 50;
                break;
            case "C": result = 100;
                break;
            case "D": result = 500;
                break;
            case "M": result = 1000;
                break;
        }
        return result;
    }
}
