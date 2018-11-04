package com.wisely.classes.test;

import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class WebMvcConfigurerAdapterTest extends WebMvcConfigurerAdapter{

	@Override
	public MessageCodesResolver getMessageCodesResolver() {
		// TODO Auto-generated method stub
		System.out.println("test");
		//return super.getMessageCodesResolver();	
		DefaultMessageCodesResolver messageCodesResolver = 
				new DefaultMessageCodesResolver();
		return messageCodesResolver;
	}
	
	public static void main(String[] args) {
		WebMvcConfigurer webMvcConfigurer = 
				new WebMvcConfigurerAdapterTest();
		((DefaultMessageCodesResolver)webMvcConfigurer.getMessageCodesResolver()).setPrefix("dd");
		
	}
	
}
