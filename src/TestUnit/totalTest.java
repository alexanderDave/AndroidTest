package TestUnit;

import TestUtil.conText;

public class totalTest{
	//Tag for Log
	private static final String Tag = "## totalTest :";
	private int times = conText.thread_run; //ִ�д���
	private String devices = null; //�ֻ�ʶ���
	
	public totalTest(String s){
		this.devices = s;
		Start();
	}
	
	public void Start() {
		System.out.println(Tag+ "start()" +" ##");
		new getCpuTest(devices, times).start();	//����Cpu���ݲɼ�
		new getBatteryTest(devices, times).start();	//���е������ݲɼ�
		new getMemTest(devices, times).start();	//�����ڴ����ݲɼ�
	}
	
}
