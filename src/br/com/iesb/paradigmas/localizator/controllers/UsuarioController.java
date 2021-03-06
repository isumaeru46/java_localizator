package br.com.iesb.paradigmas.localizator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.iesb.paradigmas.localizator.models.RetornoModel;
import br.com.iesb.paradigmas.localizator.models.UsuarioModel;
import br.com.iesb.paradigmas.localizator.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@RequestMapping(value="/logar", method = RequestMethod.GET)
	public @ResponseBody RetornoModel logar(@RequestParam(value="login", required=true) String login, @RequestParam(value="senha", required=true) String senha){
		UsuarioModel usuarioModel = new UsuarioModel(login,senha);
		return getUsuarioService().logar(usuarioModel);
	}
	
	@RequestMapping(value="/cadastrar", method = RequestMethod.POST)
	public RetornoModel cadastrarNovoUsuario(UsuarioModel usuarioModel){
		return null;
	}
	
	@RequestMapping(value="/editar", method = RequestMethod.POST)
	public RetornoModel editarUsuario(UsuarioModel usuarioModel){
		return null;
	}
	
	@RequestMapping(value="/excluir", method = RequestMethod.POST)
	public RetornoModel excluirUsuario(UsuarioModel usuarioModel){
		return null;
	}
	
	@RequestMapping(value="/retornarTodosUsuarios", method = RequestMethod.GET)
	public @ResponseBody RetornoModel retornarTodosUsuarios(){
		return getUsuarioService().retornarTodosUsuarios();
	}
	
	public UsuarioService getUsuarioService() {
		if (usuarioService == null) {
			usuarioService = new UsuarioService();
		}
		return usuarioService;
	}

}
