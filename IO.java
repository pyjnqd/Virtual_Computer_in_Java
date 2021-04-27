package com.company;

import java.util.Scanner;

public class IO {
    private Scanner sc;
    public IO(){ sc = new Scanner(System.in);}
    public String read(){
        System.out.println("请输入控制台需要读入的内容：");
        return sc.nextLine();
    }
    public void write(String str){
        System.out.println(str);
    }
}
