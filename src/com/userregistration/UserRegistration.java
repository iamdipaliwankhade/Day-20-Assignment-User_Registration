package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class UserRegistration {
	public boolean validateEmail(String email) {
		return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
	}
}