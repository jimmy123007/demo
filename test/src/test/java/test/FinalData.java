package test;

import java.util.Random;

/**
* @author 郭明
* @date 2017年7月4日下午9:35:28
* @version 1.0
*/

public class FinalData {

	private static Random rand=new Random(46);
	private String id;
	public FinalData(String id){
		this.id=id;
	}
	private final int valueOne=9;
	private static final int VALUE_TWO=99;
	public static final int VALUE_THREE=39;
	private final int i4=rand.nextInt(20);
	static final int INT_5 =rand.nextInt(20);
	private Value v1=new Value(22);
	private final Value v2=new Value(23);
	private static final Value VAL_3=new Value(44);
	private final int[] a={1,2,3,4,5,6};
	public String toString(){
		return id+":"+"i4="+i4+",INT_5"+INT_5;
		
	}
	
	
	public static void main(String[] args) {
		
		FinalData fd1=new FinalData("fd1");
//		fd1.valueOne++;
		fd1.v2.i++;
		fd1.v1=new Value(4);
		for(int i=0;i<fd1.a.length;i++){
			fd1.a[i]++;
		}
		
//		fd1.v2=new Value(0);
//		fd1.VAL_3=new Value(4);
//		fd1.a=new int[4];
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
