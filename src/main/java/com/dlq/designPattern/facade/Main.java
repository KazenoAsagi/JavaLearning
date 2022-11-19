package com.dlq.designPattern.facade;

import com.dlq.designPattern.facade.pagemaker.PageMaker;

/**
 * @author KznAsg
 * @version 2022/9/27  下午 4:56
 * @page
 * @link
 */

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
        
    }
}
