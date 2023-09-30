package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.Usuario;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("mail");
		String password = request.getParameter("clave");
	
		Usuario useringresado = validarUsuario(user, password);
		if (useringresado != null) {
			
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("sesionActiva", "1");
			httpSession.setAttribute("usuario", useringresado.getNombreusuario());
			httpSession.setAttribute("nombre", useringresado.getNombreapellido());
			
			System.out.println("USUARIO LOGEADO");
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		} else {
			request.setAttribute("mensajeError", "Usuario o Clave Incorrectos");
			request.getRequestDispatcher("formulario.jsp").forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	private Usuario validarUsuario(String user, String password) {
	
	ArrayList<Usuario> usuarios = new ArrayList<>();
	
	usuarios.add(new Usuario("Lionel Messi", "Lionel@gmail.com", "1234"));
	usuarios.add(new Usuario("Jose Gomez", "JGomez@gmail.com", "12341234"));
	usuarios.add(new Usuario("Maria Suarez", "Mari@gmail.com", "4321"));
	
	for (Usuario usuario : usuarios) {
		
		
		if (usuario.getNombreusuario().equals(user) && usuario.getClave().equals(password)) {
			return usuario;
		}
	}
	return null;
	}
}
