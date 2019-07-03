package com.simple.abstractclass;
/**
 * @功能：
 * @author liqiankun
 * @param            
 * @throws
 * @日期 2019年7月3日
 * @时间 上午10:50:08
 */
public class B extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b =new B();
		b.print();
	}

	@Override
	public void print() {
		System.out.println("=========success==========");
	}

}
/*抽象类：抽象类中方法只需要声明，不需要具体的方法内容*/
abstract class A {
	public abstract void print();
}


