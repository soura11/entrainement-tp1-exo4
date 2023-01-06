package org.eclipse.test;

import org.eclipse.model.MaDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaDate maDate1 = new MaDate(11, 06, 1997);
		System.out.println(maDate1);
		MaDate maDate2 = new MaDate(31, 8, 1993);
		System.out.println(maDate2);
		MaDate maDate3 = new MaDate(25, 9 , 1995);
		System.out.println(maDate3);
		MaDate maDate4 = new MaDate(31, 12, 1999);
		System.out.println(maDate4);
		MaDate maDate5 = new MaDate(02, 04, 2001);
		System.out.println(maDate5);
		MaDate maDate6 = new MaDate(29, 02, 2018);
		System.out.println(maDate6);
		
		//maDate1.ajouterUnjour();
		//System.out.println(maDate1);
		maDate4.ajouterUnjour();
		maDate4.ajouterPlusieursJours(4);
		System.out.println(maDate4);
		//maDate6.ajouterUnjour();
		//System.out.println(maDate6);
		//maDate1.ajouterPlusieursJours(4);
		System.out.println(maDate1);
		//maDate6.ajouterPlusieursJours(5);
		maDate6.ajouterUnjour();
		System.out.println(maDate6);
		//maDate6.ajouterUnMois();
		//System.out.println(maDate6);
		maDate6.ajouterUnMois();
		System.out.println(maDate6);
		maDate1.ajouterUnMois();
		System.out.println(maDate1);
		maDate1.ajouterUnAn();
		System.out.println(maDate1);
		

	}

}
