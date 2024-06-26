package com.itheima.a01myexception;

public class ExceptionDemo11 {
    public static void main(String[] args) {
        /*
            public String getMessage()          返回此throwable的详细消息字符串
            public String toString()            返回此可抛出的简短描述


            public void printStackTrace()       在底层是利用System.err.println进行输出
                                                把异常的错误信息输出在控制台
                                                细节：仅仅是打印信息，不会停止程序运行
         */

        int[] arr = {1, 2, 3, 4, 5, 6};

        //快捷键 ctrl + alt + t
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            /*String message = e.getMessage();
            System.out.println(message);//Index 10 out of bounds for length 6*/

            /*String str = e.toString();
            System.out.println(str);//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6*/

            e.printStackTrace();
        }

        System.out.println("看看我执行了吗？");

    }
}



















