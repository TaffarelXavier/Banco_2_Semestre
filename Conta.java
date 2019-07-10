//Classe conta
//Exemplo visto na aula de 27/09/2018
//Computação Gráfica I/Aula II/Revisão POO e estruturas de dados com Java
//Prof Charles Miranda Santos

public class Conta {
    //seria uma espécie de "número da conta". Para simplificar, escolhemos apenas código, como um número inteiro que idenfiticará uma determinada conta
    
    private int codigo; //pergunta: pense sobre o motivo pelo qual se usa métodos e atributos privados.
    
    private float saldo; //o que ocorreria se eu omitisse a palavra private na declaração deste atributo?
    
    //Atenção aqui. Este atributo é um objeto do tipo cliente
    //Não é uma string, é um objeto pertencente à classe cliente
    //Com este atributo, estou afirmando que cada conta é vinculada a um determinado cliente
    private Cliente cliente;

    //Veja comentários aos métodos get e set na classe Cliente. O mesmo se aplica aqui
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }   
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    //Mais uma vez, atenção aqui. Estou atribuindo ao atributo cliente um objeto do tipo Cliente 
    //observe as iniciais minúsculas e maiúsculas, cliente (inicial minúscula) é objeto e Cliente(inicial maiúscula) é classe
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }   
    
    //método para simular um saque da conta
    //recebe o valor do saldo e subtrai este valor do saldo da conta
    public void sacar(float valor){
        this.setSaldo(this.getSaldo() - valor);       
    }
    
    
    //método para simular um depósito na conta
    //recebe o valor do depósito e soma este valor ao saldo da conta
    public void depositar(float valor){
        this.setSaldo(this.getSaldo() + valor);
    }   
}
