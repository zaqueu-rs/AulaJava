// Primeiro código em java dia 08/08
/* Classe pricipal
* Exemplo de classe
*/

public class MeuProjeto
{
     public int idade = 36;
     public double peso = 87.5;
     public char letra = 'a';
   
    public static void main(String[] args)
    {
        MeuProjeto esteProjeto = new MeuProjeto();
        esteProjeto.idade = 34;
        esteProjeto.letra = 'c';
        esteProjeto.peso = 3.56;
        String texto = "Valor:";
        System.out.println(texto + esteProjeto.idade);
        meuMetodo();
    }
}