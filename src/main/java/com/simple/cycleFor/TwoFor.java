package com.simple.cycleFor;

/**
 * @功能：99 乘法表
 * @author liqiankun
 * @param            
 * @throws
 * @日期 20190613
 */
public class TwoFor {
	public static void main(String []args) {
		for (int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println("");
		}
	}
}
