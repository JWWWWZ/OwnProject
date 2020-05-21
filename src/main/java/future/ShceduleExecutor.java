package future;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/03/22 0022
 * @author jiangwenzhu
 * @version 1.0
 */

public class ShceduleExecutor {

	public static void main(String[] args){

		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		ScheduledFuture f = service.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {

			}
		}, 0L, 5000, null);
	}

}
