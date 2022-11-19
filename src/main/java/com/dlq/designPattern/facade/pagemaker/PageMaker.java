package com.dlq.designPattern.facade.pagemaker;

import com.dlq.utils.FilePathHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author KznAsg
 * @version 2022/9/27  下午 5:18
 * @page 175
 * @link
 */

public class PageMaker {
    private PageMaker() {
    }
    
    public static void makeWelcomePage(String mailAddr, String filename) {
        Properties mailProp = Database.getProperties("maildata");
        String username = mailProp.getProperty(mailAddr);
        String filePath = FilePathHandler.addRootPath(filename);
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filePath));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "欢迎来到 " + username + " 的主页");
            writer.paragraph(" 等着你的邮件哦！");
            writer.mailTo(mailAddr, username);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(filename + " is created for " + mailAddr + " (" + username + ")");
    }
}
