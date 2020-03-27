package uvsq.fr.pgpl_4_2;

import java.util.Stack;

public class MoteurRPN extends Interpreteur {


	// constructeur
	public MoteurRPN() {
		super();
	}

	// enregistrement d'une operande
	public void enregistrerOperande(double val) {
		operandes.add(val);
		Stack<Double> temp=new Stack<Double>();
		temp.addAll(operandes);
		operandesPrecedent.add(temp);
	}
	// appliquer une operation sur les operandes
		public void appliquerOperation(Operations operation) throws ArithmeticException {
			if (operandes.size() >= 2) {

				double val1 = operandes.pop();

				double val2 = operandes.pop();

				operandes.add(operation.eval(val1, val2));
				
				
				Stack<Double> temp=new Stack<Double>();
				temp.addAll(operandes);
				operandesPrecedent.add(temp);		
				
			}

			else
				throw new ArithmeticException("vos operande (pas asez d'operandes pour effectuer l'operation)");
		}

}