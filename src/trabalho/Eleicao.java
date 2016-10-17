package trabalho;

import java.util.*;

public class Eleicao {
	private LinkedList<Partido> partidos = new LinkedList<Partido>();
	private LinkedList<Coligacao> coligacoes = new LinkedList<Coligacao>();

	public LinkedList<Partido> getPartidos() {
		return partidos;
	}

	public LinkedList<Coligacao> getColigacoes() {
		return coligacoes;
	}
	
	public String toString (){
		return coligacoes+" "+partidos;
	}
	
	
}
