package br.com.desafios.desafio;

public class DesafioSaida1 {
    public static void saida1(){
    int max = 39;

    //preenche os traços
        for (int i = 0; i < max; i++) {
        System.out.print("-");
    }
        // pula uma linha gerando espaço entre os traços e a barra
        System.out.print("\n");
        for (int k = 0; k <= 4; k++){
        System.out.print("|");
        if(k == 0 || k <= 4) {
            for (int l = 0; l < max-2; l++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
        for (int i = 0; i < max; i++) {
        System.out.print("-");
    }
}
    public static void main(String[] args) {
        saida1();
    }
}

