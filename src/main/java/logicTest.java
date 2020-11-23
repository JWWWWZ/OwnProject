/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2020/04/28 0028
 * @author jiangwenzhu
 * @version 1.0
 */

public class logicTest {


	public static void main(String[] args){

		int x = 123;
		System.out.println("x = " + x);
		System.out.println("rev x = " + rever(x));

	}

	private static int rever(int x){

		int pop;
		int rev = 0;
		while(x > 0){

			pop = x % 10;
			x = x / 10;
			rev = pop * 10 + rev;
		}
		return rev;
	}

}
