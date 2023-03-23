package AnatomiaClasse;

public class AnatomiaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Arly";
        String segundoNome = "Júnior";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
