package com.dlq.designPattern.composite;

/**
 * @author KznAsg
 * @version 2022/9/11  16:50
 * @page
 * @link
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root Entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        
        rootDir.printList("root");
        
        
    }
    
}
