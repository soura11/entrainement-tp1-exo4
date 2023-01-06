package org.eclipse.model;

public class MaDate {
	private int jour;
	private int mois;
	private int ann�e;

	public MaDate() {
		super();
	}

	public MaDate(int jour, int mois, int ann�e) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.ann�e = ann�e;
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

	public int getAnn�e() {
		return ann�e;
	}

	public void setAnn�e(int ann�e) {
		this.ann�e = ann�e;
	}

	public void ajouterUnjour() {
		if ((this.jour == 31) && (this.mois == 12)) {
			this.jour = 1;
			this.mois = 1;
			this.ann�e++;
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
			this.ann�e++;
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
		this.ann�e ++;
	}
		

	@Override
	public String toString() {
		return jour + " / " + mois + " / " + ann�e;
	}

}
