public class Produto {
    private String nome;
    private double preco;
    private Data dataProduto;

    public Produto(String nome, double preco,Data dataProduto){
        this.preco = preco;
        this.nome = nome;
        this.dataProduto = dataProduto;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public Data getDataProduto(){
        return dataProduto;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDataProduto(Data dataProduto){
        this.dataProduto = dataProduto;
    }

    public String toString(){
        System.out.println("=====Detalhes do Produto=====\n"+"Nome: "+getNome());
        System.out.printf("Preço: %.2f",getPreco());
        return "R$\n=============================\n";

    }

    public Boolean estaVencido(Data dataAtual){
        if (dataAtual.getAno() > dataProduto.getAno()){
            return true;
        }else if (dataAtual.getAno() == dataProduto.getAno() && dataAtual.getMes() > dataProduto.getMes()){
            return true;
        }else if (dataAtual.getAno() == dataProduto.getAno() && dataAtual.getMes() == dataProduto.getMes() && dataAtual.getDia() > dataProduto.getDia()){
            return true;
        }else {
            return false;
        }
   }
}
