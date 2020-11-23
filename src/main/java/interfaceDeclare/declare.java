package interfaceDeclare;

/**
 * @Classname ：加解密接口定义
 * @Description ：  TODO
 * @Date ： 2020/2/13
 * @Created ： by JWZ
 */
public class declare {

    /**
     * 防泄露加密接口
     * @param info：需要加密的信息
     * @param infoType：加密的信息所属类型，例如user(用户信息)、document(文档信息)
     * @return ：加密后的密文
     */
    public String encryptForResistInfoLeak(String info, String infoType){

        return "";
    }

    /**
     * 防泄露解密接口
     * @param encryptedInfo：加密好的密文
     * @param infoType：解密的信息所属类型，例如user(用户信息)、document(文档信息)
     * @return ：解密后的明文
     */
    public String decryptForResistInfoLeak(String encryptedInfo, String infoType){

        return "";
    }

    /* 防篡改加密接口传入一个明文和类型后，接口的返回值需要为"明文|密文"的形式，即将明文和密文通过竖线分隔后拼接*/

    /**
     * 防篡改加密接口
     * @param info：需要加密的信息
     * @param infoType：加密的信息所属类型，例如user(用户信息)、document(文档信息)
     * @return ：加密后的密文
     */
    public String encryptForResistInfoModify(String info, String infoType){

        return "";
    }

    /**
     * 防篡改解密接口
     * @param encryptedInfo：加密好的密文
     * @param infoType：解密的信息所属类型，例如user(用户信息)、document(文档信息)
     * @return ：解密后的明文
     */
    public String decryptForResistInfoModify(String encryptedInfo, String infoType){

        return "";
    }

}
