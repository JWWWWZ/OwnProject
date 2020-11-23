package math;

import java.util.Stack;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2020/11/23 0023
 * @author jiangwenzhu
 * @version 1.0
 */

public class oneDirectStack {

	public static void main(String[] args) {

		trap(new int[]{3,0,1,2});
	}

	public static int trap(int[] height) {
		Stack<Integer> stack = new Stack<>();
		int water = 0;
		//特殊情况
		if (height.length < 3) {
			return 0;
		}
		for (int i = 0; i < height.length; i++) {
			while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
				//栈顶元素
				int popnum = stack.pop();
				//相同元素的情况例1，1
				while (!stack.isEmpty() && height[popnum] == height[stack.peek()]) {
					stack.pop();
				}
				//计算该层的水的单位
				if (!stack.isEmpty()) {
					int temp = height[stack.peek()];//栈顶元素值
					//高
					int hig = Math.min(temp - height[popnum], height[i] - height[popnum]);
					//宽
					int wid = i - stack.peek() - 1;
					water += hig * wid;
				}

			}
			//这里入栈的是索引
			stack.push(i);
		}
		return water;
	}


}
