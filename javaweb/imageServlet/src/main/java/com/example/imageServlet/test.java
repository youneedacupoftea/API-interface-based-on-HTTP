package com.example.imageServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class test extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //读取本地图片输入流
        String s[] = {"T5.jpg", "T6.BMP", "T1.jpg", "T2.jpg", "T3.jpg"};
        Random r = new Random();
        int j = r.nextInt(5); //生成[0,5)区间的整数
//        System.out.print(j);
//        FileInputStream inputStream = new FileInputStream("/download/"+s[j]);
        String Path = req.getServletContext().getRealPath("/download/");
        String Pathfinal = Path + s[j];
        FileInputStream inputStream = new FileInputStream(Pathfinal);
        int i = inputStream.available();
        //byte数组用于存放图片字节数据
        byte[] buff = new byte[i];
        inputStream.read(buff);
        inputStream.close();

        //设置发送到客户端的响应内容类型
//        resp.setContentType("image/*");
        resp.setHeader("Content-type", "image/*");
        OutputStream out = resp.getOutputStream();
        out.write(buff);
        out.close();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

}



