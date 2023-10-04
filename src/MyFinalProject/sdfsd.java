package MyFinalProject;

import MyFinalProject.AvailableSeats.Destination;

public class sdfsd {

	public static void main(String[] args) {
AvailableSeats seat = new AvailableSeats();
AvailableSeats.Destination[] destinations = new AvailableSeats.Destination[7];
		
		
		destinations[0] = seat.new Destination("", 0);
		destinations[1] = seat.new Destination("GENSAN", 400);
		destinations[2] = seat.new Destination("MATALAM", 300);
		destinations[3] = seat.new Destination("COTABATO", 350);
		destinations[4] = seat.new Destination("SURIGAO", 450);
		destinations[5] = seat.new Destination("MANGAGOY", 500);
		destinations[6] = seat.new Destination("TANDAG", 250);
		for(int i = 0;i < destinations.length;++i) {
			destinations[i].setavailableseat();
		}
		
		
		
		int ava = destinations[6].getAvailable(6);
		System.out.println(ava);
		
		
	}

}
