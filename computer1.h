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

			// ��ʼ�������ָ��Ԥ��д���ڴ�Ĵ����
			int i = 0;//��������
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
