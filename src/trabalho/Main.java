package trabalho;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {

		Eleicao eleicao = new Eleicao();

		
		int numVagas=0;
		try {
			//Abre o arquivo csv
			Scanner entrada = new Scanner(new FileReader ("vitoria2016.csv"));


			//Pula a primeira linha
			entrada.nextLine();

			Scanner subscanner1 = null;

			//Definindo delimitador
			entrada.useDelimiter("\\;|\\n");

			//int contaVoltas=0;
			while (entrada.hasNext()){


				
				//Candidato desta execução
				Candidato candidato = new Candidato();

				//Pega o primeiro token, a posição no ranking
				String str = entrada.next();
				if (str.contains("*")){
					numVagas++;
					candidato.setEleito();
				}

				//pega o segundo token, o número, e o atribui ao candidato
				str = entrada.next();
				candidato.setNum(str);

				//pega o terceiro token, o nome e o atribui ao candidato
				str = entrada.next();
				candidato.setNome(str);

				//pega o quarto token, partido/coligação, agora teremos um tratamento especial
				str = entrada.next();				

				//Subscanner, com outro delimitador
				subscanner1 = new Scanner(str);
				subscanner1.useDelimiter("-");

				//Extraído o string do Partido
				String stringPartido = subscanner1.next();

				//Extraído o string da Coligação
				String stringColigacao = null;
				if (str.contains("-")){
					stringColigacao = subscanner1.next();
				}
				//Extraído o número de votos do candidato
				int nvotos = entrada.nextInt();

				//Atribuindo o número de votos ao candidato
				candidato.setnVotos(nvotos);

				//Pegando a percentagem dos votos válidos
				String votosValidos = entrada.next();

				//Atribuindo
				candidato.setPerc(votosValidos);

				Partido partido = new Partido();
				partido.setNomeP(stringPartido);

				if (eleicao.getPartidos().contains(partido)){
					//Partido já existe, adiciona o candidato ao partido
					for (Partido p : eleicao.getPartidos()){
						if (p.equals(partido)){
							p.getCandidatos().add(candidato);
						}
					}
				}
				else{
					//Partido não existe, add o candidato e o partido na eleicao
					partido.getCandidatos().add(candidato);
					eleicao.getPartidos().add(partido);
				}


				if (stringColigacao!=null){
					Coligacao coligacao = new Coligacao();
					coligacao.setPartidosCol(stringColigacao);

					if (eleicao.getColigacoes().contains(coligacao)){
						for (Coligacao c : eleicao.getColigacoes()){
							if(c.getPartidosCol().equals(stringColigacao)){
								c.somaVotos(nvotos);
							}
						}
					}
					else{
						coligacao.somaVotos(nvotos);
						eleicao.getColigacoes().add(coligacao);
					}
				}

				//System.out.println(eleicao);
				//contaVoltas++;
				//if (contaVoltas>5){
				//	break;
				//}
				//teste
			}
			entrada.close();
			subscanner1.close();
			
			System.out.println(eleicao);
			
			System.out.println(numVagas);
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo não encontrado!");


		}

	}

}
