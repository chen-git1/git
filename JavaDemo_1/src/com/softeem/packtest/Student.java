package com.softeem.packtest;

//ѧ����
public class Student {
	// ��������
	public int stuid; // ѧ��ѧ��
	public String stuname; // ѧ������
	public String stusex; // ѧ���Ա�
	public String _email; 
	public String $phone ;

	// ������ (���췽��)
	// ���췽���ķ������뵱ǰ���������һ�µ�
	// ���췽��û�з�������(void)
	// ���û��ڵ��õ�ǰ���еĹ�����ʱ.���������û�ж��幹����.ϵͳ��Ϊ����Ĭ�϶���һ��
	// �޲����Ĺ�����,����ʹ��
	public Student() {
		System.out.println("ѧ���๹����ִ����!!!");
	}

	// ������Ϊ (����)
	public void study() {
		System.out.println("ѧ����ѧϰ");
	}

	/**
	 * �˷�����ʾѧ������Ϸ����
	 * 
	 * @author Pei
	 */
	public void playGame() {

		System.out.println("ѧ��������Ϸ");

	}

	/**
	 * ��ڷ���
	 * @param args  һ������
	 * @author pei
	 * @version 1.0
	 * @return ��
	 */
	public static void main(String[] args) {
		// new�ؼ��ֵ���Student()���췽��,���һ᷵��һ��ѧ�������:stu
		Student stu = new Student();
		stu.study();// ����study����
		stu.playGame();// ����playGame����
		stu.stuid = 10;
		stu.stuname = "С��";
		stu.stusex = "��";
		stu.$phone = "123";
		System.out.println(stu.stuid);
		System.out.println(stu.stuname);
		System.out.println(stu.stusex);
	}
}
