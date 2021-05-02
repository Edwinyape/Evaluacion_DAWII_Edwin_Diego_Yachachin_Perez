package com.empresa.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entity.Categoria;
import com.empresa.entity.Transnacional;
import com.empresa.service.CategoriaService;
import com.empresa.service.TransnacionalService;

@Controller
public class TransnacionalController {
	@Autowired
	private TransnacionalService transnacionalServicio;
	
	@Autowired
	private CategoriaService categoriaServicio;
	
	@RequestMapping("/verTransnacional")
	public String ver() {
		return "registraTransnacional";
	}
	
	@ResponseBody
	@RequestMapping("/listaCategoria")
	public List<Categoria> listaCategoria(){
		return categoriaServicio.listaCategoria();
	}
	
	
	@RequestMapping("/registraTransnacional")
	public String insertaTransnacional(Transnacional obj, HttpSession session){
		
		obj.setFec_reg_transnaacional(new Date());
		
		Transnacional objsalida=transnacionalServicio.insertaTransnacional(obj);
		
		if(objsalida==null) {
			session.setAttribute("MENSAJE", "Registro erróneo");
		}else {
			session.setAttribute("MENSAJE", "Registro exitoso");
		}
		
		return "redirect:verTransnacional";
	}
	
}
