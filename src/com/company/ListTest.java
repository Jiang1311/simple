package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: simple
 * @description:
 * @author: jiangjianmin
 * @create: 2022/5/9 10:49
 **/
public class ListTest {
    public static void main(String[] args) {
        List<String> srcList = new ArrayList();
        Collections.addAll(srcList, "1", "2", "3","4","5","6","7","8","9");
        srcList.forEach(System.out::print);
        System.out.println();
        List<String> removeList = new ArrayList();
        Collections.addAll(removeList,  "3","7","8");
        srcList.removeAll(removeList);
        removeList.addAll(srcList);
        srcList = removeList;
        srcList.forEach(System.out::print);
    }
}
