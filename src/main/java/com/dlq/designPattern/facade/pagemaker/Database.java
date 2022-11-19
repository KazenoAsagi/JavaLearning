package com.dlq.designPattern.facade.pagemaker;

import com.dlq.utils.FilePathHandler;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author KznAsg
 * @version 2022/9/27  下午 4:56
 * @page 174
 * @link
 */

class Database {
    public Database() {
    }
    
    public static Properties getProperties(String dbname) {
        String filename = FilePathHandler.addRootPath(dbname) + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
        
    }
}
