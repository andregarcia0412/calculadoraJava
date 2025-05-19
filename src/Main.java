import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo a calculadora!");
        System.out.println("Escolha uma operação: 1. Adição; 2. Subtração; 3. Multiplicação; 4. Divisão; 5. Potenciação; 6. Radiciação");

        Scanner input = new Scanner(System.in);
        int operation = input.nextInt();


        if(operation == 1){
            System.out.println("Digite o primeiro número:");
            double num1 = input.nextFloat();
            System.out.println("Digite o segundo número:");
            double num2 = input.nextFloat();
            double sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum );
        } else if(operation == 2){
            System.out.println("Digite o primeiro número:");
            double num1 = input.nextFloat();
            System.out.println("Digite o segundo número:");
            double num2 = input.nextFloat();
            double subtraction = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + subtraction);
        } else if(operation == 3){
            System.out.println("Digite o primeiro número:");
            double num1 = input.nextFloat();
            System.out.println("Digite o segundo número:");
            double num2 = input.nextFloat();
            double multiplication = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + multiplication);
        } else if(operation == 4){
            System.out.println("Digite o primeiro número:");
            double num1 = input.nextFloat();
            System.out.println("Digite o segundo número:");
            double num2 = input.nextFloat();
            double division = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + division);
        } else if(operation == 5){
            System.out.println("Digite o primeiro número:");
            double num1 = input.nextFloat();
            System.out.println("Digite o segundo número:");
            double num2 = input.nextFloat();
            double power = 1;
            for(int i = 1; i <= num2; i++){
                power *= num1;
            }
            System.out.println(num1 + " ^ " + num2 + " = " + power);
        } else if(operation == 6){
            System.out.println("Digite o primeiro número:");
            double num1 = input.nextFloat();
            System.out.println("Digite o segundo número:");
            double num2 = input.nextFloat();
            double squared = Math.pow(num1, 1/num2);
            System.out.println(num1 + " √ " + num2 + " = " + squared);
        } else{
            System.out.println("Operação Inválida.");
        }
    }
}