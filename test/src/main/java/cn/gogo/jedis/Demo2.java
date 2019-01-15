package cn.gogo.jedis;

/**
* @author 郭明
* @date 2016年3月14日下午7:54:37
* @version 1.0
*/

public class Demo2 {
	public static void main(String[] args) {
		A ab=new B();
		ab=new B();
	}

}
class A{
	static{
		System.out.println("a");
	}
	public A(){
		System.out.println("1");
	}
}

class B extends A{
	static{
		System.out.println("B");
	}
	public B(){
		System.out.println("2");
	}
}
