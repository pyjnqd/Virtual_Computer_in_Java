package com.company;

/**
 * 指令类
 * 用于构造指令集和新建指令执行序列
 * opvalue为单操作数指令的操作数值
 * 如opvalue=-1，则为多操作数指令（如带偏移量的对象）
 */
public class Instruction{
    private int opcode;
    private int opvalue;
    // opvalue_addition 用于可扩展的指令集
    private String opvalue_addition;

    public Instruction(int opcode, int opvalue){
        this.opcode = opcode;
        this.opvalue = opvalue;
    }
    // override NPU 可扩展指令构造
    public Instruction(int opcode, int opvalue, String opvalue_addition){
        this.opcode = opcode;
        this.opvalue = opvalue;
        this.opvalue_addition = opvalue_addition;
    }
    public int get_inst_opcode(){return this.opcode;}
    public int get_inst_opvalue(){return this.opvalue;}

}