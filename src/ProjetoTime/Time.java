package ProjetoTime;

public class Time {

	private int hora;
	private int minuto;
	private int segundo;
	
	
	public Time(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void horaUniversal() {
	System.out.println(hora+":"+minuto+":"+segundo);
	}
	
	public void horaPadrao() {
		if (hora<12 && hora != 0){
			System.out.println(hora+":"+minuto+":"+segundo+" AM");
		}else if (hora == 12){
			System.out.println(hora+":"+minuto+":"+segundo+" PM");
		}else if (hora != 0) {
			hora = hora -12;
			System.out.println(hora+":"+minuto+":"+segundo+" PM");
		} else if (hora == 0) {
			hora = 12;
			System.out.println(hora+":"+minuto+":"+segundo+" AM");
		}
	}
}


