import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrer un nombre entier positif: ");
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Erreur: Le nombre n'est pas positif");
        } else {
            int[] nombres = new int[N];
            int somme = 0;


            for (int i = 0; i < N; i++) {
                nombres[i] = i + 1;
                somme += nombres[i];
            }

            System.out.print("Tableau des " + N + "nombres : ");
            for (int i = 0; i <= N - 1; i++) {

                System.out.print(nombres[i]);
                if (i < N - 1) {
                    System.out.print(",");
                }
                System.out.println("");
                System.out.println("La somme des elements du tableau est: " + somme);

            }
        }
    }
}
