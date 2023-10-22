import java.util.Scanner;
public class ContagemValidacao {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Insira o primeiro parâmetro: ");
        int paramUm = terminal.nextInt();
        System.out.println("Insira o segundo parâmetro: ");
        int paraDois = terminal.nextInt();

            //Validação Parte 1
        try {
            contar(paramUm, paraDois);

        } catch (ErroParametroException exception) {
            System.out.println("ERRO! O segundo parâmetro deve obrigatoriamente ser maior que o primeiro!");
        }

    }
            //Validação Parte 2
    static void contar(int paramUm, int paramDois) throws ErroParametroException {
        if (paramUm > paramDois)
            throw new ErroParametroException();

            //Contar
        int contagemFinal = paramDois - paramUm;
        for (int contadorAtual = 1; contadorAtual <= contagemFinal; contadorAtual++) {
            System.out.println("Imprimindo o número: " + contadorAtual);
        }
    }
}