public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
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
        setTods();
        if (verificaAnoBissexto() == false && (getMes() == 2 && getDia() <= 29)) {
            erroDeEntrada();
            System.out.println(" não ano bissexto");
            return;
        }
        if ((mesesMenores(getMes()) && getDia() <= 30) || !mesesMenores(getMes())) {
            System.out.println("Ano Valido\t " + getDia() + "/" + getMes() + "/" + getAno());
        } else {
            System.out.println("Alguma coisa invalida\t ");
            erroDeEntrada();
        }
    }

    public void setTods() {
        if (!(condicaoDia(dia) && condicaoMes(mes))) {
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

    

