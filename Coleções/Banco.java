package Coleções;

import java.util.ArrayList;
import java.util.List;

public class Banco {


    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();
        c1.cliente = new Cliente();
        c1.cliente.nome = "Vitor";
        c1.cliente.numero = 1;
        ContaCorrente c2 = new ContaCorrente();
        c2.cliente = new Cliente();
        c2.cliente.nome = "Lívia";
        c2.cliente.numero = 2;

        c1.depositaValor(100);
        c2.depositaValor(200);

        List contas = new ArrayList();
        contas.add(c1);
        contas.add(c2);

        for (int i = 0; i < contas.size(); i++){
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println("A conta " + cc.cliente.numero + " de " + cc.cliente.nome + " possui saldo de R$"+ cc.getSaldo());
        }
    }
}
