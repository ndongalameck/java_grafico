/*
 * Exercício Aplicando os Operadores Estudados
 * @author António Yosica
*/
import java.util.Scanner;
public class OpExec{
	public static void main(String[] operadores){
	Scanner valor=new Scanner(System.in);
	System.out.print("Digite o valor do raio: ");
	double raio=valor.nextDouble();

	// Diamétro = 2*raio
	double diametro=2*raio;
	System.out.println("Diamétro= "+diametro);

	//Circunferência = 2*pi*raio
	double pi=Math.PI;
	double circunferencia=2*pi*raio;
	System.out.println("Circunferência= "+circunferencia);

	//Área = pi*(raio*raio)
	double area=pi*(raio*raio);
	System.out.println("Área= "+area);
	}
}
