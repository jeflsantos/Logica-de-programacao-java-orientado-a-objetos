package aluraplataforma.Ijavautil.Fclassesanonimas;

public class Conta {
    private Cliente titular;
    private double saldo;
    private int agencia;
    private int numero;

    public static int total = 0;

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; //isso significa que toda conta começa com 100 de saldo.
        total++;
        System.out.println("Estou criando uma conta");
    }

    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia){
            return false;
        }

        if(this.numero != outra.numero){
            return false;
        }

        return true;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return titular;
    }

    public void saca(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
        }
    }

    public void deposita(double valor){
        if(valor>0){
            saldo += valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
