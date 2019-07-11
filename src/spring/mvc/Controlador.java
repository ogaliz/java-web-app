package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

//	Especificamos que vista queremos que nos muestre
	@RequestMapping
	public String muestrapagina() {
		
		return "paginaEjemplo"; // retornamos el nombre de la vista sin la extensión de archivo -> una página JSP
		
	}
	
}
