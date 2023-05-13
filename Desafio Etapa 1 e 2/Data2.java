public class Data2{
    private int dia;
    private int mes;
    private int ano;

    public Data2(int dia, int mes, int ano){
        if(isValid(dia, mes, ano)){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        } else {
            System.out.println("Data Invalida alterando para: 1/1/2000");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
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
            this.ano = 2000;
            validar();
    }

    public boolean isBissexto() {
        boolean bissexto;
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
           return bissexto = true;
        } else {
           return bissexto = false;
        }
    }

    public void validar() {
        if (!isValid(getDia(), getMes(), getAno())){
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public boolean isValid(int dia, int mes, int ano){
        if(dia < 1 || mes < 1 || mes > 12 || dia > 31){
            return false;
        }
        if(mes == 2){
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            return dia <= 29;
            } else {
            return dia <= 28;
            }

        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
        return dia <= 30 && dia > 0;
        } else{
        return dia <= 31 && dia > 0;
        }    

    }

    public String toString(){
        return "Data:"+getDia()+"/"+getMes()+"/"+getAno();
    }

    

}