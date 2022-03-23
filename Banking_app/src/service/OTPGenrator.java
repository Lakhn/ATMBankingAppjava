package service;

public class OTPGenrator {

	public int genrateOTP() {
		int otp=(int)(Math.random()*9000)+1000;
		return otp;
		
		
	}
	}
