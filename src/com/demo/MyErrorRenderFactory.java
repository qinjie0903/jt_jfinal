package com.demo;

import com.jfinal.render.IErrorRenderFactory;
import com.jfinal.render.Render;
import com.jfinal.render.TextRender;

public class MyErrorRenderFactory implements IErrorRenderFactory {

	@Override
	public Render getRender(int errorCode, String view) {
		return new TextRender("hi jfinal,this is 404 error");
	}

}
