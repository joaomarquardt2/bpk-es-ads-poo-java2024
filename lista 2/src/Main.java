public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


public class TiposDeDados {
    public static void main(String[] args) {
        int numero = 42;
        double decimal = 3.14;
        boolean verdade = true;
        char letra = 'A';

        System.out.println("Número inteiro: " + numero);
        System.out.println("Número decimal: " + decimal);
        System.out.println("Valor booleano: " + verdade);
        System.out.println("Caractere: " + letra);
    }
}

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));

        scanner.close();
    }
}

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class ArrayExemplo {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

public class Metodos {
    public static int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = soma(5, 7);
        System.out.println("A soma é: " + resultado);
    }
}

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação: 1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão");
        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        switch (escolha) {
            case 1 -> System.out.println("Resultado: " + (num1 + num2));
            case 2 -> System.out.println("Resultado: " + (num1 - num2));
            case 3 -> System.out.println("Resultado: " + (num1 * num2));
            case 4 -> System.out.println("Resultado: " + (num1 / num2));
            default -> System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String reverso = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(reverso)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        scanner.close();
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));

        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);

        scanner.close();
    }
}
import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int contagemVogais = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contagemVogais++;
            }
        }

        System.out.println("Número de vogais: " + contagemVogais);

        scanner.close();
    }
}
import java.util.Scanner;

public class Fatorial {
    public static int fatorialIterativo(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorialRecursivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        System.out.println("Fatorial (Iterativo): " + fatorialIterativo(numero));
        System.out.println("Fatorial (Recursivo): " + fatorialRecursivo(numero));

        scanner.close();
    }
}

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        if (escolha == 1) {
            double fahrenheit = (temperatura * 9/5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } else if (escolha == 2) {
            double celsius = (temperatura - 32) * 5/9;
            System.out.println("Temperatura em Celsius: " + celsius);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
