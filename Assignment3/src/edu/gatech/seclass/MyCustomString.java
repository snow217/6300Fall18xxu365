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
		if (this.mystring != null) {
			for (int i = 0; i < this.mystring.length() - 1; i++) {
				if (this.mystring.charAt(i) == this.mystring.charAt(i + 1)) {
					count++;
				}
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
				String temp_1="";
				if (Character.isDigit(temp)) {
					//temp = (char)((((int)(temp)) + n) % 10);
					temp_1 = Integer.toString(((Character.getNumericValue(temp)) + n)%10);
					//System.out.print(" Changed Num is:"+ Integer.toString(((Character.getNumericValue(temp)) + n)%10));
				}
				else{
					temp_1 = Character.toString(temp);
				}
				newString +=  temp_1;
			}
		}else {
			for (int i = 0; i < this.mystring.length(); i++) {
				char temp = this.mystring.charAt(i);
				String temp_1="";
				if (Character.isDigit(temp)) {
					//temp = (char)((((int)(temp)) + n) % 10);
					temp_1 = Integer.toString(((Character.getNumericValue(temp)) - n + 10)%10);
					//System.out.print(" Changed Num is:"+ Integer.toString(((Character.getNumericValue(temp)) - n)%10));
				}
				else{
					temp_1 = Character.toString(temp);
				}
				newString +=  temp_1;
			}
		}
		return newString;
	}

	@Override
	public void flipLetttersInSubstring(int startPosition, int endPosition) {
		if (this.mystring == null){
			throw new NullPointerException();
		}
		if (endPosition >  this.mystring.length() || startPosition <= 0){
			throw new MyIndexOutOfBoundsException();
		}
		if (startPosition > endPosition){
			throw new IllegalArgumentException();
		}

		char [] forString = new char[this.mystring.length()];
		for (int i = 0; i < this.mystring.length(); i++){
			char temp = this.mystring.charAt(i);
			if (i < startPosition || i > endPosition){
				forString[i] = temp;
			}
			int j = startPosition;
			int k = endPosition;

			while(j <= k) if (Character.isDigit(temp) || temp == ' ') {
				forString[j] = temp;
			} else {
				char savePoint = this.mystring.charAt(k);
				forString[k] = temp;
				forString[j] = savePoint;
				j++;
				k--;
			}
		}
		this.mystring = new String(forString);

	}

}
