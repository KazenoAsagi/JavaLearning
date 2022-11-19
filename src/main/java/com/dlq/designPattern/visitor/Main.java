package com.dlq.designPattern.visitor;

/**
 * @author KznAsg
 * @version 2022/9/18  上午 12:25
 * @page
 * @link
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        rootDir.accept(new ListVisitor());
        
        System.out.println();
        System.out.println("Making user entries...");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");
        usrDir.add(yuki);
        usrDir.add(hanako);
        usrDir.add(tomura);
        
        yuki.add(new File("diary.html", 100));
        yuki.add(new File("composite.java", 200));
        tomura.add(new File("memo.tex", 200));
        hanako.add(new File("game.doc", 200));
        tomura.add(new File("junk.mail", 200));
        rootDir.accept(new ListVisitor());
        
    }
}
