package compavel;

public class Acao {
	public static void main(String[] args) {
		Comparavel cp1 = new Comparavel(10);
        System.out.println("");
        System.out.println("O valor digitado � Menor ou Igual a 69?");
        cp1.�MenorOuIgual();
        System.out.println("");
        System.out.println("O valor digitado � Maior ou Igual a 69?");
        cp1.�MaiorOuIgual();
        System.out.println("");
        System.out.println("O valor digitado � Diferente de 69?");
        cp1.�DiferenteDe();
	}
}
