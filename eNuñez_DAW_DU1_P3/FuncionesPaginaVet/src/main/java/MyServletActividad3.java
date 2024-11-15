import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServletActividad3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Constructor
    public MyServletActividad3() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Bienvenido a la página de citas</h1>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //vemos que form es (citaVeterinario.jsp o peluqueriaPerro.jsp)
        String action = request.getParameter("action");
        if (action == null) {
            action = "revisar"; 
        }

       
        String nombrePerro = request.getParameter("nombrePerro");
        String mensajeRespuesta = "";

        if ("lavar".equals(action)) {
            String estadoPelo = request.getParameter("estadoPelo");
            String tiempoUltimaCorte = request.getParameter("tiempoUltimaCorte");

            mensajeRespuesta = "<h1>Cita para Lavar al Perro</h1>";
            mensajeRespuesta += "<p>Nombre del perro: " + nombrePerro + "</p>";
            mensajeRespuesta += "<p>Estado del pelo: " + estadoPelo + "</p>";
            mensajeRespuesta += "<p>Último corte hace: " + tiempoUltimaCorte + "</p>";
        } else if ("revisar".equals(action)) {
            String pesoAnimal = request.getParameter("pesoAnimal");
            String problemaAnimal = request.getParameter("problemaAnimal");

            mensajeRespuesta = "<h1>Cita para Revisar al Animalito</h1>";
            mensajeRespuesta += "<p>Nombre del perro: " + nombrePerro + "</p>";
            mensajeRespuesta += "<p>Peso del animalito: " + pesoAnimal + "</p>";
            mensajeRespuesta += "<p>Problema: " + problemaAnimal + "</p>";
        }

        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println(mensajeRespuesta);
        out.println("<a href='" + (action.equals("lavar") ? "peluqueriaPerro.jsp" : "citaVeterinario.jsp") + "'>Volver</a>");
        out.println("</body></html>");
    }
}
