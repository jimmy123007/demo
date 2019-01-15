package cn.gogo.jedis;

/**
* @author 郭明
* @date 2016年3月10日下午10:03:28
* @version 1.0
*/

public class Demo1 implements Demo {

	public String getName() {
		return null;
	}
	
	public static void main(String[] args) {
		Demo d=new Demo1();
		System.out.println(d.getClass().getName());
	}

}
