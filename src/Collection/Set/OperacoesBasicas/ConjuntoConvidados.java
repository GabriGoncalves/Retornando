package Collection.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributo
    private Set<Convidado> convidadoSet;
    // Construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    // Métodos
    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvidado){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvidado){
                convidadoParaRemover = c;
                break;
            }// else { System.out.println("Código de convite inválido ou convidado inexistente"); }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public void contarConvidados(){
        System.out.println(convidadoSet.size());
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidado = new ConjuntoConvidados();

        convidado.adicionarConvidado("Gabriel", 2625);
        convidado.adicionarConvidado("Evelin", 2624);
        convidado.adicionarConvidado("Levi", 1900);
        convidado.adicionarConvidado("Gabriel", 2426);

        convidado.exibirConvidados();
        convidado.contarConvidados();

        convidado.removerConvidadoPorCodigoConvite(2056);
        convidado.removerConvidadoPorCodigoConvite(2426);

        convidado.contarConvidados();
        convidado.exibirConvidados();
    }
}
