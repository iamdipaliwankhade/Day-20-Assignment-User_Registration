package com.userregistration;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)

public class UserRegistrationTest {
	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.firstNameValidate("Dipali");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.firstNameValidate("dipali");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.lastNameValidate("Wankhade");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.lastNameValidate("wankhade");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhone_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.phoneNumberValidate("91 9307370471");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhone_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.phoneNumberValidate("7896532698");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.passwordValidate("Dipali23#%");
		Assert.assertFalse(result);
	}
}
