package GGQZ;

/**
 * @Classname test：公共前缀
 * @Description TODO
 * @Date 2020/5/14 下午12:04
 * @Created by JWZ
 */
public class test {

    public static void main(String[] args){
        System.out.println(longestCommonPrefix(new String[]{"c", "c"}));
    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length <= 0){
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        boolean continueFlag = true;
        int pos = 0;
        char indexValue;

        while(continueFlag){

            if(strs[0].length() <= pos){
                return strs[0].substring(0, pos);
            }

            indexValue = strs[0].charAt(pos);

            for(int i = 0 ; i < strs.length ; i++){

                if(strs[i].length() <= pos || strs[i].charAt(pos) != indexValue){
                    continueFlag = false;
                    break;
                }
            }
            if(continueFlag){
                pos ++;
            }
        }

        return strs[0].substring(0, pos);
    }
}
