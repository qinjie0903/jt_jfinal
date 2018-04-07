package com.demo;

import java.net.URLDecoder;

import com.jfinal.core.Controller;
//import com.jfinal.upload.UploadFile;
import com.jfinal.upload.UploadFile;

public class IndexController extends Controller {

	/**
	 * action 是一个申明在Controller里的，无参数的，被public修饰 如如下方法index()就是一个action
	 */
	@SuppressWarnings("deprecation")
	public void index() {
		// System.out.println("---log---");
		// renderText("Index Page.");

		String value1 = getPara("key1");
		String value2 = getPara("key2");

		System.out.println("value1====" + value1);
		System.out.println("value2====" + value2);

		
		System.out.println("-------------------");
		
		// get提交
		String para = getPara();
		System.out.println("para===" + para);
		System.out.println("p0==" + getPara(0));
		System.out.println("p1==" + getPara(1));
		System.out.println("p2==" + getPara(2));
		System.out.println("p2==" + URLDecoder.decode(getPara(2, "default")));

		// post提交
		String title = getPara("ar1.title");
		String subtitle = getPara("subtitle");
		String content = getPara("content");

		System.out.println("title===" + title);
		System.out.println("subtitle===" + subtitle);
		System.out.println("content===" + content);

		System.out.println("---------------------------");
		Article article = getBean(Article.class, "");// 在html页面中的name属性设置为ar1而不是javabean类名; 传入""则相当于前缀没有
		// Article article = getModel(Article.class,"");//用法和getBean一样，
		// 不过model传入的类必须和数据库有映射的JFinal Model;

		System.out.println("Article:" + article.toString());

		System.out.println("id:" + article.getId());
		System.out.println("title:" + article.getTitle());
		System.out.println("subtitle:" + article.getSubtitle());
		System.out.println("content:" + article.getContent());

		/*
		 * String s1 = getRequest().getHeader("User-Agent"); String s2 =
		 * getRequest().getHeader("Accept"); System.out.println("----"+s1);
		 * System.out.println("----"+s2); //自定义 getResponse().setHeader("jimmy",
		 * "test hello");
		 */
		
		
		//UploadFile uploadFile = getFile();
		
		//getFile();
		
		render("/index.html");
	}

	public void jpress() {
		System.out.println("xxxx");
		renderText("xxxxx");
	}

	public void upload() {
		// UploadFile uploadFile = getFile();
		// 调用getFile()必须是multipart/form-data；
		// 文件大小的限制可能会出错，通过config的setMaxPostSize(1024 * 1024 * 100);设置上传的大小
		// 同时getFile()必须依赖于cos-26Dec2008.jar
		// 上传文件自动保存在WebRoot/upload下，如果需要自定义路径的话，通过config的setBaseUploadPath配置

		// 当有其他form提交的时候，先调用getFile()解析MultipartRequest，才能调用getPara接受参数
		getFile();
		UploadFile txFile = getFile("tx","tx");
		UploadFile sftFile = getFile("sft","sfz");
		/*String title = getPara("title");
		System.out.println("title:" + title);
		String subtitle = getPara("subtitle");
		System.out.println("subtitle:" + subtitle);

		getPara("");*/
		
		renderText("uploading");
	}

	// 如果route里已经定义里actionKey为/hello,则会有提示（actionKey already exist）
	/*
	 * public void hello(){
	 *
	 * }
	 */
}
