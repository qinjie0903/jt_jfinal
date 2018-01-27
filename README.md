杨福海：精通JFinal视频
1.1 精通JFinal_课程简介

1.2 JFinal入门_认识JFinal

1.3 JFinal入门_JFinal的HelloWorld
	A.添加jar包至lib目录，并添加到build path
	B.编写web.xml
	<filter>
    <filter-name>jfinal</filter-name>
    <filter-class>com.jfinal.core.JFinalFilter</filter-class>
    <init-param>
      	<param-name>configClass</param-name>
      	<param-value>com.demo.DemoConfig</param-value>
    </init-param>
  	</filter>
  	<filter-mapping>
    	<filter-name>jfinal</filter-name>
    	<url-pattern>/*</url-pattern>
  	</filter-mapping>
	C.编写HelloController和DemoConfig
	D.配置启动项JFinal默认启动类：com.jfinal.core.JFinal(默认80端口)
		通过新建带有main方法到类
		public static void main(String[] args) {
		JFinal.start("WebRoot", 9999, "/", 5);
		}
	E.导出war包tomcat运行
		
1.4 JFinal入门_详解JFinalConfig配置

2.1 JFinal控制器详解_控制器Controller简介

2.2 JFinal控制器详解_Action详解

2.3 JFinal控制器详解_路由详解

2.4 JFinal控制器详解_数据的接收

2.4.1 JFinal控制器详解_getPara接收数据

2.4.2 JFinal控制器详解_getModel和getBean批量数据接收

2.4.3 JFinal控制器详解_getFile接收文件上传

2.4.4 JFinal控制器详解_文件上传与CDN整合

2.4.5 JFinal控制器详解_Http协议讲解






