package rpc;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2020/10/14 0014
 * @author jiangwenzhu
 * @version 1.0
 */

public class ServerServiceImpl implements ServerService {

	@Override
	public String get(Object key) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("aaa","111");
		map.put("bbb","222");
		map.put("ccc",new Object());
		Object obj = map.get(key);
		if(null == obj){
			return null;
		}
		if(obj instanceof String){
			return (String)obj;
		}
		return obj.toString();
	}
}
