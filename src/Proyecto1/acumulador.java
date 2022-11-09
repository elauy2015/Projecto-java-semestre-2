package Proyecto1;

public class acumulador  {
	int cantAs;
	int cantBs;
	int cantCs;
	int cantDs;
	int cantEs;
	double montoAs;
	double montoBs;
	double montoCs;
	double montoDs;
	double montoEs;
	
	public double acumulador(int xcantA, int xcantB, int xcantC, int xcantD, int xcantE, double xmontoA, double xmontoB, double xmontoC, double xmontoD, double xmontoE,String xdec) {
		int cantA= xcantA;
		int cantB= xcantB;
		int cantC= xcantC;
		int cantD= xcantD;
		int cantE= xcantE;
		double montoA= xmontoA;
		double montoB= xmontoB;
		double montoC= xmontoC;
		double montoD= xmontoD;
		double montoE= xmontoE;
		String dec = xdec;
		
		/**
		 * Agrego las cantidad de viajes hechos
		 */
		cantAs=cantAs+cantA;
		cantBs=cantBs+cantB;
		cantCs=cantCs+cantC;
		cantDs=cantDs+cantD;
		cantEs=cantEs+cantE;
		
		/**
		 * Agrego el monto total de esos viajes
		 */
		montoAs=montoAs+montoA;
		montoBs=montoBs+montoB;
		montoCs=montoCs+montoC;
		montoDs=montoDs+montoD;
		montoEs=montoEs+montoE;
		
		if(dec.equals("cantA")) {
			System.out.println(cantAs);
			return (cantAs);
		}else if (dec.equals("cantB")) {
			System.out.println(cantBs);
			return (cantBs);
		}
		else if (dec.equals("cantC")) {
			return (cantCs);
		}
		else if (dec.equals("cantD")) {
			return (cantDs);
		}
		else if (dec.equals("cantE")) {
			return (cantEs);
		}
		else if (dec.equals("montoA")) {
			return (montoAs);
		}
		else if (dec.equals("montoB")) {
			return (montoBs);
		}
		else if (dec.equals("montoC")) {
			return (montoCs);
		}
		else if (dec.equals("montoD")) {
			return (montoDs);
		}
		else if (dec.equals("montoE")) {
			return (montoEs);
		}

		return 5;
	}
	
}

