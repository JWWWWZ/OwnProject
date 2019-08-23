package specialChar;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/08/20 0020
 * @author jiangwenzhu
 * @version 1.0
 */

public class test {

	public static void main(String[] args){
		String text ="今天，我们！非常？好的。浮点数,凡是方式发.发放散阀#惊世毒妃%就分手……附件啊看是否&机房*";
		System.out.print(text.replaceAll("[`~!@#$%^&*()+=|{}':;',.<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]", ""));
	}
}
