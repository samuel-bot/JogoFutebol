package br.com.fiap.model;

public class Partida {
	
	private Time casa;
	
	private Time visitante;
	
	int golsCasa;
	
	int golsVisitante;
	
	

	public Partida(Time casa, Time visitante, int golscasa, int golsvisitante) {
		this.casa = casa;
		this.visitante = visitante;
		this.golsCasa = golscasa;
		this.golsVisitante = golsvisitante;
		
		if(golsCasa > golsVisitante) {
			int pts = this.casa.getPontos();
			this.casa.setPontos(pts + 3);
		}
		else if(golsCasa > golsVisitante) {
			int pts = this.visitante.getPontos();
			this.visitante.setPontos(pts + 3);
		}
		else {
			int ptsC = this.casa.getPontos() + 1;
			int ptsV = this.visitante.getPontos() + 1;
			this.casa.setPontos(ptsC);
			this.visitante.setPontos(ptsV);
			this.casa.addEmpate();
			this.visitante.addEmpate();
		}
	}
	
	

	public Time getCasa() {
		return casa;
	}

	public void setCasa(Time casa) {
		this.casa = casa;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public int getGolscasa() {
		return golsCasa;
	}

	public void setGolscasa(int golscasa) {
		this.golsCasa = golscasa;
	}

	public int getGolsvisitante() {
		return golsVisitante;
	}

	public void setGolsvisitante(int golsvisitante) {
		this.golsVisitante = golsvisitante;
	}

}
