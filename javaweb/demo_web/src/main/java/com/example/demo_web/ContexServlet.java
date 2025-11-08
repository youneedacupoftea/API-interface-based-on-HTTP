package com.example.demo_web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1.获取web.xml中配置的上下文参数
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
//        2.获取当前的工程路径，格式/工程路径
        String path = context.getContextPath();
        System.out.println("当前工程路径：" + path);
//        3.获取工程部署后在服务器上的绝对路径
        System.out.println("当前工程路径：" + context.getRealPath("/"));
//        4.像MAP一样存取数据
        ServletContext context1 = getServletContext();
        context1.setAttribute("key1", "value1");
        System.out.println(context1.getAttribute("key1"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
