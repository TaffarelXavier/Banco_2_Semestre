//Classe principal para execução do programa

import java.util.Arrays;
import java.util.Scanner;

public class Banco {

    public static String[] ordernarContasPorSaldo(String cliente, float saldo) {
        String[] d = {cliente, String.valueOf(saldo)};
        return d;
    }

    /**
     *
     * @param contas
     * @param ordem 0=ordem crescente; 1=ordem decrescente; Linha 84
     */
    public static void ordernar(String[][] contas, int ordem) {
        switch (ordem) {
            case 0:
                Arrays.sort(contas, (final String[] first, final String[] second) -> Double.valueOf(first[1]).compareTo(
                        Double.valueOf(second[1])
                ));
                break;
            case 1:
                Arrays.sort(contas, (final String[] first, final String[] second) -> Double.valueOf(second[1]).compareTo(
                        Double.valueOf(first[1])
                ));
                break;
        }

    }

    /*public static String[] ordernarContasPorSaldo(String cliente, double saldo) {
        
    }*/
    //método principal da classe (main())
    public  void main(String[] args) {

        //Declaração de um objeto do tipo Scanner para receber valores digitaos pelo usuário
        Scanner entradas = new Scanner(System.in);

        //Aqui estou criando um vetor de contas com 3 posições
        Conta[] contas = new Conta[3];

        //percorrendo o vetor
        for (int i = 0; i < 3; i++) {
            //cadastrando um novo cliente
            Cliente cliente = new Cliente();  //criando um objeto cliente, da classe Cliente

            System.out.print("Nome do cliente:");//imprimindo uma mensagem na tela

            cliente.setNome(entradas.next());//recebendo uma String digitada pelo usuário e armazenando no atributo nome, do objeto cliente
            //Observe que estou usando o método setNome para isto.

            //criando uma nova conta
            Conta conta = new Conta();
            conta.setCodigo(i + 1); //atribuindo um código para a nova conta crianda (armazenando um inteiro ao atributo código do objeto conta)
            System.out.print("Depósito inicial:");//imprimindo uma mensagem na tela

            conta.setSaldo(entradas.nextFloat());//Definindo o valor do depósito inicial na conta e armazenando no atributo saldo (setSaldo(float valor))          
            //muita atenção aqui
            //Lembra daquele atributo chamado cliente, da classe Conta? pois é! ele não é uma string ele é um cliente, do tipo Cliente
            //Aqui estou dizendo que o cliente que criamos acima (linha 18) é o dono da conta que estamos cadastrando (conta criada na linha26)
            //Observe que estou usando o método setCliente e passando como parâmetro um objeto, do tipo Cliente
            conta.setCliente(cliente);

            //incluindo a conta dentro do vetor, na posição i
            contas[i] = conta;
        }

        String[][] cnt = new String[3][3];
        System.out.println();
        //Agora o nosso vetor de contas está completo, com 3 contas cadastradas
        //Vamos fazer um teste, percorrendo o vetor e imprimindo o nome do titular de cada conta e o respectivo saldo.
        for (int i = 0; i < 3; i++) {
            cnt[i] = ordernarContasPorSaldo(contas[i].getCliente().getNome(), contas[i].getSaldo());
            System.out.print("Cliente:" + contas[i].getCliente().getNome() + " -- ");
//imprimindo o nome do ,dono da conta (observe: conta.getCliente.getNome):obtem o atributo nome do atributo cliente do objeto conta
            System.out.println("Saldo " + contas[i].getSaldo());//aqui imprimo o saldo da conta na tela (conta.getSaldo)*/
        }
        System.out.println();
        //Aqui, ordena a matriz de acordo com o valor do saldo em ordem crescente.
        ordernar(cnt, 0);
        //Imprime a matriz
        System.out.println("Saída ordenada:");
        for (String[] cnt1 : cnt) {
            System.out.println("Cliente:" + cnt1[0] + " -- " + cnt1[1]);
        }
        System.out.println();
        System.out.println(Arrays.deepToString(cnt));

    }

}
