#include "CU.h"
#include "memory.h"
#include "inst.h"
#include <string>
#include <cstring>
#include <iostream>
using namespace std;
#ifndef computer1_H
#define computer1_H


class computer1
{
	public:
		computer1(){}
		void run()
		{
			cout << "please enter instruction numbers \n";

			// 开始把输入的指令预先写入内存的代码段
			int i = 0;//迭代变量
			string codes = "";
			cin >> codes;
			while(codes != "finish")
			{
				int opcode = stoi(codes.substr(0,2));
				int opvalue = stoi(codes.substr(2,2));
				meo.setprogram(i, inst(opcode, opvalue));
				cin >> codes;
				i++;
		    }
		    cu.work(meo);
		}
	   
	private:
		memory meo;
		QD_CU cu;
 };
 #endif
