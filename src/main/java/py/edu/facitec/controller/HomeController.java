package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String metodo() {
				//página
		
		return "index";
	}
	//prefijo  /archivo/  apllication.properties
	//sufijo   .html  

	@RequestMapping("/cliente")
	public String metodo2() {
				//página
		
		return "/cliente/formulario";
	}
	
	

}
