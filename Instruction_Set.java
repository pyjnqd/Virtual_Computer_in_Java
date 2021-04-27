package com.company;

import java.util.HashMap;

public class Instruction_Set {

    private HashMap<String, Integer> inst_set;

    public Instruction_Set(){
        inst_set = new HashMap<String, Integer>();
    }
    public void set_one_inst(String opstr, int opcode){
        inst_set.put(opstr, opcode);
    }
    public int get_one_opcode(String opstr){
        return inst_set.get(opstr);
    }
    public void init(){
        this.set_one_inst("NULL", 00);
        this.set_one_inst("READ", 10);
        this.set_one_inst("WRITE", 11);
        this.set_one_inst("LOAD", 20);
        this.set_one_inst("STORE", 21);
        this.set_one_inst("ADD", 30);
        this.set_one_inst("SUB", 31);
        this.set_one_inst("MUL", 32);
        this.set_one_inst("DIV", 33);
        this.set_one_inst("BR", 40);
        this.set_one_inst("BRZ", 41);
        this.set_one_inst("HALT", 43);
    }

}
