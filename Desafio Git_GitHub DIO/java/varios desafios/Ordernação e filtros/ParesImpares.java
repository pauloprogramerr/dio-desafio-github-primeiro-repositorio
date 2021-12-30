import java.util.*;

public class ParesImpares {
    static Set<Integer> ordenar = new LinkedHashSet<>();
    private static Scanner ent = new Scanner(System.in);
    private static List<Integer> lista = new ArrayList<>();
    private static List<Integer> lista2 = new ArrayList<>();

    public static void outs(){
        int numEntrada = ent.nextInt();
        int contador = 0, valor;

        while (contador < numEntrada){
             valor = ent.nextInt();
             // entrada pares
             if(valor % 2 == 0){
                 lista.add(valor);
              // Entrada impares
             }else {
                lista2.add(valor);
             }
            contador++;
        }

        // ordena os pares
        Collections.sort(lista);
        for (Integer listaPar : lista) {
            System.out.println(listaPar);
        }

        // ordena e inverte os impares
        Collections.sort(lista2);
        Collections.reverse(lista2);
        for (Integer listaImpar : lista2) {
            System.out.println(listaImpar);
        }
    }
    public static void main(String[] args) {
        outs();
    }
}