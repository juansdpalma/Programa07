
package programa07;
import java.util.Scanner;

public class Programa07 {


   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos dias trabajaste?  ");
        int dias;
        dias = entrada.nextInt();
        int contador;
        contador=0;
        int ss = 0;
        int ms = 0;
        int hs = 0;
        while (contador<dias){
            System.out.println("Horas/minutos/segundos");
            System.out.println("Por dia");
            System.out.println("¿Cuantas horas trabajaste?  ");
            int h;
            h = entrada.nextInt();
            System.out.println("¿Cuantos minutos?  ");
            int m;
            m =  entrada.nextInt();
            System.out.println("¿Cuantos segundos?  ");
            int s;
            s = entrada.nextInt();
            ss= ss+s;
            if (ss>=60){
                ss= ss-60;
                ms=ms+1;
                
            }
            ms=ms+m;
            if (ms>=60){
                ms= ms-60;
                hs= hs+1;
            }
            hs= hs+h;
            contador= contador+1;
        }
        System.out.println(hs+" "+"horas"+" "+ms+" "+"minutos"+" "+ss+" "+"segundos");
     
        
       
    }}

       