package it.objectmethod.asteroid.controlloEan;

public class ControlloEAN {

	public boolean controllo(String codice) {
		String[] numero = codice.split("");
		boolean result = false;
		Integer somma = 0;
		String codiceValidazione = numero[12];
		Integer NumeroVal = Integer.parseInt(codiceValidazione);
		System.out.println(codiceValidazione);
		for (int i = 0; i < numero.length - 1; i++) {
			Integer numeroInt = Integer.parseInt(numero[i]);
			if (i % 2 == 0) {
				numeroInt = numeroInt * 3;
			} else {
				numeroInt = numeroInt * 1;
			}
			somma = somma + numeroInt;
		}
		Integer numeroSottrazione = somma;
		while (numeroSottrazione % 10 != 0) {
			numeroSottrazione = numeroSottrazione + 1;
		}
		Integer numeroValidazione = numeroSottrazione - somma;
		System.out.println(numeroValidazione);
		if (numeroValidazione == NumeroVal) {
			result = true;
			System.out.println("Codice compatibile con gli standard");
		} else {
			System.out.println("Codice non compatibile con lo standard");
		}
		System.out.println(result);
		return result;
	}
}
