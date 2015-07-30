package com.app.demo.listener;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener,
		HttpSessionAttributeListener {

	private static HashMap _U = new HashMap();

	// 参数
	ServletContext sc;

	List list = new ArrayList();

	public static HashMap get_U() {
		return _U;
	}

	/**
	 * 返回在线用户数量
	 * 
	 * @return
	 */
	public static int size() {
		return get_U().size();
	}

	public static void set_U(HashMap _u) {
		_U = _u;
	}

	// 在session中添加对象时触发此操作，在list中添加一个对象
	public void attributeAdded(HttpSessionBindingEvent sbe) {
		list.add((String) sbe.getValue());
		System.out.println(sbe.getValue());
		sc.setAttribute("list", list);
	}

	// 修改、删除session中添加对象时触发此操作
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("===attributeRemoved===");
	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("===attributeReplaced===");
	}

	public static float getOnlineHour(Timestamp tsp) {
		return 1f;
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		sc = se.getSession().getServletContext();
		System.out.println("新建一个session");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("销毁一个session");
		if (!list.isEmpty()) {
			list.remove((String) se.getSession().getAttribute("userName"));
			sc.setAttribute("list", list);
		}
	}

}
