
package laboratorio_1;
import java.util.Scanner;

/**
 * @authors 
 * Maria Ortiz, David Perez
 */

public class Laboratorio_1 {
    
    public static void msjEdad(boolean val){
       
       if(val)
            System.out.println("Es mayor de Edad");
        else
            System.out.println("No es mayor de Edad"); 
    }
    
    public static void msjPeso(int val){
    
        if(val == 0)
            System.out.println("Tiene peso ideal");
        else if(val == -1)
            System.out.println("Tiene bajo peso");
        else if(val == 1)
            System.out.println("Tiene SobrePeso");
        else
            System.out.println("Tiene obesidad");

    }
    
    public static void main(String[] args) {
        
        /*Objeto con valores por default*/
        Persona pDef = new Persona();
        
        /*Asignacion de nuevos valores , usando setters, al objeto con valores default*/
        pDef.setAltura(2.00f);
        pDef.setCedula(12345678);
        pDef.setDireccion("St. Street none of your business Apt #4");
        pDef.setEdad(27);
        pDef.setNombre("Abraham Duke");
        pDef.setPeso(90);
        pDef.setSexo('M');
        
        System.out.println("<--- Objeto Default --->");
        msjEdad(pDef.esMayorDeEdad());
        msjPeso(pDef.calcularIMC());
        pDef.imprimirDatosPer();
        
        
        /*Inputs del segundo Objeto*/
        Scanner read = new Scanner( System.in );
        
        System.out.println("Inserte nombre: ");
        String nombre = read.nextLine();
        
        System.out.println("Inserte edad: ");
        int edad = read.nextInt();
        
        char sexo;
        do{
            System.out.println("Inserte sexo: ");
            sexo = read.next().charAt(0);
        }while(!pDef.comprobarSexo(sexo));
        
        System.out.println("Inserte peso: ");
        float peso = read.nextFloat();
        
        System.out.println("Inserte altura: ");
        float altura = read.nextFloat();
        
        /*Objeto con valores del Input*/
        Persona pIn = new Persona(0, nombre, edad, sexo, peso, altura, "");
        
        System.out.println("<--- Objeto Input --->");
        msjEdad(pIn.esMayorDeEdad());
        msjPeso(pIn.calcularIMC());
        pIn.imprimirDatosPer();
    }
    
}
