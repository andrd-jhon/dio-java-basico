public class MinhaClasse {
    
    public static void main(String[] args) {
        String primeiroNome = "João Vitor";
        String segundoNome = "Andrade de Santana";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.err.println(nomeCompleto);
        // int anoFabricacao = 2022;

        // boolean verdadeira = false;

        // anoFabricacao = 2018;

    }
    public static String nomeCompleto(String primeiroNome, String segundoNome ) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
 