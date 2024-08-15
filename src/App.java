import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import util.OrdenarPorNome;

import models.Produto;
import models.Veiculo;
public class App {
    public static void main(String[] args) throws Exception {
        
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Produto A", 25.3));
        produtos.add(new Produto("Produto B", 24.3));
        produtos.add(new Produto("Produto C", 27.3));

        Collections.sort(produtos); //ordena com base na implementação do compareTo
        System.out.println("Ordenado por preço Crescente: "+produtos);



        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("carro 1", "nissan"));
        veiculos.add(new Veiculo("carro 3", "asdasd"));
        veiculos.add(new Veiculo("carro 2", "hydai"));

        Collections.sort(veiculos, new OrdenarPorNome()); //ordena por nome

        System.out.println("Ordenado por nome: "+veiculos);



        


    }
}
