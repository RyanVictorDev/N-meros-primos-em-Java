import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variavel que será usada para contar quantas divisões acontecerão.
        int contadorDivisao = 0;

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        //Estrutura de repetição for utilizada para dividir o número digitado de 1 até ele mesmo.
        for (int i = 1; i <= numero; i++){
            //Estrutura de condição if para checkar se o resto da divisão é 0.
            if (numero%i == 0){
                //se o resto for 0, a variável contadorDivisão receberá +1.
                contadorDivisao++;
            }
        }
        //Estrutura de condição que verifica a quantidade de divisões feita.
        if (contadorDivisao == 2){
            //se a quantidade for 2, o número será primo.
            System.out.println("O número é primo!");
        } else {
            //caso não, não será primo.
            System.out.println("O número não é primo.");
        }
    }
}
