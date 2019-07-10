//Classe cliente com um único atributo chamado "nome"
//Classe conta
//Exemplo visto na aula de 27/09/2018
//Computação Gráfica I/Aula II/Revisão POO e estruturas de dados com Java
//Prof Charles Miranda Santos

public class Cliente {

    private String nome;

    //Modifica o valor do atributo nome
    //Armazena no ATRIBUTO nome o valor passado como parâmetro na VARIÁVEL nome
    //pergunta: qual a diferença entre variável e atributo?
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //obtem e retorna o valor armazenado no atributo nome
    //observe que o método é do tipo String, pois deverá retornar um valor armazenado em um atributo do tipo String
    public String getNome()
    {
        return this.nome;
    }
}
