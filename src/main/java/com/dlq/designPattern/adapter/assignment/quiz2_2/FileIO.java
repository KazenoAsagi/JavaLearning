package com.dlq.designPattern.adapter.assignment.quiz2_2;

import java.io.IOException;

public interface FileIO {
    void readFromFile(String filename) throws IOException;
    
    void writeToFile(String filename) throws IOException;
    
    void setValue(String key, String value);
    
    String getValue(String key);
}
