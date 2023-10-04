package MyFinalProject;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;





public class DataFileWriter {

	private static String Status;
	private static double totlFee = 0.0;
	private static String MY_FILE = "temp.txt";

	public void writemyFile(String name, String Distination, String Totalpassengers, String TotalPwd, String status, String totalfare) throws IOException {
		try {
		    int totalPassengersInt = Integer.parseInt(Totalpassengers);
		    int totalPwdInt = Integer.parseInt(TotalPwd);
		    BufferedWriter writer = new BufferedWriter(new FileWriter(MY_FILE, true));

		    writer.write("Name: " + name + "\n");
		    writer.write("Destination: " + Distination + "\n");
		    writer.write("Total Passengers: " + (String.valueOf(totalPassengersInt)) + "\n");
		    writer.write("Passengers with Discount: " + (String.valueOf(totalPwdInt)) + "\n");
		    writer.write("Status: " + status + "\n");
		    writer.write("Total Fee: " + totalfare + "\n");
		    writer.close();
		 
		  
		} catch (IOException e) {
		    System.out.println("An error occurred while writing to file.");
		    e.printStackTrace();
		} catch (NumberFormatException e) {
		    System.out.println("Invalid number format.");
		    e.printStackTrace();
		}
		
		

	}
	
	public static String searchByName(String name) {
		String status = "";
	    String result = "";
	    double totalf = 0;
	    int lineNumber = 0;
	    
	    try (BufferedReader br = new BufferedReader(new FileReader(MY_FILE))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	        	lineNumber++;
	            if (line.startsWith("Name: " + name)) {
	                result += line + "\n"; // Add the line containing the name to the result string
	                for (int i = 0; i < 4; i++) {
	                    line = br.readLine();
	                   
	                    if (line != null && line.startsWith("Status: ")) {
	                        status = line.substring(8); // Extract the status value
	                    
	                    }
	                    if (line == null) {
	                        // End of file reached before all necessary lines were read
	                        break;
	                    }
	                    result += line + "\n";
	                }

	                // Check if the next line is the "Total Fee" line
	                line = br.readLine();
	                lineNumber++;
	                if (line != null && line.startsWith("Total Fee: ")) {
	                    result += line + "\n";
	                    DecimalFormat df = new DecimalFormat("#,###.00");
	                    try {
	                        totalf = df.parse(line.substring(11)).doubleValue();
	                    } catch (ParseException e) {
	                        System.out.println("Error parsing total fare.");
	                        e.printStackTrace();
	                    }
	                }
	                br.close();

	                // Set the totlFee variable to the value of totalf
	                totlFee = totalf;
	                Status = status;
	              
	                break; // Exit the loop after the information is added to the result
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return result;
	}
	
	
	
	
	
	public double gettotal() {
		 return totlFee;
	}
	
	
	public String GetStatus() {
		return Status;
		
	}
		
	public void updateStatus(String name) {
	    String newStatus = "PAID";
	    try {
	        BufferedReader reader = new BufferedReader(new FileReader(MY_FILE));
	        StringBuilder sb = new StringBuilder();

	        String line;
	        boolean found = false;
	        while ((line = reader.readLine()) != null) {
	            if (line.startsWith("Name: " + name)) {
	                found = true;
	                sb.append("Name: " + name + "\n");
	                sb.append(reader.readLine() + "\n"); // Destination
	                sb.append(reader.readLine() + "\n"); // Total Passengers
	                sb.append(reader.readLine() + "\n"); // Passengers with Discount
	                sb.append("Status: " + newStatus + "\n"); // New status
	                reader.readLine(); // Skip the line with the old status
	                reader.readLine(); // Skip the line with the total fee
	            } else {
	                sb.append(line + "\n");
	            }
	        }
	        reader.close();

	        if (!found) {
	            System.out.println("Name not found in file.");
	            return;
	        }

	        BufferedWriter writer = new BufferedWriter(new FileWriter(MY_FILE));
	        writer.write(sb.toString());
	        writer.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public void editTransaction(String name, String newDestination, String newTotalPassengers, String newPassengersWithDiscount, String newTotalFee) {
	String status = "NOT_PAID";
	try {
        BufferedReader reader = new BufferedReader(new FileReader(MY_FILE));
        StringBuilder sb = new StringBuilder();

        String line;
   
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Name: " + name)) {
                
                sb.append("Name: " + name + "\n");
                reader.readLine();
                reader.readLine();
                reader.readLine();
                reader.readLine();
                reader.readLine();
                sb.append("Destination: " + newDestination + "\n");
                sb.append("Total Passengers: " + newTotalPassengers + "\n");
                sb.append("Passengers with Discount: " + newPassengersWithDiscount + "\n");
                sb.append("Status: " + status + "\n"); // New status
                sb.append("Total Fee: " + newTotalFee + "\n"); // New total fee
            } else {
                sb.append(line + "\n");
            }
        }
        reader.close();

      

        BufferedWriter writer = new BufferedWriter(new FileWriter(MY_FILE));
        writer.write(sb.toString());
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
	
	
	}

	
	
	


	public void clearDataForName(String name) {
	    try {
	        BufferedReader reader = new BufferedReader(new FileReader(MY_FILE));
	        StringBuilder sb = new StringBuilder();

	        String line;
	        boolean found = false;
	        while ((line = reader.readLine()) != null) {
	            if (line.startsWith("Name: " + name)) {
	                found = true;
	                // Skip the lines for this transaction
	                for (int i = 0; i < 5; i++) {
	                    reader.readLine();
	                }
	            } else {
	                sb.append(line + "\n");
	            }
	        }
	        reader.close();

	        if (!found) {
	            System.out.println("Name not found in file.");
	            return;
	        }

	        BufferedWriter writer = new BufferedWriter(new FileWriter(MY_FILE));
	        writer.write(sb.toString());
	        writer.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


	public void clearFile() {
	    try {
	        BufferedWriter writer = new BufferedWriter(new FileWriter(MY_FILE));
	        writer.write("");
	        writer.close();
	    } catch (IOException e) {
	        System.out.println("An error occurred while clearing the file.");
	        e.printStackTrace();
	    }

}
}


