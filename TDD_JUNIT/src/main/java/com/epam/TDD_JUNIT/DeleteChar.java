package com.epam.TDD_JUNIT;

public class DeleteChar {
	public String remove(String string) {
		int len = string.length();
		String s = "";
		if(len ==0) {
			s=string;
		}
		else if(len==1 && string.charAt(0)!='A') {
			s = s+""+string.charAt(0);
		}
		else if(len == 2) {
			if(string.charAt(0)!='A'  && string.charAt(1)!='A'){
				s=string;
			}
			else if(string.charAt(0)!='A'  && string.charAt(1)=='A') {
				s = s+""+string.charAt(0);
			}
			else if(string.charAt(0)=='A'  && string.charAt(1)!='A') {
				s = s+""+string.charAt(1);
			} 
		}
		else if(len > 2) {
			String temp = string.substring(2,len);
			if(string.charAt(0)=='A'&& string.charAt(1)=='A') {
				s=temp;
			}
			else if(string.charAt(0)=='A'  && string.charAt(1)!='A') {
				s += string.charAt(1)+""+temp;
			}
			else if(string.charAt(0)!='A'  && string.charAt(1)=='A') {
				s += string.charAt(0)+""+temp;
			}
			else
				s=string;
		}
		return s;
	}

}
