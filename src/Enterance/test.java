package Enterance;

import java.util.List;

import TestUnit.totalTest;
import TestUtil.PhoneUtil;
import TestUtil.conText;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		//1.��ȡ��ǰ�������ӵ��ֻ�
		List<String> list = PhoneUtil.getPhoneserNum();
		//2.�жϵ�ǰ�ֻ������Ƿ���������������Ļ�������monkey����������У�Ȼ�����߳�ͳ������ָ��
		if (!list.isEmpty()) {
			System.out.println("## Test main : get Phone info, start testing ##");
			for (String s:list) {
				//System.out.println(s);
				PhoneUtil.runCmd(conText.adb_s+s+conText.adb_monkey);//����monkey
				
				Thread.sleep(5000);//�ȴ�5s ��ֹmonkey��ʼִ��ʱ��ɵĲ�����׼						
				new totalTest(s);//�����̶߳Ե�̨�ֻ��������ܲ��Բ���ȡָ��		
			}			
		} else 
			System.out.println("##Test main:list of phone attached is empty , Please try again##");
	}

}
