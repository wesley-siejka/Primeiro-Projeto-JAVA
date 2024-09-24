public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screem Match");
        System.out.println("Filme: Shrek");

        int anoDeLancamento = 2001;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 10.0;
        // media calculada pelas notas da minha cabeça
        double media = (10.0 + 6.6) /2;
        System.out.println("Media do filme: "+media);
        String sinopse;
        sinopse = """
                Conta sobre um ogro que vai atras de uma princesa
                Muito bom filme
                Ano de lançamento: """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}