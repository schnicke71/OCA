package com.oca.session2;

public class OCA_08_MethodCall {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		
		Double x1 = 1d;
		Number x2 = x1;
		Object x3 = x1;
		
		logger.log(x1);
		logger.log(x2);
		logger.log(x3);
		
		System.out.println("--------------------------");
		
		x1 = null;
		x2 = null;
		x3 = null;
		
		logger.log(x1);
		logger.log(x2);
		logger.log(x3);
		
		System.out.println("--------------------------");
		
		logger.log(null);
	}
}

class Logger {
	
	public void log(Object value) {System.out.println("log(Object)");}
	public void log(Number value) {System.out.println("log(Number)");}
	public void log(Double value) {System.out.println("log(Double)");}
	public void log(String value) {System.out.println("log(String)");}
	
	private static Logger instance;
	static {instance = new Logger();}
	public static Logger getInstance() {return instance;}
	private Logger() {}
}
