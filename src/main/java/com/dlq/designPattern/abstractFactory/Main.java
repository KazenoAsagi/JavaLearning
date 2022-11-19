package com.dlq.designPattern.abstractFactory;

import com.dlq.designPattern.abstractFactory.factory.Factory;
import com.dlq.designPattern.abstractFactory.factory.Link;
import com.dlq.designPattern.abstractFactory.factory.Page;
import com.dlq.designPattern.abstractFactory.factory.Tray;

import java.util.Scanner;

/**
 * @author KznAsg
 * @version 2022/9/8  9:47
 * @page
 * @link
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("请输入本次生成的工厂的全限定名：");
        /*
         * 可以输入的工厂名：
         * com.dlq.designPattern.abstractFactory.listFactory.ListFactory
         *  */
        String inputClassName = null;
        try (Scanner scanner = new Scanner(System.in)) {
            inputClassName = scanner.nextLine();
        }
        assert inputClassName != null;
        // 如果nextLine没有字符，getFactory()会报错
        Factory factory = Factory.getFactory(inputClassName);
        assert factory != null;
        
        
        Link people = factory.createLink("人民网", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明网", "http://www.gmw.cn");
        
        Tray newsTray = factory.createTray("日报");
        newsTray.add(people);
        newsTray.add(gmw);
        
        Link bilibili = factory.createLink("Bilibili", "http://www.bilibili.com");
        Link excite = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");
        
        Tray frequentTray = factory.createTray("日报");
        newsTray.add(bilibili);
        newsTray.add(excite);
        newsTray.add(google);
        
        Page page = factory.createPage("LinkPage", "戴立奇");
        page.add(newsTray);
        page.add(frequentTray);
        page.output();
        
    }
}
