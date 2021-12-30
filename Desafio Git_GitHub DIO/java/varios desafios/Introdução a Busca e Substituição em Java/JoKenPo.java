package br.com.desafios.desafio;

import java.util.Scanner;

public class JoKenPo {
	static Scanner token = new Scanner(System.in);
	static String[] esc = {"tesoura", "papel", "pedra", "lagarto", "spock"};

	public static void main(String[] args) {
		final String fernanda = "fernanda", marcia = "marcia";
		int qtd;
		String[] fer, mar;
		PedraPapelTesoura teste = new PedraPapelTesoura();

		qtd = Integer.parseInt(token.next());
		fer = new String[qtd];
		mar = new String[qtd];

		for (int i = 0; i < qtd; i++) {
			fer[i] = token.next();
			mar[i] = token.next();
		}

		for (int i = 0; i < qtd; i++) {
			teste.setOpcaoF(fer[i]);
			teste.setOpcaoM(mar[i]);

			if (teste.getOpcaoF().equals(teste.getOpcaoM())) {
				System.out.println("empate");

			}else if((teste.getOpcaoF().contains(esc[3])) &&
					((teste.getOpcaoM().contains(esc[4]) ||
							teste.getOpcaoM().contains(esc[1])))){
				System.out.println(fernanda);

			}else if ((teste.getOpcaoF().contains(esc[0])) &&
					((teste.getOpcaoM().contains(esc[1]) ||
							teste.getOpcaoM().contains(esc[3])))){
				System.out.println(fernanda);

			}else if((teste.getOpcaoF().contains(esc[1])) &&
					((teste.getOpcaoM().contains(esc[2]) ||
							teste.getOpcaoM().contains(esc[4])))){
				System.out.println(fernanda);

			}else if((teste.getOpcaoF().contains(esc[2])) &&
					((teste.getOpcaoM().contains(esc[3]) ||
							teste.getOpcaoM().contains(esc[0])))){
				System.out.println(fernanda);

			}else if((teste.getOpcaoF().contains(esc[4])) &&
					((teste.getOpcaoM().contains(esc[0]) ||
							teste.getOpcaoM().contains(esc[2])))){
				System.out.println(fernanda);

			}else{
				System.out.println(marcia);
			}
		}
	}
}
class PedraPapelTesoura{
	private String opcaoM;
	private  String opcaoF;

	public String getOpcaoM() {
		return opcaoM;
	}

	public void setOpcaoM(String opcaoM) {
		this.opcaoM = opcaoM;
	}

	public String getOpcaoF() {
		return opcaoF;
	}

	public void setOpcaoF(String opcaoF) {

		this.opcaoF = opcaoF;
	}

}
