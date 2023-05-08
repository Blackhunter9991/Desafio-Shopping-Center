import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner dInt = new Scanner(System.in);
        int loop;
        int aux = 0;
        Data d1 = new Data(32, 2, 2021);
        System.out.println("Digite Tods as datas que tu quer:");
        loop = dInt.nextInt();
        while (aux < loop) {
            System.out.print("Digite dia:\t");
            d1.setDia(dInt.nextInt());
            System.out.print("Digite mes:\t");
            d1.setMes(dInt.nextInt());
            System.out.print("Digite ano:\t");
            d1.setAno(dInt.nextInt());
            d1.validarData();
            System.out.println(d1);
            System.out.println(d1.toString());
            aux++;
        }
    }
}
