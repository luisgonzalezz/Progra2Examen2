import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de mi_lista (dada) son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{

		int contador=0;
		
		for(int x=0;x<mi_lista.size();x++)
		{
		if(mi_lista.get(x)%2==0) 
			contador=contador+1;
		if(contador==mi_lista.size())
			return true;		
		}
		return false;
	}
	
	//Escribe n1, n2 y n3 (dados) en un archivo con nombre nombre_archivo (dado) separados por espacios
	static void escribir3Numeros(String nombre_archivo,int n1, int n2,int n3)
	{
		try{
			PrintWriter numero = new PrintWriter(nombre_archivo);
			
			numero.println(n1+" "+n2+" "+n3);
			numero.close();
			}		
		catch (Exception e)
		  {e.printStackTrace();}
	}
	
	//Devuelve true si el archivo con nombre nombre_archivo (dado) contiene al menos 2 palabras repetidas
	static boolean existenRepetidas(String nombre_archivo)
	{
		String a=" ";
	    String b=" ";
		try{
		    Scanner leer = new Scanner(new File(nombre_archivo));
		    while(leer.hasNext())
		    {  a = leer.next();
	     
		    while(leer.hasNext())
	     	{  b = leer.next();	
		if(a.equals(b)) 
			return true; 
		    }
	        }
		leer.close();
		   }
		     catch (FileNotFoundException e)
		           { e.printStackTrace();}
		return false;
	
	}
}
