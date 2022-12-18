package compavel;

public class Acao {
	public static void main(String[] args) {
		Comparavel cp1 = new Comparavel(10);
        System.out.println("");
        System.out.println("O valor digitado È Menor ou Igual a 69?");
        cp1.ÈMenorOuIgual();
        System.out.println("");
        System.out.println("O valor digitado È Maior ou Igual a 69?");
        cp1.ÈMaiorOuIgual();
        System.out.println("");
        System.out.println("O valor digitado È Diferente de 69?");
        cp1.ÈDiferenteDe();
	}
}
