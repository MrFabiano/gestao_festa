package com.projeto.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.festa.model.Convidado;
import com.projeto.festa.repository.Convidados;

@Controller
public class ConvidadosController {
	
    @Autowired
	private Convidados convidados;
	
	@RequestMapping("/convidados")
	public ModelAndView Listar(){
		
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados", convidados.todos());
		mv.addObject(new Convidado());
		return mv;
		
	}
	
	@RequestMapping(value = "/convidados", method = RequestMethod.POST)
	public String salvar(Convidado convidado){
		this.convidados.adicionar(convidado);
		return "redirect:/convidados";
		
	}
	
}

