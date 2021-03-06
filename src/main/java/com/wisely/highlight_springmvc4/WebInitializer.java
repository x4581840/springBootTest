package com.wisely.highlight_springmvc4;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * WebApplicationInitializer是spring提供用来配置Servlet3.0+配置的接口，从而实现了替代web.xml的位置
 * 实现此接口将会自动被SringServletContainerInitializer（用来启动serlvet3.0容器）获取到
 * @author Administrator
 *
 */
public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(MyMvcConfig.class);
		//新建WebApplicationContext，注册配置类，并将其和当前servletContext关联
		ctx.setServletContext(servletContext);
		
		//注册Spring MVC的DispatcherServlet。
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);

	}

}
