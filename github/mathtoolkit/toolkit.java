package mathtoolkit;

public class toolkit {
   public void calculate(int a, int b, int c) {
	   int result=a+b+c;
	   System.out.println("result :  "+result);
	   System.out.println("maximum value:  "+Math.max(a, b)+"   minimum value : "+Math.min(a, b));
	   
   }
   public void calculate(int s, float d) {
	   float result=s-d;
	  System.out.println("result :  "+result);
	  System.out.println("maximum value:  "+Math.max(s, d)+"   minimum value : "+Math.min(s, d));
	   
   }
   public void calculate(int s, double d) {
	   double result=s/d;
	  System.out.println("result :  "+result);
	  System.out.println("maximum value:  "+Math.max(s, d)+"   minimum value : "+Math.min(s, d));
	   
   }
   public void calculate(int s, int d) {
	   float result=s*d;
	  System.out.println("result :  "+result);
	  System.out.println("maximum value:  "+Math.max(s, d)+"   minimum value : "+Math.min(s, d));
	   
   }
}
