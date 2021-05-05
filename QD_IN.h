#include<iostream>
#include<string>
using namespace std; 
#ifndef QD_IN_H
#define QD_IN_H
class QD_IN
{
	public:
		QD_IN(){}
		string input()
		{
			string t="";
			cin >> t;
			return t;
		}
		
};
#endif 
