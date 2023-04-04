package Coleções;

public class ContaCorrente {
    Cliente cliente;
    private float saldo;

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo (float saldo){
        this.saldo = saldo;
    }

    public void depositaValor(float valorDeposito){
        saldo += valorDeposito;
    }
}
