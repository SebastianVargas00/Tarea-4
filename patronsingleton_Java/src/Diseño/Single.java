package Dise�o;

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Logger logger=Logger.getInstance();
       //logger.log(5,3);
        Logger logger_2=Logger.getInstance();
        logger_2.setValue("Hola mundo");
        System.out.println(logger.getValue());
       
       //Tambien en estos ejemplos esta una peque�a calculadora
       //y como las intancias de objetos son las mismas
       
       //logger afecta directamente al logger_2 por que es la misma
       //instancia del objeto
       
       //Este es el patron Singleton el cual es resumido como 
       //un patr�n de dise�o que permite restringir la creaci�n de objetos 
       //pertenecientes a una clase o el valor de un tipo a un �nico objeto.
	}

}
