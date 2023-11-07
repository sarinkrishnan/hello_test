package exeption;

public class dairyentry {
  int date;
  String entrytype;
  String mood;
  
   void text(String entrytext) {
	   entrytype=entrytext;
	   System.out.println(entrytype);
   }
   void dispaly(int date,String status) {
	   System.out.println("date: "+date+"status: "+mood+"/n");
	   
   }
   
}
