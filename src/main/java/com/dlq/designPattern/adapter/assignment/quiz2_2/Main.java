package com.dlq.designPattern.adapter.assignment.quiz2_2;

import java.io.IOException;

/**
 * @author KznAsg
 * @version 2022/8/27  19:42
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        String basePath = "C:\\Users\\KznAsg\\IdeaProjects\\JavaLearning\\src\\main\\resources\\";
        // URL url = Main.class.getClassLoader().getResource("file.txt");
        try {
            // TODO: 不知道如何才能读取file文件
            f.readFromFile(basePath + "file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile(basePath + "newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
