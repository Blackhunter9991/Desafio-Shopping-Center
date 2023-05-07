import java.util.Scanner;
public class Principal {
    public static void main(String [] args){

        
        System.out.println("(1) Criar Loja\n(2) Criar um Produto\n(3) Sair");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a Opção Desejada");
        int opcao = teclado.nextInt();
        
        int passo = 1;    
        while(passo < 2){
            if(opcao != 1 && opcao != 2 && opcao != 3){
        
        System.out.println("(1) Criar Loja\n(2) Criar um Produto\n(3) Sair");
        System.out.println("Digite a Opção Desejada");
        opcao = teclado.nextInt();
     
  }

        if (opcao == 1){
           Endereco endereco = new Endereco(null, null, null, null, null, null, null);
           Scanner enderecoTecladoString = new Scanner(System.in);

           System.out.println("======Cadastro de Endereço da Loja======\nDigite o nome da Rua: ");
           endereco.setNomeDaRua(enderecoTecladoString.nextLine());

           System.out.println("Cidade: ");
           endereco.setCidade(enderecoTecladoString.nextLine());

           System.out.println("Estado: ");
           endereco.setEstado(enderecoTecladoString.nextLine());

           System.out.println("País: ");
           endereco.setPais(enderecoTecladoString.nextLine());

           System.out.println("Cep: ");
           endereco.setCep(enderecoTecladoString.nextLine());

           System.out.println("Numero: ");
           endereco.setNumero(enderecoTecladoString.nextLine());
           
           System.out.println("Complemento: ");
           endereco.setComplemento(enderecoTecladoString.nextLine());


           Data dataLoja = new Data(0, 0, 0);
           Scanner dataTeclado = new Scanner(System.in);
           Scanner dataTecladoMes = new Scanner(System.in);
           
           System.out.print("======Informe a Data====== \nDia:");
           dataLoja.setDia(dataTeclado.nextInt());
          
           System.out.print("Mes:");
           dataLoja.setMes(dataTecladoMes.nextInt());
           
           System.out.print("Ano:");
           dataLoja.setAno(dataTecladoMes.nextInt());

           Loja L1 = new Loja(null, 0, 0, dataLoja, endereco);
           Scanner lojaString = new Scanner(System.in);
           Scanner lojaDouble = new Scanner(System.in);
           Scanner lojaInt = new Scanner(System.in);

           System.out.println("======Cadastro Informações da Loja======\nNome da Loja: ");
           L1.setNome(lojaString.nextLine());

           System.out.println("Informe a Quantidade de Funcionarios: ");
           L1.setQuantidadeFuncionarios(lojaInt.nextInt());

           System.out.println("Salario Base: ");
           L1.setSalarioBaseFuncionarios(lojaDouble.nextDouble());
           break;

           
        }else if(opcao == 2){
            Produto produto = new Produto(null, 0, new Data(0, 0, 0));
            Scanner tecladoProduto = new Scanner(System.in);

            System.out.println("======Descrição do Produto======\nNome do Produto:");
            produto.setNome(tecladoProduto.nextLine());

            System.out.println("Preço: ");
            produto.setPreco(tecladoProduto.nextDouble());

            System.out.println("======Data do Produto======");
            Data dataProduto = new Data(opcao, opcao, opcao);
           
            System.out.print("Dia:");
            dataProduto.setDia(tecladoProduto.nextInt());

            System.out.print("Mes:");
            dataProduto.setMes(tecladoProduto.nextInt());

            System.out.print("Ano:");
            dataProduto.setAno(tecladoProduto.nextInt());

            produto.setDataProduto(dataProduto);

            Data dataAtual = new Data(20, 10, 2023);

            System.out.println(produto.estaVencido(dataAtual));
            System.out.print(produto.toString());
            System.out.println(produto.getDataProduto());
            break;
        
        }else if(opcao == 3){
            System.out.println("Saindo...");
            break;
      }
    }

 }
    
}
