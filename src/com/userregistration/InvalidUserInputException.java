package com.userregistration;

import org.junit.Test;

import junit.framework.Assert;

public class InvalidUserInputException extends Exception {
	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.firstNameValidate("Dipali");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.firstNameValidate("dipali");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.lastNameValidate("Wankhade");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.lastNameValidate("wankhade");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenEmail_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenEmail_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenPhone_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.phoneNumberValidate("91 9307370471");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenPhone_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.phoneNumberValidate("7896523698");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenPassword_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.passwordValidate("Dipali23#%");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}
}
