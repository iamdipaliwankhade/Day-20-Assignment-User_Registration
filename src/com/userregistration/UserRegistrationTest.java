package com.userregistration;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Dipali");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.firstName("dipali");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Wankhade");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("wankhade");
		Assert.assertEquals(false, result);
	}

}