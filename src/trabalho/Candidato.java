package trabalho;

public class Candidato {
	private String nome;
	private int nVotos;
	private String num;
	private String perc;
	private Boolean eleito = false; 
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Boolean getEleito() {
		return eleito;
	}
	
	public void setEleito(){
		eleito = true;
	}
	
	public String getPerc() {
		return perc;
	}


	public void setPerc(String perc) {
		this.perc = perc;
	}


	public String getNum() {
		return num;
	}


	public void setnVotos(int nVotos){
		this.nVotos = nVotos;
	}
	
	public String getNomeCandidato(){
		return nome;
	}
	
	public int getnVotos(){
		return nVotos;
	}
	@Override
	public String toString(){
		return "Nome do Candidato: "+nome+" Número de votos: "+nVotos+" Número de Campanha: "+num+" Percetagem dos votos válidos: "+perc+" Eleito? "+eleito;
	}
	
}
