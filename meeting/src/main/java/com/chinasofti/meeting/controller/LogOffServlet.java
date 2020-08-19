package com.chinasofti.meeting.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



	public class LogOffServlet extends HttpServlet {

		
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			doPost(request, response);//
		}

		
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			//获取session
			HttpSession session = request.getSession();
			//让session失效
			session.invalidate();
			//跳转页面
			request.setAttribute("msg", "已经登出，请重新登录");
			//request.getRequestDispatcher("../login.jsp").forward(request, response);
			response.sendRedirect("../login.jsp");
		}
}
