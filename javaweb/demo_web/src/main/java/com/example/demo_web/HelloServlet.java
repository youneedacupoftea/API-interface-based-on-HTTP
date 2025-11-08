package com.example.demo_web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

// 实现servlet方法
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("1.构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init方法");
        System.out.println("helloServlet程序的别名是：" + servletConfig.getServletName());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * service方法是专门用来处理请求和响应的
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3.hello servlet 被访问了");
        //类型转换，因为它有getMethod()方法
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        //获得请求方式
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)) {
            doGet();
        } else if ("POST".equals(method)) {
            doPost();
        }
    }

    /**
     * 做get请求的操作
     */
    public void doGet() {
        System.out.println("GET请求");
        System.out.println("GET请求");
    }

    /**
     * 做post请求的操作
     */
    public void doPost() {
        System.out.println("POST请求");
        System.out.println("POST请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.销毁方法");

    }
}