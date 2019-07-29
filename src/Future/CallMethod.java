package Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/03/22 0022
 * @author jiangwenzhu
 * @version 1.0
 */

public class CallMethod {


	private static  void callMethod(){

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		FutureTask<String> future = new FutureTask<String>(new Callable<String>() {
			@Override
			public String call() throws Exception {

				Thread.sleep(12*1000);
				for(int i = 0 ; i < 10 ; i++){
					System.out.println("hello world");
				}

				return "abc";
			}
		});
		executorService.execute(future);
		String result = "初始化";
		try {
			result = future.get(10 * 1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}

	public static  void main(String[] args){
		callMethod();
	}
}
