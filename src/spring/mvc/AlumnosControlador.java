package spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		String nombre = request.getParameter("nombreAlumno");
		
		nombre+=" es el mejor alumno";
		
		String mensajeFinal = "Quien es el mejor alumno? " + nombre;
		
//		Agregando información al modelo
		modelo.addAttribute("mensajeClaro", mensajeFinal); // mensajeFinal lo identificamos como 'mensajeClaro'
		
		return "HolaAlumnosSpring";
		
	}
	
	
	
	
	
}
