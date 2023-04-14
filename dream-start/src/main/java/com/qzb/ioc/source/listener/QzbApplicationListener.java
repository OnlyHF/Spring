package com.qzb.ioc.source.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2022-03-31 13:39
 * @since
 */
@Component
public class QzbApplicationListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("QzbApplicationListener : " + new Date());
	}
}
