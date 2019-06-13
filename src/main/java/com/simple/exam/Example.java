package com.simple.exam;

/**
 * @author 作者 E-mail:
 * @date 创建时间：2017年9月27日 上午11:22:33
 * @version 1.0
 * @parameter
 * @since 人保考试测试题
 * @return good and gbc
 */
public class Example {
	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };

	public static void main(String args[]) {
		Example ex = new Example();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + "and");
		System.out.println(ex.ch);
	}

	public void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'g';
	}
}
