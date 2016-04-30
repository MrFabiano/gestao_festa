package com.projeto.festa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.projeto.festa.model.Convidado;

@Repository
public class Convidados {
	
	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();
	
	static {
		
		LISTA_CONVIDADOS.add(new Convidado("Carol", 2));
		LISTA_CONVIDADOS.add(new Convidado("Amanda", 3));
		LISTA_CONVIDADOS.add(new Convidado("Paula", 1));
	}
	
	public List<Convidado> todos(){
		return Convidados.LISTA_CONVIDADOS;
	}
	
	public void adicionar(Convidado convidado){
		Convidados.LISTA_CONVIDADOS.add(convidado);
	}

}
