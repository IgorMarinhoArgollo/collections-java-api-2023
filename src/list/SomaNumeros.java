package list;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> lista;

    public SomaNumeros() {
        this.lista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        lista.add(numero);
    }

    public void calculaSoma() {
        int total = 0;
        if(!lista.isEmpty()){
            for(int numero: lista) {
                total += numero;
            }
        }
        System.out.println(total);
    }

    public void encontrarMaiorNumero() {
        if(!lista.isEmpty()){
            int maior = lista.get(0);
            for(int numero : lista) {
                if(numero > maior) {
                    maior = numero;
                }
            }
            System.out.println(maior);
        }
    }

    public void encontrarMenorNumero() {
        if(!lista.isEmpty()){
            int menor = lista.get(0);
            for(int numero : lista) {
                if(numero < menor) {
                    menor = numero;
                }
            }
            System.out.println(menor);
        }
    }

    public void exibirNumeros() {
        System.out.println(lista);
    }

    public static void main(String[] args) {
        SomaNumeros somanumeros = new SomaNumeros();
        somanumeros.adicionarNumero(5);
        somanumeros.adicionarNumero(2);
        somanumeros.adicionarNumero(3);

        somanumeros.exibirNumeros();

        somanumeros.calculaSoma();

        somanumeros.encontrarMenorNumero();

        somanumeros.encontrarMaiorNumero();
    }

}
