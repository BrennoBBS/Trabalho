package trabalho;

public class Coligacao {
	private String partidosCol;
	private int totalVotos;
	
	public String getPartidosCol() {
		return partidosCol;
	}
	
	public void setPartidosCol(String partidosCol) {
		this.partidosCol = partidosCol;
	}
	
	public int getTotalVotos(){
		return totalVotos;
	}
	
	public void somaVotos(int votos){
		this.totalVotos = this.totalVotos + votos;
	}
	
	@Override
	public String toString (){
		return "Partidos na coliga��o:"+partidosCol +"\nTotal de votos da coliga��o:"+ totalVotos+"\n";
	}
	
	@Override
	public boolean equals(Object o){
		return this.partidosCol.compareTo(((Coligacao)o).partidosCol)==0;
	}
}
