package com.softeem.packtest;

public class Car {
	public String carbrand = "����";
	public String carname = "����";
	public int price = 700000 ;
	public String displacement = "2.5t" ;
	public String color = "��ɫ" ;
	
	//���췽��
	public Car(){
		
	}
	
	//��ʾ��������Ϣ
	public void showInfo(){
		System.out.println(carbrand);
		System.out.println(carname);
		System.out.println(price);
		System.out.println(displacement);
		System.out.println(color);
	}
	//����
	public void start(){
		System.out.println("��������");
	}
	//ֹͣ
	public void stop(){
		 System.out.println("����ֹͣ");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.carname = "����";
		c.price = 100000 ;
		c.showInfo();
		c.start();
		c.stop();
	}
}
