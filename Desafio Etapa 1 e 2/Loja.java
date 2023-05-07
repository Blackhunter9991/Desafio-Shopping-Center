public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data data;

    //Métodos Construtores

    public Loja(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario,Data data,Endereco endereco){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.data = data;
        this.endereco = endereco;
    }
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.data = null;
        this.endereco = null;
    }

    //Getters Loja

    public String getNome(){
        return nome;
    }
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public Data geData(){
        return data;
    }

    //Setters Loja
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public void setSalarioBaseFuncionarios(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setData(Data data){
        this.data = data;
    }

   //Métodos

   public String toString(){
   
    return "======Informações da Loja======\n"+"Nome da Loja: "+getNome()+"\n"+"Numero de Funcionarios: "+getQuantidadeFuncionarios()+"\n"+"Salario Base dos Funcionarios: "+getSalarioBaseFuncionario();

    }

   public double gastosComSalario(){
    if (salarioBaseFuncionario > 0){
    return salarioBaseFuncionario + salarioBaseFuncionario;
   } else {
    return -1;
   }

   }
   
   public char tamanhoDaLoja(){
    if(quantidadeFuncionarios < 10){
        return 'P';
    } else if(quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
        return 'M';
    }else if(quantidadeFuncionarios >= 31){
        return 'G';
    }
    return 0;
    }


}