package trabalho;

import java.util.*;

public class Partido implements Comparable<String>{
	private String nomeP;
	private LinkedList<Candidato> candidatos = new LinkedList<Candidato>();

	
	
	public String getNomeP() {
		return nomeP;
	}



	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}



	public LinkedList<Candidato> getCandidatos() {
		return candidatos;
	}



	public void setCandidatos(LinkedList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}



	@Override
	public String toString(){
		return "Partido: "+nomeP+candidatos+"\n";
	}
	
	@Override
	public boolean equals(Object o){
		return nomeP.compareTo(((Partido)o).nomeP)==0;
	}



	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return nomeP.compareTo(o);
	}
}
