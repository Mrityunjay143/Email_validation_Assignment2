package com.emailvalidation;
import java.util.Scanner;
public class EmailIdValidation {
	String email[] = {"djosselsohn0@wisc.edu","ypyett2@goo.gl","edullard3@uol.com.br","lborgnet0@oaic.gov.au",
		    "eriggey1@ask.com", "cnowick2@exblog.jp", "apeye3@mapquest.com", "tpetley4@mayoclinic.com", 
		    "mdominiak5@nyu.edu","kbrosio6@guardian.co.uk"};
	static  boolean flag=false;
	public static void main(String[] args){
		if(flag){
			System.out.println("Please enter valid Email ID:");
			System.out.println("Enter Email ID again:");
			}
		else{
			System.out.println("Please enter Email ID :");
			}
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		EmailIdValidation emailid = new EmailIdValidation();
		boolean result = emailid.checkEmailID(a);
		if (result)
			System.out.println("signed In");
		else {
			flag=true;
			main(new String[] { "" });
			}
		}
	public boolean checkEmailID(String MailID){
		for(int i=0; i<email.length; i++){
			String k=email[i];
			if(MailID.equals(k)){
				return true;
				}
			}
		return false;
		}
}

