package com.example.demo_httpservletrequest;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class requestAPIservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置内容类型为image/jpg
//        resp.setContentType("image/jpeg");
//        //输出流
//        ServletOutputStream out = resp.getOutputStream();
//        //图片路径
//        FileInputStream fin = new FileInputStream("D:\\作业\\偏度.jpg");
//        //创建一个 BufferedInputStream并保存其参数输入流
//        BufferedInputStream bin = new BufferedInputStream(fin);
//        BufferedOutputStream bout = new BufferedOutputStream(out);
//
//        int ch = 0;
//        while ((ch= bin.read())!=-1){
//            //展示图像
//            bout.write(ch);
//        }
//        // close all classes
//        bin.close();
//        fin.close();
//        bout.close();
//        out.close();

    }
}
