package week1.day5.prob1;

import java.awt.Component;

final public class ProfileRuleSet implements RuleSet {
	// package level access
	ProfileRuleSet() {
	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow custProf = (ProfileWindow) ob;
		if (custProf.getIdValue().equals("") || custProf.getFirstNameValue().equals("")
				|| custProf.getLastNameValue().equals("") || custProf.getFavoriteMovieValue().equals("")
				|| custProf.getFavoriteRestaurantValue().equals("")) {
			throw new RuleException("All fields must not be empty!");
		}
		if (!custProf.getIdValue().matches("[0-9]*")) {
			throw new RuleException("ID must be numeric!");
		}
		if (!custProf.getFirstNameValue().matches("[A-z]*") || !custProf.getLastNameValue().matches("[A-z]*")) {
			throw new RuleException(
					"First Name and Last Name fields may not contain spaces or characters other than a-z, A-Z!");
		}
		if (custProf.getFavoriteMovieValue().equals(custProf.getFavoriteRestaurantValue())) {
			throw new RuleException("Favorite restaurant cannot equal favorite movie!");
		}

	}

}
