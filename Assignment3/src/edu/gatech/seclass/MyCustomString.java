package edu.gatech.seclass;

public class MyCustomString implements MyCustomStringInterface {

	private String mystring;
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		if (mystring != null) {
			return mystring;
		}
		return null;
	}

	@Override
	public void setString(String string) {
		// TODO Auto-generated method stub
		this.mystring = string;
	}

	@Override
	public int countDuplicates() {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < this.mystring.length() - 1; i++) {
			if (this.mystring.charAt(i) == this.mystring.charAt(i+1)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public String addDigits(int n, boolean positive) {
		// TODO Auto-generated method stub
		if (this.mystring == null) {
			throw new NullPointerException();
		}
		if (n > 9 || n <=0) {
			throw new IllegalArgumentException();
		}
		String newString = "";
		if (positive) {
			for (int i = 0; i < this.mystring.length(); i++) {
				char temp = this.mystring.charAt(i);
				if (Character.isDigit(temp)) {
					temp = (char)((((int)(temp)) + n) % 10);
				}
				newString += temp;
			}
		}else {
			for (int i = 0; i < this.mystring.length(); i++) {
				char temp = this.mystring.charAt(i);
				if (Character.isDigit(temp)) {
					temp = (char)((((int)(temp)) - n) % 10);
				}
				newString += temp;
			}
		}
		return newString;
	}

	@Override
	public void flipLetttersInSubstring(int startPosition, int endPosition) {
		// TODO Auto-generated method stub

	}

}
