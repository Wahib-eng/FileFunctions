package com.withWahib;

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        File str=new File("E:\\خطوطي\\4_F1.ttf");// اسم الملف
        File str1=new File("E:\\خطوطي");
        System.out.println(str.exists());// هل الملف المحدد موجود ؟
        System.out.println(str.isFile());//هل هذا مستند؟
        System.out.println(str1.isDirectory());//هل هذا ملف  ؟
        System.out.println(str.canRead());//هل ممكن قرائته ؟
        System.out.println(str.canWrite());//هل كتابته ؟
        System.out.println(str.isAbsolute());//
        System.out.println(str1.isHidden());// هل الملف مخفي ؟
        System.out.println(str.canExecute());//هل يمكن استخراجه ؟
        System.out.println(str.getAbsoluteFile());//
        System.out.println(str.getAbsolutePath());//مكان الملف !
        System.out.println(str.getName());// أسم الملف !
        System.out.println(str.getParentFile());
        System.out.println(new Date(str.lastModified()));//أخر وقت تعدل الملف

    }
}