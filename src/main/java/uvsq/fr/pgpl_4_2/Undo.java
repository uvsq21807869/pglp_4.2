package uvsq.fr.pgpl_4_2;

public class Undo implements Command {

	private Interpreteur intrInterpreteur;
	
	public Undo(Interpreteur intrInterpreteur){
		this.intrInterpreteur=intrInterpreteur;
	}
	
	public void execute() {
		//open command is forwarding request to openFile method
		this.intrInterpreteur.undo();
	}

}