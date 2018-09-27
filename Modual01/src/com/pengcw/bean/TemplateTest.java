package com.pengcw.bean;

import java.util.ArrayList;
import java.util.List;

public class TemplateTest {
    private static final Custmer cu1 = new Custmer();
    public static void main(String[] args) {
        System.out.println("天安他");
        //soutp 入参
        System.out.println("args = [" + args + "]");
        int l1 = 10;
        int l2 = 20;
        //soutv 属性
        System.out.println("l2 = " + l2);
        String arr[] = new String[]{"1", "2", "3"};

        List<String> arrList =  new ArrayList<String>();
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
        //iter
        for (String s : arr) {
            
        }
        if (arr == null) {

        }
        if (arr != null) {

        }
        for (int j = 0; j < arr.length; j++) {
            String s1 = arr[j];

        }
        System.out.println("arrList = " + arrList);

        //ifn
        if (arr == null) {

        }

        //inn
        if (arr != null) {

        }

        //.nn
        if (arr != null) {

        }

        //.null
        if (arr == null) {

        }
    }
}
