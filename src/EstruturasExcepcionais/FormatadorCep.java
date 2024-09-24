package EstruturasExcepcionais;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatadorCep("08430530");

            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio." );
        }

    }
    static String formatadorCep (String cep) throws CepInvalidoException{
        if(cep.length() != 8 ) {
            throw new CepInvalidoException();
        }

        // Simulando um Cep formatado
        return cep;
    }

}
