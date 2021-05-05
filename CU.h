#include<string>
#include "QD_IN.h"
#include "QD_out.h"
#include "ALU.h"
#include "memory.h"
#ifndef QD_CU_H
#define QD_CU_H
class QD_CU
{
 
	public:
		QD_CU(){
			PC = 0;
		}

		void work(memory meo){

			while(1)
			{
				int opcode = meo.getprogram(PC).get_opcode();
				int opvalue = meo.getprogram(PC).get_opvalue();
				PC++;

				if(opcode==10)
				{
					cout << "please enter a number" << endl;
					int a;
					cin >> a;
					alu.setR0(a);
					meo.setdata(opvalue, alu.getR0());
				}
				else if(opcode==11) 
				{
					alu.setR0(meo.getdata(opvalue));
					out.output(to_string(alu.getR0()));
				}
				else if(opcode==20)
				{
					alu.setR0(meo.getdata(opvalue));
				}
				else if(opcode==21)
				{
					meo.setdata(opvalue, alu.getR0());
				}
				else if(opcode==30)
				{
					alu.setR0(alu.add(meo.getdata(opvalue)));
				}
				else if(opcode==31)
				{
					alu.setR0(alu.sub(meo.getdata(opvalue)));
				}
				else if(opcode==32)
				{
					alu.setR0(alu.mul(meo.getdata(opvalue)));
				}
				else if(opcode==33)
				{
					alu.setR0(alu.div(meo.getdata(opvalue)));
				}
				else if(opcode==40)
				{
					this->PC = opvalue;
				}
				else if(opcode==41)
				{ 
					if(alu.getR0()==0){this->PC = opvalue;}
				}
				else if(opcode==43)
		     	{
					 cout << "machine will stop!" << endl;
					 exit(0);
				}
			}
		}
	private:
		ALU alu;
		QD_IN in;
		QD_OUT out;
		int PC;
};
#endif
