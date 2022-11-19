package com.wfm;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author KznAsg
 * @version 2022/9/9  22:13
 * @page
 * @link
 */

public class ListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        arrayList.add(1);
        
        Integer arrayListVar1 = arrayList.get(0);
        Scanner scanner = new Scanner(System.in);
        String nextLine = "";
        int i = 0;
        while ((nextLine = scanner.nextLine()) != null) {
            i++;
            System.out.println(nextLine);
        }
        String s = """
                  select * from ad.agan where
                  arrayList
              """;
        // "select * from " + arrayList.get(gsdiong) +" where"
    }
}
