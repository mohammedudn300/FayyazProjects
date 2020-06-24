package com.oops.Book;

public class Book {

	private int numberofcopies;
	
	Book(int numberofcopies){
		this.numberofcopies = numberofcopies;
		
	}
   
    int getNumberofcopies() {
		return numberofcopies;
	}
	
   void setNumberofcopies(int numberofcopies) {
		this.numberofcopies = numberofcopies;
	}
    
	public void increasenumberofcopies(int howmuch) {
	   this.numberofcopies = this.numberofcopies + howmuch;
	   
	}
	
	
	
	void start() {
		System.out.println("Started Discovering");
		System.out.println("Completed Sucessfully");
	   
   }

}
