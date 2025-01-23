package Collection.Set.OperacoesBasicas.Desafio;

public class ListaCompras {
    // Atributo
    private String item;
    // Construtor
    public ListaCompras(String item){
        this.item = item;
    }
    // Métodos
    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Item = " + item ;
    }
}
