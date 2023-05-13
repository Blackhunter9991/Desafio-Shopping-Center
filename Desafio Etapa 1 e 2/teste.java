import java.util.Scanner;
public class teste {
    public static void main(String [] args){
        Scanner dig = new Scanner(System.in);
        Data d1 = new Data(0, 0, 0);
        boolean b = d1.isValid(0, 0, 0);
        
        
        System.out.print("digite dia: ");
        d1.setDia(dig.nextInt());

        System.out.print("digite mes: ");
        d1.setMes(dig.nextInt());

        System.out.print("digite ano: ");
        d1.setAno(dig.nextInt());

        System.out.println(d1);

       
      

    }
    
}
