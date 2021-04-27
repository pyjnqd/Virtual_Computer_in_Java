package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Instruction_Set inst_set = new Instruction_Set();
        inst_set.init();
        System.out.println("请输入指令序列，以换行符分隔不同的指令");
        Scanner sc = new Scanner(System.in);
        Memory MM = new Memory();
        int i = 0;
        while(!sc.hasNext("#")){
            String[] tmp = sc.nextLine().split(" ");
            // 指令目前长度暂定为2，仅接受单操作数的指令
            Instruction inst_tmp;
            if(tmp.length == 2) {
                inst_tmp = new Instruction(inst_set.get_one_opcode(tmp[0]), Integer.parseInt(tmp[1]));
                MM.set_inst_with_index(i, inst_tmp);
                i++;
            }
            else {
                System.err.println("指令格式错误");
            }
        }
        System.out.println("已翻译得到机器指令并加载进内存");
        Controller CU = new Controller();
        CU.init(MM);
        CU.execute();
    }
}
/* 测试指令序列
READ 07
READ 08
LOAD 07
DIV 08
STORE 09
WRITE 09
BR 10
NULL 00
NULL 00
NULL 00
HALT 00
#
 */