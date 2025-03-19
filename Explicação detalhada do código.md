Exercício da matéria Estutura de Dados - 2º Semestre Sistemas para Internet - FATEC

Aqui está a explicação detalhada de cada linha do código em Java que percorre um vetor de números e identifica a posição dos valores pares.
________________________________________
Código:
public class NumerosPares {
•	Declaração da classe NumerosPares: 
o	Em Java, todo código deve estar dentro de uma classe.
o	O nome da classe é NumerosPares e segue a convenção de nomes com a primeira letra maiúscula.
________________________________________
    public static void main(String[] args) {
•	Método principal do programa: 
o	O método main é o ponto de entrada do programa, onde a execução começa.
o	public → Indica que o método pode ser acessado de qualquer parte do programa.
o	static → Permite que o método seja chamado sem precisar criar um objeto da classe.
o	void → Indica que o método não retorna um valor.
o	String[] args → Permite passar argumentos da linha de comando (não utilizados neste código).
________________________________________
        int[] numeros = {3, 5, 9, 10, 25};
•	Declara e inicializa um vetor de inteiros (int[]) chamado numeros. 
o	O vetor contém os valores {3, 5, 9, 10, 25}.
o	Os índices do vetor são: 
	numeros[0] = 3
	numeros[1] = 5
	numeros[2] = 9
	numeros[3] = 10
	numeros[4] = 25
________________________________________
        System.out.println("Posições dos números pares no vetor:");
•	Exibe uma mensagem informativa no console para o usuário.
•	System.out.println(...) é usado para imprimir texto na tela.
________________________________________
        for (int i = 0; i < numeros.length; i++) {
•	Início de um laço for que percorre o vetor numeros: 
o	int i = 0 → Declara a variável i e inicia com o valor 0 (primeira posição do vetor).
o	i < numeros.length → A condição i < numeros.length garante que o loop continue até a última posição do vetor. 
	numeros.length retorna o tamanho do vetor, que é 5 nesse caso.
o	i++ → Incrementa i em 1 a cada iteração para percorrer o vetor de 0 a 4.
________________________________________
            if (numeros[i] % 2 == 0) {
•	Verifica se o número é par: 
o	numeros[i] % 2 == 0 → O operador % (módulo) retorna o resto da divisão por 2.
o	Se o resultado for 0, o número é par.
Passo a passo do loop:
1.	i = 0, numeros[0] = 3 → 3 % 2 = 1 ❌ (ímpar, não imprime nada).
2.	i = 1, numeros[1] = 5 → 5 % 2 = 1 ❌ (ímpar, não imprime nada).
3.	i = 2, numeros[2] = 9 → 9 % 2 = 1 ❌ (ímpar, não imprime nada).
4.	i = 3, numeros[3] = 10 → 10 % 2 = 0 ✅ (par, imprime a mensagem).
5.	i = 4, numeros[4] = 25 → 25 % 2 = 1 ❌ (ímpar, não imprime nada).
________________________________________
                System.out.println("Número " + numeros[i] + " na posição " + i);
•	Exibe o número par encontrado e sua posição no vetor: 
o	"Número " + numeros[i] → Concatena a string "Número " com o valor do número encontrado.
o	" na posição " + i → Concatena a string " na posição " com o valor do índice do vetor.
Saída esperada no console:
Posições dos números pares no vetor:
Número 10 na posição 3
•	Apenas o número 10 será impresso, pois é o único par no vetor.
________________________________________
Resumo do Código
✔ Percorre um vetor de números {3, 5, 9, 10, 25}.
✔ Verifica quais números são pares (% 2 == 0).
✔ Exibe a posição desses números no vetor. 🚀
