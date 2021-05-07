package nLayeredHomeworkECommerceSystem.business.validationRules;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import nLayeredHomeworkECommerceSystem.business.abstracts.UserService;
import nLayeredHomeworkECommerceSystem.business.abstracts.Validator;
import nLayeredHomeworkECommerceSystem.entities.concretes.User;

public class UserValidator implements Validator<User>{
	String regex = "^(.+)@(.+)$";
	Pattern emailPattern = Pattern.compile(regex);

	@Override
	public boolean runValidators(User entity) {
		List<Boolean> results = new ArrayList<Boolean>();
		results.add(validateEmail(entity.getEmail()));
		results.add(validatePassword(entity.getPassword()));
		results.add(validateFirstName(entity.getFirstName()));
		results.add(validateLastName(entity.getLastName()));
		
		for(boolean result : results) {
			if (result == false) {
				return result;
			}
		}
		return true;
	}
	
	private boolean validateEmail(String email) {
		return emailPattern.matcher(email).matches();
	}
	
	private boolean validatePassword(String password) {
		return password.length() >=6;
	}
	
	private boolean validateFirstName(String firstName) {
		return firstName.length() >= 2;
	}
	
	private boolean validateLastName(String lastName) {
		return lastName.length() >= 2;
	}
}
