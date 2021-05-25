package com.prueba.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.prueba.entities.Usuarios;
import com.prueba.services.GenericoServices;

@Controller
public class LoginController {
	
//	@Autowired
//	GenericoServices genericoServices;
	
//	HttpSession session;
//	public static String esquema;
//	
//	@RequestMapping(value ="/guardaUsuario", method=RequestMethod.POST, consumes = "application/json")
//	public @ResponseBody String guardaUsuario(@RequestBody String cadena, HttpServletRequest request){
//		
//		System.out.println("Entre guarda usuario");
//		session = request.getSession(true);
//		String esquema = "usuarios_login";
//		Gson gson = new Gson();
//		Usuarios usuario = gson.fromJson(cadena, Usuarios.class);
//		
//		Object[] user = new Object[16];
//		genericoServices.ejecutaSP(esquema + ".spi_usuario(?,?)", user);
//		
//		return cadena;
//		
//	}
	
	@RequestMapping("/loguear")
    public String hola(ModelMap model) {
        model.addAttribute("mensaje", "INGRESE USUARIO Y CONTRASEÑA DEL SISTEMA");
        return "hola";
    }

}
