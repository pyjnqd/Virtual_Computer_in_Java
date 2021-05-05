#ifndef QD_ALU_H
#define QD_ALU_H
class ALU
{
	public:
		int getR0(){ return R0; }
		void setR0(int value){ R0 = value; }
		int add(int value){ return R0+value;}
		int sub(int value){ return R0-value;}
		int mul(int value){ return R0*value;}
		// 整数除法 所以返回的是int
		int div(int value){ return R0/value;}
	private:
		int R0;//�Ĵ��� 

};
#endif 
