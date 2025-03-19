public class NumerosPares {
    public static void main(String[] args) {
        // Vetor com os números
        int[] numeros = {3, 5, 9, 10, 25};

        System.out.println("Posições dos números pares no vetor:");

        // Percorre o vetor
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { // Verifica se o número é par
                System.out.println("Número " + numeros[i] + " na posição " + i);
            }
        }
    }
}