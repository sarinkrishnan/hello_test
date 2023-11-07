package marklist;

public class students {
  String name;
  int mark;
  int rollnum;
   
   void students(String name , int mark,int rollnum) {
	   this.name=name;
	   this.mark=mark;
	   this.rollnum=rollnum;
   }
   void res() {
	   if (mark >=90 && mark<=100) {
		   System.out.println("name :"+name+"  "+"rollnum :"+rollnum+"  "+"grade= A");
	   }else if(mark>=80 && mark<=90){
		   System.out.println("name :"+name+"  "+"rollnum :"+rollnum+"  "+"grade= B");

	   }else if(mark>=70 && mark<=80){
		   System.out.println("name :"+name+"  "+"rollnum :"+rollnum+"  "+"grade= C");

	   }else if(mark>=60 && mark<=70){
		   System.out.println("name :"+name+"  "+"rollnum :"+rollnum+"  "+"grade= D");

	   }else if(mark>=50 && mark<=60){
		   System.out.println("name :"+name+"  "+"rollnum :"+rollnum+"  "+"grade= E");

	   }else if(mark<=50){
		   System.out.println("name :"+name+"  "+"rollnum :"+rollnum+"  "+"grade= faild");

	   }
   }
}
