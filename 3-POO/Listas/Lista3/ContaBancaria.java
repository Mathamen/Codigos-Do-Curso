package Listas.Lista3;

public class ContaBancaria {
    private double saldo= 0.0;
    private Data dataAbertura = new Data();
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double a){
        this.saldo= a;
    }

    public Data getDataAbertura(){
        return dataAbertura;
    }

    public void setDataAbertura(int dia, int mes, int ano){
       this.dataAbertura.setAno(ano);
       this.dataAbertura.setMes(mes);
       this.dataAbertura.setDia(dia);
    }
    public String getDataAberturaFormatada(){
        String b= new String();
        b= Integer.toString(this.dataAbertura.getDia())+ "/" + Integer.toString(this.dataAbertura.getMes()) + "/" + Integer.toString(this.dataAbertura.getAno());
        return b;
    }

    public void depositar(double deposito){
        this.saldo= saldo + deposito;

    }
    public void sacar(double saque){
        if (saque> this.saldo){
            System.out.println("O valor desejado é maior que o seu saldo");
        }
        else{
            this.saldo= this.saldo - saque;
        }
    }
}
