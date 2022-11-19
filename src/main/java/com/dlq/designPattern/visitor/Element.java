package com.dlq.designPattern.visitor;

/**
 * @author KznAsg
 * @version 2022/9/17  下午 11:55
 * @page 015
 * @link
 */

public interface Element {
    void accept(Visitor v);
}
