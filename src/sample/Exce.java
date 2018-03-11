package sample;

import java.io.IOException;

public class Exce {
	
	
	public String add(int a , int b)
	{
		
		
		int c;
		
		c=a+b;
		
		System.out.println(c);
		return  "pass";
		
	}
	

	public static void main(String[] args) throws Exception, IOException, ArrayIndexOutOfBoundsException, InterruptedException {
	
		Exce obj=new Exce();
		
		String res=obj.add(200, 300);
		System.out.println(res);

	}
	
	

}
