public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
      
    boolean bissexto = (ano % 400 == 0)||(ano % 4 == 0 && ano % 100 != 0);

    if(bissexto == true && mes == 2 && dia > 29 || dia <= 0 && mes > 12){ 
   
  
      
      }

  


   }

    public int getDia(){
        return dia;
   }
     public int getMes(){
        return mes;
   }
     public int getAno(){
        return ano;
   }

     public void setDia(int dia){
        this.dia = dia;
   }
     public void setMes(int mes){
        this.mes = mes;
   }
     public void setAno(int ano){
        this.ano = ano;
   }

     public String toString(){
        return getDia()+"/"+getMes()+"/"+getAno();
   }

     public boolean verificaAnoBissexto(){
        if((getAno() % 400 == 0)||(getAno() % 4 == 0 && getAno() % 100 != 0))
      {
         return true;

      }else
      {
         return false;
      }
    
   }
   
}

    

