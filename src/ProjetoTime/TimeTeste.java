package ProjetoTime;
import java.util.Scanner;


public class TimeTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hora, minuto, segundo;
		Time t;
		
		System.out.println("digite o valor da hora");
		hora = input.nextInt();
		System.out.println("digite o valor dos minutos");
		minuto = input.nextInt();
		System.out.println("Rapidamente digite os segundos");
		segundo = input.nextInt();
		
		t = new Time(hora,minuto,segundo);
		
		System.out.println("O Horario Universal e: ");
		t.horaUniversal();
		System.out.println("O Horario Padrao e: ");
		t.horaPadrao();
		
	
}
}
