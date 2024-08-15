package util;
import models.Produto;
import models.Veiculo;
import java.util.Comparator;

public class OrdenarPorNome implements Comparator<Veiculo>{
    @Override
    public int compare(Veiculo v1, Veiculo v2) {
        return v1.getNome().compareTo(v2.getNome());
    }
}
