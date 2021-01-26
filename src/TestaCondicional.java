public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 20;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos!");
        } else {
            if(quantidadePessoas >= 2){
                System.out.println("Voce não tem 18, mas pode entrar porque está acompanhado.");
            } else {
                System.out.println("voce não pode entrar!");
            }
        }

    }
}
