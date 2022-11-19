package com.dlq.designPattern.abstractFactory.factory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author KznAsg
 * @version 2022/9/8  9:25
 * @page 80
 * @link
 */
public abstract class Factory {
    public static Factory getFactory(String classname) {
        try {
            Factory factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
            return factory;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException |
                 InvocationTargetException e) {
            System.err.println("没有找到" + classname + "类");
            e.printStackTrace();
        }
        return null;
    }
    
    public abstract Link createLink(String caption, String url);
    
    public abstract Tray createTray(String caption);
    
    public abstract Page createPage(String title, String author);
    
}
