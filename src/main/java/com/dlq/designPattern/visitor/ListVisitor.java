package com.dlq.designPattern.visitor;

/**
 * @author KznAsg
 * @version 2022/9/18  上午 12:11
 * @page
 * @link
 */

public class ListVisitor extends Visitor {
    private String currentDir = "";
    
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }
    
    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        
        for (Entry entry : directory) {
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
