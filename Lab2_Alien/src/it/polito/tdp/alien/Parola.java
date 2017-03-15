package it.polito.tdp.alien;

import java.util.LinkedList;

public class Parola {
	
	String parolaAliena;
	String traduzione;
	LinkedList<String> lista=new LinkedList<String>();
	public Parola(String parolaAliena, String traduzione) {
		super();
		this.parolaAliena = parolaAliena;
		this.traduzione = traduzione;
		lista.add(traduzione);
	}
	public String getParolaAliena() {
		return parolaAliena;
	}
	public void setParolaAliena(String parolaAliena) {
		this.parolaAliena = parolaAliena;
	}
	public String getTraduzione() {
		return traduzione;
	}
	public void setTraduzione(String traduzione) {
		this.traduzione = traduzione;
	}
	public void addTranslate(String s) {
		lista.add(s);
		
	}
	public String getLista() {
		String lista1="";
		for(String s:lista)
			lista1=lista1+s+"\n";
		
		return lista1;
	}
	public void setLista(LinkedList<String> lista) {
		this.lista = lista;
	}
	
	
	

}
