public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        validarData();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void validarData() {
        int dia = getDia();
        int mes = getMes();
        int ano = getAno();
        setTods();
        if ((verificaAnoBissexto()) && mes == 2 && dia <= 29) {
            System.out.println("E ano bissexto\t " + getDia() + "/" + getMes() + "/" + getAno());
            return;
        } else {
            erroDeEntrada();
            System.out.println("nao e ano bissexto\t ");
            return;
        }
        if ((mesesMenores(mes) && dia <= 30)) {
            setDia(dia);
            setMes(mes);
            setAno(ano);
            System.out.println("E ano valido\t " + getDia() + "/" + getMes() + "/" + getAno());

        } else if(!mesesMenores(mes)) {
            setDia(dia);
            setMes(mes);
            setAno(ano);

        } else {
            erroDeEntrada();
            System.out.println("Alguma coisa invalida\t ");
        }
    }

    public void setTods() {
        if(condicaoDia(dia) && condicaoMes(mes)) {}
        else {
            erroDeEntrada();
        }
    }

    public boolean condicaoDia(int dia) {
        return (dia > 0 && dia < 31);
    }

    public boolean condicaoMes(int mes) {
        return (mes > 0 || mes < 13);
    }

    public void erroDeEntrada() {
        setDia(1);
        setMes(1);
        setAno(2000);
    }

    public boolean mesesMenores(int mes) {
        return (mes == 4 || mes == 6 || mes == 9 || mes == 11);
    }

    public void setDia(int dia) {
       this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAno();
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}

    

