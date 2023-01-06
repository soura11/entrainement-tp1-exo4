package org.eclipse.model;

public class MaDate {
	private int jour;
	private int mois;
	private int année;

	public MaDate() {
		super();
	}

	public MaDate(int jour, int mois, int année) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.année = année;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnée() {
		return année;
	}

	public void setAnnée(int année) {
		this.année = année;
	}

	public void ajouterUnjour() {
		if ((this.jour == 31) && (this.mois == 12)) {
			this.jour = 1;
			this.mois = 1;
			this.année++;
		} 
//		 else if ((this.jour <= 29) && (this.mois == 02)) {
//			this.jour = 1;
//			this.mois ++;
//		} 
		else if (( this.jour <= 28) && (this.mois >= 02)) {
			this.jour++;
		}
		else {
			this.jour++;
		}
	}

	public void ajouterPlusieursJours(int n) {
		if ((this.jour >= 31) && (this.mois == 12)) {
			this.jour = n;
			this.mois = 1;
			this.année++;
		}
		else if ((this.jour <= 28) && (this.mois >= 02)) {
		 this.jour += n; 
		} 
		else
		{
			this.jour += n;
		}
	}
	
	public void ajouterUnMois() {
		ajouterUnjour();
		this.mois ++;
	}
	
	public void ajouterUnAn() {
		this.année ++;
	}
		

	@Override
	public String toString() {
		return jour + " / " + mois + " / " + année;
	}

}
