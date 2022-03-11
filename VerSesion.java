package servlet;

import servlet.Examen;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
* Servlet implementation class VerSesion
*/
@WebServlet("/VerSesion")
public class VerSesion extends HttpServlet {
private static final long serialVersionUID = 1L;

 /**
 * @see HttpServlet#HttpServlet()
 */
 public VerSesion() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
IOException {
HttpSession misesion= (HttpSession) request.getSession();
Examen  miAlumno = (Examen ) misesion.getAttribute("examen");
PrintWriter pw= response.getWriter();
pw.println("<html><body>"+"Direccion URL: "+request.getRequestURI();)
           +miAlumno) ;
pw.close(); }
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
IOException {
// TODO Auto-generated method stub
doGet(request, response);
}
}
