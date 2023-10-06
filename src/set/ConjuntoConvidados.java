package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidados) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public void contarConvidados() {
        System.out.println(convidados.size());
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.adicionarConvidado("abc", 1234);
        conjuntoConvidados.adicionarConvidado("abc", 1235);
        conjuntoConvidados.adicionarConvidado("abc", 1236);
        conjuntoConvidados.adicionarConvidado("abc", 1237);

        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();
    }
}
