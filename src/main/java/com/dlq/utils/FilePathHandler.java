package com.dlq.utils;

/**
 * @author KznAsg
 * @version 2022/9/27  下午 6:01
 * @page
 * @link
 */

public class FilePathHandler {
    private static final String resourceRoot = "src/main/resources/";
    
    public static String addRootPath(String filename) {
        return resourceRoot + filename;
    }
    
    
}
