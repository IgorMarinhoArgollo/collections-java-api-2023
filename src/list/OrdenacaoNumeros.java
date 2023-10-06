package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> lista;

    public OrdenacaoNumeros() {
        this.lista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        lista.add(numero);
    }

    public void ordenarAscendente() {
        List<Integer> listaAuxiliar = new ArrayList<>(lista);
        Collections.sort(listaAuxiliar);
        System.out.println(listaAuxiliar);
    }

    public void ordenerDescendente() {
        List<Integer> listaAuxiliar = new ArrayList<>(lista);
        Collections.sort(listaAuxiliar, Collections.reverseOrder());
        System.out.println(listaAuxiliar);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros lista = new OrdenacaoNumeros();
        lista.adicionarNumero(3);
        lista.adicionarNumero(1);
        lista.adicionarNumero(2);

        lista.ordenarAscendente();

        lista.ordenerDescendente();
    }
}
