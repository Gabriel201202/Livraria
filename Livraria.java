import java.util.Random;
import java.util.Scanner;

public class Livraria {
  public static void main(String[] args) {
    Vendas V = new Vendas();
    V.Frete = 19.99;
    V.Estoque = 0;
    V.Compra = 0.00;
    
    Livro I = new Livro();
    I.titulo = "Senhor dos Anéis";
    I.ano = 1954;
    I.pagina = 224;
    I.preco = 59.99;
    I.avaliacao = 4.5;

    V.setEstoque(new Random().nextInt(2));

    if (V.Estoque == 1) {
      System.out.println("\n1:\nTítulo: "+I.titulo+"\nAno: "+I.ano
      +"\nPáginas: "+I.pagina+"\nPreço: R$"+I.preco+"\nAvaliação: "+I.avaliacao
      +"\nFrete: R$"+V.Frete+"\n\nFora de estoque");
    } else {
      System.out.println("\n1:\nTítulo: "+I.titulo+"\nAno: "+I.ano
      +"\nPáginas: "+I.pagina+"\nPreço: R$"+I.preco+"\nAvaliação: "+I.avaliacao
      +"\nFrete: R$"+V.Frete);
    }
    
    Livro II = new Livro();
    II.titulo = "Harry Potter";
    II.ano = 1998;
    II.pagina = 300;
    II.preco = 49.99;
    II.avaliacao = 4.3;

    V.setEstoque(new Random().nextInt(2));

    if (V.Estoque == 1) {
      System.out.println("\n2:\nTítulo: "+II.titulo+"\nAno: "+II.ano
      +"\nPáginas: "+II.pagina+"\nPreço: R$"+II.preco+"\nAvaliação: "+II.avaliacao
      +"\nFrete: R$"+V.Frete+"\n\nFora do estoque");
    } else {
      System.out.println("\n2:\nTítulo: "+II.titulo+"\nAno: "+II.ano
      +"\nPáginas: "+II.pagina+"\nPreço: R$"+II.preco+"\nAvaliação: "+II.avaliacao
      +"\nFrete: R$"+V.Frete);
    }
    
    Livro III = new Livro();
    III.titulo = "O Príncipe";
    III.ano = 1532;
    III.pagina = 122;
    III.preco = 14.99;
    III.avaliacao = 4.7;

    V.setEstoque(new Random().nextInt(2));

    if (V.Estoque == 1) {
      System.out.println("\n3:\nTítulo: "+III.titulo+"\nAno: "+III.ano
      +"\nPáginas: "+III.pagina+"\nPreço: R$"+III.preco+"\nAvaliação: "+III.avaliacao
      +"\nFrete: R$"+V.Frete+"\n\nFora do estoque");
    } else {
      System.out.println("\n3:\nTítulo: "+III.titulo+"\nAno: "+III.ano
      +"\nPáginas: "+III.pagina+"\nPreço: R$"+III.preco+"\nAvaliação: "+III.avaliacao
      +"\nFrete: R$"+V.Frete);
    }

    try (Scanner ler = new Scanner(System.in)) {
      System.out.println("\nQual desses livros deseja?");
      int esc = ler.nextInt();

      if (esc == 1) {
        Double total = I.preco + V.Frete;
        V.setCompra(total);

        System.out.println("\nPreço total: R$"+V.Compra);
      } else if (esc == 2) {
        Double total = II.preco + V.Frete;
        V.setCompra(total);

        System.out.println("\nPreço total: R$"+V.Compra);
      } else if (esc == 3) {
        Double total = III.preco + V.Frete;
        V.setCompra(total);

        System.out.println("\nPreço total: R$"+V.Compra);
      }
    }
  }
}