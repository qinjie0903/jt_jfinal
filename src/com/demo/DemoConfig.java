package com.demo;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;

public class DemoConfig extends JFinalConfig {

	public void configConstant(Constants me) {

		// 1.设置开发模式，后台打印输出信息
		me.setDevMode(true);
		// 2.设置文件下载渲染的默认路径
		me.setBaseDownloadPath("download");
		// 3.设置文件上传渲染的默认路径
		me.setBaseUploadPath("wenjian");
		// 4.设置路由视图的默认类型(缺省类型是:FREE_MARKER)
		me.setViewType(ViewType.FREE_MARKER);
		// 5.设置jfinal编码
		me.setEncoding("UTF-8");
		// 6.设置401 error的视图
		me.setError401View("");
		// 7.设置404 error的视图
		me.setError404View("");
		// 8.设置错误渲染的工厂
		me.setErrorRenderFactory(new MyErrorRenderFactory());
		// 9.等同于6.设置401 error的视图
		me.setErrorView(401, "");
		// 10.设置FreeMarker模板引擎的更新时间
		me.setFreeMarkerTemplateUpdateDelay(0);
		// 11.设置FreeMarker模板引擎的默认后缀(缺省：.html)
		me.setFreeMarkerViewExtension("");
		// 13.设置国际化的默认名称
		//me.setI18nDefaultBaseName("");
		// 14.设置国际化的默认语言
		//me.setI18nDefaultLocale("");
		// 15.设置json的工厂
		//me.setJsonFactory(null);
		// 16.设置JSP模板引擎的默认后缀(缺省：.jsp)
		me.setJspViewExtension(".jsp");
		// 17.设置主渲染的工厂
		//me.setMainRenderFactory(null);
		// 18.设置文件上传的大小
		me.setMaxPostSize(1024 * 1024 * 100);
		// 19.设置 devMode 之下的 action report 是否在 invocation 之后，默认值为 true
		me.setReportAfterInvocation(false);
		// 20.设置token的缓存
		me.setTokenCache(null);
		// 21.设置url参数的分隔符（缺省：-）
		//me.setUrlParaSeparator("@");

	}

	public void configRoute(Routes me) {
		me.add("/", IndexController.class);
		me.add("/hello", HelloController.class);
		me.add("/test", TestController.class, "test/index"); 
	}

	public void configPlugin(Plugins me) {
	}

	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
	}
}
