
 //de acuerdo al número ingresado por el usuario, se determina si dicho número es o no, afortunado


import java.util.Scanner; //se agregó la importación del Scanner
public class Codigo5 {

	public static void main(String[] args) { //se agregó 
	    Scanner s = new Scanner(System.in);//agregado System.in
	    System.out.print("Introduzca un número: "); //error de comillas
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni); //parseInt
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) {// ni no es válido. Sustiuido por c
		  int digito = (int)(c % 10);//ni no es válido. Sustiuido por c
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  c /= 10; //ni no es válido. Sustiuido por c
	    }

	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado."); //faltaba una t en "println"
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	  
	}
} //faltaba un corchete