package com.softeem.len;

public class Test_1 {
	
	public static void main(String[] args) {
		boolean b = false ; // (true / false)
		
		byte by = -128;         // -128 ~ 127 (256)
		short sh = 32767;      // -32768~32767(65536)
		int i = 2147483647;    //-2147483648~2147483647
		long lo = 9223372036854775807L;//-9223372036854775808~9223372036854775807
		
		//���д���С��������ݶ���(double˫���ȸ�����)
		
		float f = 3.14f ;//3.4028235E38
		double d = 3.14 ; //1.7976931348623157E308
		
		int ii = 0xa ;//��ʾΪ16����
		System.out.println( ii );
		int jj = 012 ;//��ʾΪ8����
		System.out.println( jj );
		
		char c = '\u0065'; //0~65535
		
		
		System.out.println( c );
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		
		System.out.println("\"aaa\"");
		System.out.println("\\");  
		System.out.println("\\t");
		
		
		float f2 = 3.14f ;
		long l2 = (long) f2 ;//ǿ��ת��
		
		f2 = l2 ;//�Զ�ת��
		
	}
	
}