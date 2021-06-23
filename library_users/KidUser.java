package com.perscholas.java_basics.exercises.library_users;

/**
 * The KidUser class represents a user who is under age.
 * A kid user is considered under age when the age is less than 12.
 * Kid users are only allowed kids books.
 */
public class KidUser implements LibraryUser{
	private int age;
	private String bookType;
	
	public KidUser() {
	}
	
	public KidUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	/**
	 * Prints out successful account registration message if age is less than or equal to 12
	 * otherwise prints out unsuccessful account registration message
	 */
	@Override
	public void registerAccount() {
		if(age <= 12) {
			System.out.println("You have successfully registered under a Kids Account");
		}else{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	
	/**
	 * Prints out successful book request message if bookType is equal to "Kids"
	 * otherwise prints out unsuccessful book request message
	 */
	@Override
	public void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}else{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
	/**
	 * Returns the age
	 * @return current age in years
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Sets the age field
	 * @param age the user's age (in years)
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Returns the book type
	 * @return current book type
	 */
	public String getBookType() {
		return bookType;
	}
	
	/**
	 * Sets the book type field
	 * @param bookType the user's book type
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}