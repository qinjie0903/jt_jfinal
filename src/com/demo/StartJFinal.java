package com.demo;

import com.jfinal.core.JFinal;

public class StartJFinal {

	 //通过参数配置指定端口
	 //Run JFinal Server with Debug Configurations or Run Configurations in Eclipse JavaEE
	 //args example: WebRoot 9999 / 5
	public static void main(String[] args) {
		JFinal.start("WebRoot", 9999, "/", 5);
		}
}
