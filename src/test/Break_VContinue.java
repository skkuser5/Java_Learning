package test;

public class Break_VContinue {
	int instance1;
	String msg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<100;i++)
		{
			
			if(i==33)
			{
				continue;
			}
			System.out.println(i);
		}
		
		printValue();
		
	}
	
	public static void printValue() {
		int value=0;
	
		
		System.out.println(value);
		
		int a=5/0;
	}

}
