package com.simple.thread_10;
/**
 * @功能：
 * @author liqiankun
 * @param            
 * @throws
 * @日期 2019年7月4日
 * @时间 下午7:33:25
 */
public class ShareThread {

	public static void main(String[] args) {
		ShareMyThread  smt= new ShareMyThread();
		
		new Thread(smt).start();
		new Thread(smt).start();
		new Thread(smt).start();
	}

}
class ShareMyThread implements Runnable{
	private int target =6;
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			if(target>0) {
				System.out.println("target:"+target--);
			}
		}
		
	}
	
}
