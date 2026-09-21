import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        String linha, linha2;
        String[] lista, lista2;
        double x1, x2, y1, y2, dist;
        
        //entrada de dados
        linha = leia.nextLine();
        linha2 = leia.nextLine();
        
        //conversão de linha para lista
        lista = linha.split(" ");
        x1 = Double.parseDouble(lista[0]);
        y1 = Double.parseDouble(lista[1]);
        lista2 = linha2.split(" ");
        x2 = Double.parseDouble(lista2[0]);
        y2 = Double.parseDouble(lista2[1]);
        
        //processamento
        dist = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
        
        //saida de dados 
        System.out.printf("%.4f\n", dist);
    }
}
