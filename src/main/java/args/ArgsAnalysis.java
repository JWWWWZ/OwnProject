package args;

/**
 * @Classname ArgsAnalysis
 * @Description TODO
 * @Date 2020/1/17 14:35
 * @Created by JWZ
 */
public class ArgsAnalysis {

    String str;

    public ArgsAnalysis(String str){
        this.str = str;
    }

    public String[] analysis() {
        String[] args = str.split("-");
        return args;
    }
}
