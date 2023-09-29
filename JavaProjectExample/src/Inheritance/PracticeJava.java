

package Inheritance;

class Demo112
{
	void show() {
		Inner o1=new Inner();
		o1.sumDisplay();
	}
	class Inner{


		int num=1;
		void sumDisplay()
		{

			if(num<=100)
			{
				if(num%8==0)
				{
					System.out.println("outer class");
					System.out.print(" "+num);
				}
				num++;
				sumDisplay();
				
				}
		}	
	}

}
public class PracticeJava {

	public static void main(String[] args) {

		Demo112 o=new Demo112();
		o.show();
	}

}
