package com.moonce.learn.leetcode.twoSum;

public class GetArrayUtil {
    public static int[] getArray(int digit){
        int[] array = new int[digit];
        String toString = "[";
        for (int i = 0;i<array.length;i++) {
            array[i] = (int) (Math.random() * 10);
            toString = toString+array[i]+",";
        }
        if(array.length>0){
            toString=  toString.substring(0,toString.length()-1)+"]";
        }
        System.out.println(toString);
        return array;
    }
}
