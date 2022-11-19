package com.dlq.renamingForMoehui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class RenamingTest {
    public static void main(String[] args) {
        System.out.println("这个程序可以搜索输入目录的一层子目录中的 info.txt，");
        System.out.println("并用 info.txt 中的内容命名文件夹。");
        System.out.println("请输入目录：");
        String rootPath = OpenInfoTxt.getPathFromScanner();
        File rootDir = new File(rootPath);
        File[] childDirs = rootDir.listFiles();
        
        for (int i = 0; i < childDirs.length; i++) {
            File childDir = childDirs[i];
            File[] infoTxt = childDir.listFiles((root, name) -> name.equals("info.txt"));
            String nameOfDoujin = null;
            for (int j = 0; j < infoTxt.length; j++) {
                File info = infoTxt[j];
                try (BufferedReader infoReader = new BufferedReader(new FileReader(info))) {
                    nameOfDoujin = infoReader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (nameOfDoujin != null) {
                Path doujinFullPath = Path.of(rootPath, nameOfDoujin);
                boolean flag = childDir.renameTo(new File(String.valueOf(doujinFullPath)));
                if (flag) {
                    System.out.println("成功命名：" + doujinFullPath);
                } else {
                    throw new RuntimeException("命名时出错！");
                }
            } else {
                System.out.printf("未能在 %s 中找到 info.txt \n", childDir);
            }
        }
        
        
    }
}
