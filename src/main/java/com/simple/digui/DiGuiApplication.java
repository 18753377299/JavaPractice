package com.simple.digui;

import com.vo.Gps;

/**
 * @功能：通过递归求1-100的和
 * @author liqiankun
 * @param            
 * @throws 递归调用必须有一个明确的结束的条件
 * @日期 2019年6月17日
 * @时间 上午11:07:45
 */
public class DiGuiApplication {
	

	public static void main(String []args) {
		System.out.println(sum(100));
		System.out.println(sumTotal(5));
		String aa="hello";
		Gps Gps =new Gps(39,116);
		
	}
	
	/*加法递归*/
	public static double sum(double num) {
		if(num==1) {
			return 1;
		}else {
			return num+ sum(num-1);
		}
	}
	/*乘法递归结果求和*/
	public static double sumTotal(double num) {
		if(num==1) {
			return 1;
		}else {
			return multiply(num)+sumTotal(num-1);
		}
//		double sum =0;
//		for(int i=1;i<=num;i++) {
//			sum+=multiply(i);
//		}
//		return sum;
	}
	/*乘法递归*/
	private static double multiply(double num) {
		if(num==1) {
			return 1;
		}else {
			return num*multiply(num-1);
		}
	}
	
}
