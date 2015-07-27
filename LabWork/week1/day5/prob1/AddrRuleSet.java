package week1.day5.prob1;

import java.awt.Component;

final public class AddrRuleSet implements RuleSet {
	// package level access
	AddrRuleSet() {
	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow addr = (AddrWindow) ob;
		if (addr.getIdValue().equals("") || addr.getStreetValue().equals("") || addr.getCityValue().equals("")
				|| addr.getStateValue().equals("") || addr.getZipValue().equals("")) {
			throw new RuleException("All fields must not be empty!");
		}
		if (!addr.getIdValue().matches("[0-9]*")) {
			throw new RuleException("ID field must be numeric!");
		}
		if (!addr.getStateValue().matches("[A-Z][A-Z]")) {
			throw new RuleException("State must have exactly two characters in the range A-Z!");
		}

		if (!addr.getZipValue().matches("[0-9]*") || addr.getZipValue().length() != 5) {
			throw new RuleException("Zip must be numeric with exactly 5 digits!");
		}

		if (addr.getIdValue().equals(addr.getZipValue())) {
			throw new RuleException("ID field may not equal zip field!");
		}

	}

}
