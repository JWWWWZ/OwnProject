package future;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/03/22 0022
 * @author jiangwenzhu
 * @version 1.0
 */

public class TimeTest implements Runnable{


	@Override
	public void run() {
		while(true){
			System.out.println("hello world");
			System.out.println("----------------");
		}
	}

	public static void main(String[] args){
		Main m = new Main();
		m.test();
	}
}

class Main{

	void test(){
		final Thread t = new Thread(new TimeTest());
		t.run();
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				t.interrupt();
				this.cancel();
				timer.cancel();
			}
		}, 100);
	}
}
