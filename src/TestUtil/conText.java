package TestUtil;

import java.io.File;

public class conText {
	//base_orders
	public static final int thread_run = 5;
	public static final String run_times = " 10000 ";
	public static final String show_devices = "adb devices ";
	public static final String adb_s = "adb -s ";
	public static final String adb_monkey = " shell monkey -p " + conText.pkgName_zm + conText.run_times; //" --throttle 100 "+
	//test_package relative:
	public static final String pkgName_zm = "com.tylauncher.home";//�������
//	public static final String pkgName = "";
//	public static final String pkgName = "";
//	public static final String pkgName = "";
	public static final String className_zm = "com.miui.home.launcher.Launcher";//������Ӧ������

	//test orders
	public static final String batteryInfo_old = " shell dumpsys batterystats ";//4.4+ ϵͳ�ĵ��ѯ����
	public static final String batteryInfo_new = " shell dumpsys batteryinfo ";//4.4-    ϵͳ�ĵ��ѯ����
	public static final String mem_info = " shell dumpsys meminfo "; //�鿴�ڴ�����ָ��
	public static final String cpu_info = " shell dumpsys cpuinfo "; //�鿴cpuʹ����ָ��

	//need adb -s before if more than one devices;
	public static final String get_sys_version = " shell getprop ro.build.version.release "; //ϵͳ�汾��
	public static final String get_androidApi_version = " shell getprop ro.build.version.sdk "; //api�汾��
	public static final String start_activity = " shell am start -a android.intent.action.MAIN -c android.intent.category.LAUNCHER -n ";
	public static final String get_pid = " shell ps | grep ";
	
	//save_File_path
	public static final String savePath = "E:"+File.separator+"Test_"+File.separator;
}
