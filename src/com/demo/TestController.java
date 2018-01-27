package com.demo;

import com.jfinal.core.Controller;

public class TestController extends Controller{
	
	public void index(){
		//renderText("test Page.");
		render("test.html");
		
		//如果是/開頭自動在WebRoot目錄下尋找  
		//me.add("/test", TestController.class, "test/index"); 最后一个参数的配置则没有效果
	
		
		//如果沒有的話就按具體的路徑尋找 
		//me.add("/test", TestController.class, "test/index"); 最后一个参数的配置则有效果

	}
}
