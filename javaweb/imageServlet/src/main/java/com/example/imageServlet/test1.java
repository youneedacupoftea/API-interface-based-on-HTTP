package com.example.imageServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class test1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String s[] = {"T5.jpg", "T6.BMP", "T1.jpg", "T2.jpg", "T3.jpg"};
        Random r = new Random();
        int j = r.nextInt(5); //生成[0,5)区间的整数
//        String realPath = getServletContext().getRealPath("/download/"+s[j]);
        String Path = req.getServletContext().getRealPath("/download/");
        String Pathfinal = Path + s[j];
        //创建字节输出流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(Pathfinal));
        //设置响应头支持的类型为字节流
        resp.setHeader("Content-Type", "application/octet-stream");

        //设置响应头以下载方式打开 以附件形式处理内容
        resp.setHeader("Content-Disposition", "attachment;filename=" + System.currentTimeMillis() + ".jpg");

        //获取字节输出流对象
        ServletOutputStream sos = resp.getOutputStream();

        //循环读写文件
        int i = bis.available();
        byte[] arr = new byte[i];
        int len;
        while ((len = bis.read(arr)) != -1) {
            sos.write(arr, 0, len);
        }
        //释放资源
        bis.close();
        sos.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
