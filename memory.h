#include<string>
#include "inst.h"
#ifndef MEMORY_H
#define	MEMORY_H
class memory
{
	public:

		memory(){};

		void setdata(int index, int value){ data[index] = value;}
		void setprogram(int index, inst one_inst){ program[index] = one_inst;}
		inst getprogram(int index){ return program[index]; }
		int getdata(int index){ return data[index]; }
	private:
	    inst program[10];
		int data[50];
};
#endif
