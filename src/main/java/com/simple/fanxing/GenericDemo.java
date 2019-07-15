package com.simple.fanxing;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月15日 下午3:01:22
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class GenericDemo {

	public static void main(String[] args) {
		Info<Integer> info =fun(30);
		System.out.println(info.getVar());
	}
	
	public static <T extends Number> Info<T> fun(T param){
		Info<T> info = new Info<T>();
		info.setVar(param);
		
		return info;
	}

}

class Info<T extends Number>{
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	@Override
	public String toString() {
		return this.var.toString();
	}
}
