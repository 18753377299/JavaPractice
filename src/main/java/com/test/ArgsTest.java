package com.test;
/**
 * @功能：
 * @author liqiankun
 * @param            
 * @throws
 * @日期 2019年7月3日
 * @时间 上午10:15:08
 */
public class ArgsTest {
	public static void main(String []args) {
		if(args.length>0) {
			System.out.println("===================");
			for(String str:args) {
				System.out.println(str);
			}
			System.out.println("============="+args[2]);
		}else {
			System.out.println("=========error==========");
			System.exit(1);
		}
	}
}
