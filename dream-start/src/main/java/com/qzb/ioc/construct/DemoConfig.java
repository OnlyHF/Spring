package com.qzb.ioc.construct;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-12-06 12:08
 * @since 1.0.0
 **/
@Component
public class DemoConfig {

	private static final Map<String, IDemo> EXECUTE_MAP = new ConcurrentHashMap<>();

	public DemoConfig(List<IDemo> list) {
		for (IDemo demo : list) {
			EXECUTE_MAP.put(demo.getType(), demo);
		}
	}


	public static void execute(String type) {
		EXECUTE_MAP.get(type).hello();
	}

}
