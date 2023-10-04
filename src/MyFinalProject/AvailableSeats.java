package MyFinalProject;

public class AvailableSeats {
	
    
    public class Destination {//Setters for the Destination and fee per Destination 
       private String name;
 	   private double fee;
 	   private int[] availableS = new int[7];
 	   int distinationT;
 	   
    	   public Destination(String name, double fee) {
    	      this.name = name;
    	      this.fee = fee;
    	      setavailableseat();
    	   }

    	   public String getName() {
    	      return name;
    	   }

    	   public double getFee() {
    	      return fee;
    	   }
    	  
    	   public void rAvaibleSeat(int distination, int reserve) {    		   
    		   availableS[distination] = availableS[distination] - reserve;  
    		   distinationT = distination;
    		   
    	   }
    	   public void setavailableseat() {
    		   for(int i = 1;i < availableS.length;++i) {
    			   availableS[i] = 20;
    		   }
    	   }
    	   public  int getAvailable(int index) {
			return availableS[index];
    		   
    	   }
    	  
    }
    
    
   public class CalculateTotalFee{// To Calculate the total Fee of The User
	   
	private int totalP;
	   private int totalPwithDiscount;
	   private double totalfee, distinationFee;
	  
	   public void settotalP(int TotalofP) {
		   this.totalP = TotalofP;
	   }
	   public void settotalPwithDiscount(int TotalofPwD) {
		   this.totalPwithDiscount = TotalofPwD;
	   }
	   public void setdistinationFee(double distinationF) {
		   this.distinationFee = distinationF;
	   }
	   
	   public double gettotalFee() {
		   double discount  = totalPwithDiscount * 0.20 * distinationFee;
		   return totalfee = (distinationFee * totalP) - discount;
	   }
	   
	   
   }

    }
    
    


	  

