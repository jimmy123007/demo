package test;

/**
* @author 郭明
* @date 2017年7月2日下午8:22:28
* @version 1.0
*/

public class Chocolate extends Cookie {
public Chocolate(){
	System.out.println("chocolate");
}
public static void main(String[] args) {
	Chocolate c =new Chocolate();
	System.out.println(c);
	System.exit(0);
}
}
