package com.toov5.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * ����springmvc--dispatcherservlet
 * ���������ӿ� ��ʼ��dispatcherservlet
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// ���ظ����� ���ظ�������Ϣ spring���� 
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { RootConfig.class };
	}

	// ����SpringMVC���� springmvc ����������Ϣ
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { WebConfig.class };  //�൱��һ�������������һ��Class
	}

	// SpringMVCDispatcherServlet ���ص����� /   ������������
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}