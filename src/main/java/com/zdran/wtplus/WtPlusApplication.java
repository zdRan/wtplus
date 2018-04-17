package com.zdran.wtplus;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动程序
 *
 * Create by zdRan on 2018/3/22
 *
 * @author cm.zdran@gmail.com
 */
@SpringBootApplication
public class WtPlusApplication {
	private static Logger logger = LoggerFactory.getLogger(WtPlusApplication.class);

	public static void main(String[] args) {
		logger.info("启动 wtPlus.");
		SpringApplication.run(WtPlusApplication.class, args);
	}
}
