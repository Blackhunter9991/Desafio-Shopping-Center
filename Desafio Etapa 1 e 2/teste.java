import java.util.Scanner;
public class teste {
    public static void main(String []args){
        Scanner dInt = new Scanner(System.in);
        Data d1 = new Data(12, 2, 2012);
        d1.setDia(dInt.nextInt());
        d1.setMes(dInt.nextInt());
        d1.setAno(dInt.nextInt());
        System.out.println(d1);
        System.out.println(d1.toString());

        




    }
    
}
