package day8_modified_line_comparision;

class linecomparision
{
	static int x1;
	static int x2;
	static int y1;
	static int y2;
	static int a1;
	static int a2;
	static int b1;
	static int b2;
	static int length1;
	static int length2;

	void length1(int x1,int x2,int y1,int y2)  	//calculcating the length of  line 1
	{
		length1 = (int)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println("length1 "+length1);
	}
	void length2(int a1,int a2,int b1,int b2)	//calculcating the length of line 2
	{
		length2 = (int)Math.sqrt(((a2-a1)*(a2-a1))+((b2-b1)*(b2-b1)));
		System.out.println("length2 "+length2);
	}
	
	void equal() {
		String s1=String.valueOf(length1);   	//converting int type to string to check equality
		String s2=String.valueOf(length2);
		
		if(s1.equals(s2)) {
			System.out.println("Both line are equal");
		}
		else 
		{
			System.out.println("Lines are not equal ");
		}
	}
	
}
public class Line_Comparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation");
		linecomparision o=new linecomparision();
		o.length1(10, 20, 30, 40);
		o.length2(10, 20, 30, 40);
		o.equal();
	}
}
