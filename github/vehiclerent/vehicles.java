package vehiclerent;

public class vehicles {
  public String vname;
  public int vrent;
  
  public String vname(String name) {
	  vname=name;
	  return vname;
  }
  public int vrent(int rent) {
	  vrent=rent*5;
	  return vrent;
  }
  // void display() {
	//   System.out.println("NAME : "+vname+"    RENT  :  "+vrent);
   }
  
   class A extends vehicles{
	   
   }
   class B extends vehicles{
	   
   }

