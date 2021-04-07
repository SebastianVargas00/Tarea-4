package Diseño;

import javax.swing.Spring;

public class Logger {

private static Logger log;
private String mensaje;
private Logger() {
		
}
public static Logger getInstance() {
	
	if(log==null) {
		log=new Logger();
	}
	return log;
	
}
public void log(int num1,int num2) {
	int suma=num1+num2;
	System.out.println(suma);
	int resta = num1-num2;
	System.out.println(resta);
	int division= num1/num2;
	System.out.println(division);	
}

public void setValue(String msg) {
	mensaje = msg;
}
public String getValue() {
	return mensaje;
}
}
