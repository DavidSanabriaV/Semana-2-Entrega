/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg2.entrega;
import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class Semana2Entrega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String dia = JOptionPane.showInputDialog(null, "Digite el día deseado ");;
        switch (dia) {
            case "1":
                JOptionPane.showMessageDialog(null, "Es lunes");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Es martes");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Es miercoles");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Es jueves");
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "Es viernes");
                break;
            case "6":
                JOptionPane.showMessageDialog(null, "Es sabado");
                break;
            case "7":
                JOptionPane.showMessageDialog(null, "Es domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El dato es erroneo");
        }

        /*
        int edad;
        // Este es un programa que analiza su edad
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite su edad:"));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "SIIIII PUEDO VOTAR ");
            JOptionPane.showMessageDialog(null, "SIIIII PUEDO TOMAR ");
            JOptionPane.showMessageDialog(null, "SIIIII PUEDO Manejar ");
            if (edad > 30) {
                JOptionPane.showMessageDialog(null, "SIIIII PUEDe ser presidente ");
            }else 
                 JOptionPane.showMessageDialog(null, "NOOOOOO PUEDe ser presidente ");
        } else {
            JOptionPane.showMessageDialog(null, "Es menor de edad ");
        }
        JOptionPane.showMessageDialog(null, "Programa termino ");
         */
 /*if (1>2){
            JOptionPane.showMessageDialog(null, "SIIIII ES MMMAYYYOOOORRR " );
        }
        JOptionPane.showMessageDialog(null, "Esto siempre se va a ejecutar " );
         */
 /*
        String variable="Hola";
                
        if (variable.compareTo("Hola")==0){
            JOptionPane.showMessageDialog(null, "SOOONNNN IGUALES " );
        }*/
 /*
        int a = 1;
        int b = 2;*/
 /*
        if (a <= b)
            JOptionPane.showMessageDialog(null, "Si se cumple " );
        JOptionPane.showMessageDialog(null, "Esto siempre se va a ejecutar " );
         */
 /*
        if (a == 1 && b == 3){
            JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
            JOptionPane.showMessageDialog(null, " 1Las dos condiciones se cumplen " );
            JOptionPane.showMessageDialog(null, " 2Las dos condiciones se cumplen " );
            JOptionPane.showMessageDialog(null, " 3Las dos condiciones se cumplen " );
            JOptionPane.showMessageDialog(null, " 4Las dos condiciones se cumplen " );
            
        }*/
 /*
        if (a == 1 && b == 2){
            JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }*/
 /*
        if (a == 1 || b == 3){
            JOptionPane.showMessageDialog(null, " Puede que una condicion se cumplen " );
        }*/
 /*
        boolean variableBooleana=true;
        if (true){
             JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }
        
        if ( !false ){
             JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }
        
        if (variableBooleana){
             JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }
        
          if (!variableBooleana){
             JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }*/
        // Este es mi primer programita en java
        //Declaración de variables
        /*
        String respuestaHola ;
        String variable = "Digite su edad";
         
        
        System.out.println(variable + " asdsad"  );
        System.out.println("");
        System.out.println("");
        respuestaHola = JOptionPane.showInputDialog(variable );
        System.out.println("Mi edad es"+respuestaHola);
        
        
        JOptionPane.showMessageDialog(null, respuestaHola);
         */
 /*
       String nombre;
        byte edad;
        double salario;
        char genero;
        int hola="sad";
        nombre = JOptionPane.showInputDialog(null, "Digite el nombre:");
        edad = Byte.parseByte(JOptionPane.showInputDialog(null,
                "Digite la edad:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite el salario:"));
        genero = JOptionPane.showInputDialog(null,
                "Digite la inicial del género:").charAt(0);
        JOptionPane.showMessageDialog(null, nombre + " tiene \n" + edad
                + " años. \n Recibe un salario de $" + salario + " y su género es "
                + genero + ".");
        System.out.println("");*/
 /*
        String nombreParaSalario;
        nombreParaSalario = JOptionPane.showInputDialog(null, "Digite el nombre:");
        Double salarioMensual = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite su salario semanal:"));
        Double salarioBruto =salarioMensual*4;
        Double salarioNeto = salarioBruto*0.0934;
        JOptionPane.showMessageDialog(null, "El empleado " 
                + nombreParaSalario + " tienen un salario neto de " 
                + salarioNeto);
         */
        
        
        
        
        
    }
    
}
