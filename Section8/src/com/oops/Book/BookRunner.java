package com.oops.Book;

public class BookRunner {

	public static void main(String[] args) {
		
		Book Science = new Book(20);
		Book SocialStudies = new Book(25);
		Book Maths = new Book(30);
		Book Physics = new Book(35);
		Book Urdu = new Book(40);
		
		System.out.println(Science.getNumberofcopies());
		
		System.out.println(SocialStudies.getNumberofcopies());
		
		System.out.println(Maths.getNumberofcopies());
		
		System.out.println(Physics.getNumberofcopies());
		
		System.out.println(Urdu.getNumberofcopies());
		
		
		Science.start();
		SocialStudies.start();
		Maths.start();
		Physics.start();
		Urdu.start();
		
		Science.setNumberofcopies(250);
		SocialStudies.setNumberofcopies(300);
		Maths.setNumberofcopies(350);
		Physics.setNumberofcopies(400);
		Urdu.setNumberofcopies(450);
	
	
		Science.increasenumberofcopies(750);
		SocialStudies.increasenumberofcopies(700);
		Maths.increasenumberofcopies(650);
		Physics.increasenumberofcopies(600);
		Urdu.increasenumberofcopies(550);

		
		System.out.println(Science.getNumberofcopies());
		System.out.println(SocialStudies.getNumberofcopies());
		System.out.println(Maths.getNumberofcopies());
		System.out.println(Physics.getNumberofcopies());
		System.out.println(Urdu.getNumberofcopies());
	}

}
