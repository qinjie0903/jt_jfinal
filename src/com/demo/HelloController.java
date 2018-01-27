package com.demo;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller {

	@ActionKey("/index")
	public void index() {
		
		// renderText("Hello JFinal World.");
		//render("/hello.html");//通过“/”来访问WebRoot下到文件
		// 生成json类型
		Data data = new Data();
		data.setAge(10);
		data.setName("JFinal");
		renderJson(data);
	}

	public void test() {
		// /hello/test
		redirect("/");
		//redirect("/hello/test");
		//renderText("test");
	}

	public void download(){
		renderFile("RefreshShortcuts2.bat");
	}
	
	
}