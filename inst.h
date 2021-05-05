#include <iostream>
#include <string>
using namespace std; 
#ifndef inst_H
#define inst_H
class inst
{
	public:
        inst(){}
	inst(int opcode, int opvalue){this->opcode = opcode;this->opvalue = opvalue;}
        void set_opcode(int opcode){this->opcode = opcode;}
        void set_opvalue(int opvalue){this->opvalue = opvalue;}
        int get_opcode(){return opcode;}
        int get_opvalue(){return opvalue;}
	private:
        int opcode;
        int opvalue;	
};
#endif 