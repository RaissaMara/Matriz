package Teste;
import java.util.Scanner;

public class Matriz {
	//RAÍSSA MARA ALVES GOMES SANTANA
	public static void main(String[] args) {
		int N = 5; 
        // ALTERNATIVA a)
        System.out.println("Alternativa a):");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // ALTERNATIVA b)
        System.out.println("Alternativa b):");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ALTERNATIVA c)
        System.out.println("Alternativa c):");
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ALTERNATIVA d)
        System.out.println("Alternativa d):");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ALTERNATIVA e)
        System.out.println("Alternativa e):");
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ALTERNATIVA f)
        System.out.println("Alternativa f):");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "     ");
            }
            System.out.println();
        }
        System.out.println();

        // ALTERNATIVA g)
        System.out.println("Alternativa g):");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j == i || j == N - i + 1) {
                    System.out.print(j + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // ALTERNATIVA h)
        System.out.println("Alternativa h):");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j >= i) {
                    System.out.print(j + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // ALTERNATIVA i)
        System.out.println("Alternativa i):");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j == i || j == N - i + 1) {
                    System.out.print(j + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}