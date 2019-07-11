package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlumnosControlador {

	//Metodo encargado de pedir al servidor que devuelva el formulario
	@RequestMapping("/muestraFormulario") // especificamos la URL que el usuario tiene que utilizar
	public String muestraFormulario() {
		
		return "HolaAlumnoFormulario"; // retornamos el nombre de la vista -> una página JSP
		
	}
	
	//Metodo que procesa la información que el usuario introduce
	@RequestMapping("/procesarFormulario") // URL de la respuesta
	public String procesarFormulario() {
		
		return "HolaAlumnosSpring"; // retornamos el nombre de la vista -> una página JSP
	}
}
