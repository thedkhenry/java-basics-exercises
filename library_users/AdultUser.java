package com.perscholas.java_basics.exercises.library_users;

/**
 * The AdultUser class represents a user who is over age.
 * An adult user is considered over age when the age is greater than 12.
 * Adult users are only allowed fiction books.
 */
public class AdultUser implements LibraryUser{
	private int age;
	private String bookType;
	
	public AdultUser() {
	}
	
	public AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	
	/**
	 * Prints out successful account registration message if age is greater than 12
	 * otherwise prints out unsuccessful account registration message
	 */
	@Override
	public void registerAccount() {
		if(age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		}else{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	
	/**
	 * Prints out successful book request message if bookType is equal to "Fiction"
	 * otherwise prints out unsuccessful book request message
	 */
	@Override
	public void requestBook() {
		if(bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}else{
			System.out.println("Oops, you are allowed to take only adult fiction books");
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