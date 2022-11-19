package com.dlq.designPattern.facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

/**
 * @author KznAsg
 * @version 2022/9/27  下午 5:01
 * @page 174
 * @link
 */

class HtmlWriter {
    private final Writer writer;
    
    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }
    
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        // 指定编码，防止乱码
        writer.write("<meta charset=\"UTF-8\">");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("<h1>" + title + "</h1>");
    }
    
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>\n");
    }
    
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }
    
    public void mailTo(String mailAddr, String username) throws IOException {
        link("mailto:" + mailAddr, username);
    }
    
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
