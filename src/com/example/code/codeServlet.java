package com.example.code;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author luyang
 * @ClassName servlet
 * @description 〈功能详细描述〉
 * @time 2019/5/817:52
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class codeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 生成验证码图片
        int width = 150;
        int heigth = 50;
        BufferedImage bufferedImage = new BufferedImage(width,heigth,BufferedImage.TYPE_INT_BGR);
        //获取画笔
        Graphics2D graphics = bufferedImage.createGraphics();
        //生成四位随意的验证码
        String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        //将生成的随机数画到图片上
        //将生成的验证码图片展示到页面上
        ImageIO.write(bufferedImage,"png",resp.getOutputStream());

    }
}
