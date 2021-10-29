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
	
	void length1(int x1,int x2,int y1,int y2)
	{
		int length1 = (int)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println("length1 "+length1);
	}
	void length2(int a1,int a2,int b1,int b2)
	{
		int length2 = (int)Math.sqrt(((a2-a1)*(a2-a1))+((b2-b1)*(b2-b1)));
		System.out.println("length2 "+length2);
	}
	
}
public class Line_Comparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation");
		linecomparision o=new linecomparision();
		o.length1(10, 20, 30, 40);
		o.length2(10, 20, 30, 40);
	}
}
