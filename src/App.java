import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        //Requisito 01: Pergunte quanto você ganha por hora e o número de horas trabalhadas
        System.out.print("Entre com o seu valor da sua hora: ");
        int valor_hora = sc.nextInt();
        System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");  
        int hora_mes = sc.nextInt();

        sc.close();

        //Requisito 02: Calcular e mostrar o total do seu salário no referido mês
        int salario_mes = valor_hora * hora_mes;
        System.out.print("O valor do seu salário esse mês é " + salario_mes + " reais.");
    
    }
}
