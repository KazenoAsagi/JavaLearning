package com.dlq.designPattern.visitor;

/**
 * @author KznAsg
 * @version 2022/9/17  下午 11:49
 * @page 147
 * @link
 */


public abstract class Visitor {
    public abstract void visit(File file);
    
    public abstract void visit(Directory directory);
}
