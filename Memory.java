package com.company;

import java.util.ArrayList;

public class Memory {
    private Instruction[] code_area;
    private int[] stack;

    public Memory(){
        this.code_area = new Instruction[1000];
        this.stack = new int[1000];
    }
    public void set_data_with_index(int index, int data){
        stack[index] = data;
    }
    public void set_inst_with_index(int index, Instruction inst){
        code_area[index] = inst;
    }
    public int get_data_with_index(int index){
        return stack[index];
    }
    public Instruction get_inst_with_index(int index){
        return code_area[index];
    }
}
