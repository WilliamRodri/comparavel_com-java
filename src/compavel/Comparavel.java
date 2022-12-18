package compavel;

import java.util.Scanner;

public class Comparavel {
	int value_um;
	int value_dois = 69;
	int respostas;
	
	Comparavel(){}
	
	Comparavel(int valueRespost){
		Scanner lerValue = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		int valor1 = lerValue.nextInt();;
		valueRespost = respostas;
		respostas = valor1;
		lerValue.close();
	}
	
	public int getValue() {
		return respostas;
    }

    public void setValue(int value_um, int value_dois) {
        this.value_um = value_um;
        this.value_dois = value_dois;
    }
	
    
	public int ÈMaiorOuIgual(){
		if(value_um <= value_dois) {
			System.out.println("Sim");
		}else {
			System.out.println("N„o");
		}
		return respostas;
	}
	
	public int ÈMenorOuIgual(){
		if(value_um >= value_dois) {
			System.out.println("Sim");
		}else {
			System.out.println("N„o");
		}
		return respostas;
	}
	
	public int ÈDiferenteDe(){
		if(value_um != value_dois) {
			System.out.println("Sim");
		}else {
			System.out.println("N„o");
		}
		return respostas;
	}
}
