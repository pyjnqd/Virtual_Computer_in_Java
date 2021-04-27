package com.company;

import java.util.zip.InflaterInputStream;

public class Controller {
    private int PC;
    public Memory MM;
    public IO io;
    public ALU alu;
    public Controller(){
        this.PC = 0;
    }
    public void init(Memory MM){
        alu = new ALU();
        io = new IO();
        this.MM = MM;
    }
    public void execute(){
        while(true){
            Instruction current_inst = MM.get_inst_with_index(get_pc());
            pcadd();
            int opvalue = current_inst.get_inst_opvalue();
            switch(current_inst.get_inst_opcode()){
                case 10:
                    MM.set_data_with_index(opvalue, Integer.parseInt(io.read()));
                    break;
                case 11:
                    io.write(String.valueOf(MM.get_data_with_index(opvalue)));
                    break;
                case 20:
                    alu.set_r0(MM.get_data_with_index(opvalue));
                    break;
                case 21:
                    MM.set_data_with_index(opvalue, alu.get_r0());
                    break;
                case 30:
                    alu.set_r0(alu.get_r0() + MM.get_data_with_index(opvalue));
                    break;
                case 31:
                    alu.set_r0(alu.get_r0() - MM.get_data_with_index(opvalue));
                    break;
                case 32:
                    alu.set_r0(alu.get_r0() * MM.get_data_with_index(opvalue));
                    break;
                case 33:
                    alu.set_r0(alu.get_r0() / MM.get_data_with_index(opvalue));
                    break;
                case 40:
                    set_pc(opvalue);
                    break;
                case 41:
                    if(alu.get_r0()==0) set_pc(opvalue);
                    break;
                case 43:
                    System.out.println("机器停机");
                    System.exit(0);
                    break;


            }

        }
    }
    private void pcadd(){
        this.PC++;
    }
    public void set_pc(int pc_value){
        this.PC = pc_value;
    }
    public int get_pc(){
        return PC;
    }
}
