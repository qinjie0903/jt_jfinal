package com.demo;

import com.jfinal.core.Controller;

public class TestController extends Controller{
	
	public void index(){
		//renderText("test Page.");
		render("test.html");
		
		//如果是/開頭自動在WebRoot目錄下尋找
		//如果沒有的話就按具體的路徑尋找
	}
}
