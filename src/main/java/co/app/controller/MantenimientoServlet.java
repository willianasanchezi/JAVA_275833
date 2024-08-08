package co.app.controller;  
  
import co.app.dao.MantenimientoDAO;  
import co.app.model.Mantenimiento;  
  
import jakarta.servlet.ServletException;  
import jakarta.servlet.annotation.WebServlet;  
import jakarta.servlet.http.HttpServlet;  
import jakarta.servlet.http.HttpServletRequest;  
import jakarta.servlet.http.HttpServletResponse;  
  
import java.io.IOException;  
import java.io.Serial;  
import java.util.List;  
  
@WebServlet("/safezone/mantenimientos")  
public class MantenimientoServlet extends HttpServlet {  
    @Serial  
    private static final long serialVersionUID = 1L;  
    private MantenimientoDAO mantenimientoDAO;  
  
    public void init() {  
        mantenimientoDAO = new MantenimientoDAO();  
    }  
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        doGet(request, response);  
    }  
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        String action = request.getParameter("action");  
        if (action == null) {  
            action = "list";  
        }  
        switch (action) {  
            case "new":  
                showNewForm(request, response);  
                break;  
            case "insert":  
                insertMantenimiento(request, response);  
                break;  
            case "delete":  
                deleteMantenimiento(request, response);  
                break;  
            case "edit":  
                showEditForm(request, response);  
                break;  
            case "update":  
                updateMantenimiento(request, response);  
                break;  
            default:  
                listMantenimientos(request, response);  
                break;  
        }  
    }  
  
    private void listMantenimientos(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        List<Mantenimiento> listaMantenimientos = mantenimientoDAO.obtenerTodosLosMantenimientos();  
        request.setAttribute("listaMantenimientos", listaMantenimientos);  
        request.getRequestDispatcher("/safezone/mantenimiento-list.jsp").forward(request, response);  
    }  
  
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        request.getRequestDispatcher("/safezone/mantenimiento-form.jsp").forward(request, response);  
    }  
  
    private void insertMantenimiento(HttpServletRequest request, HttpServletResponse response)  
            throws IOException {  
        // Implementar la lógica para insertar un nuevo mantenimiento  
        // Debes obtener los parámetros del formulario y crear una instancia de Mantenimiento  
        // Luego, llamar al método insertarMantenimiento() del DAO  
        response.sendRedirect("../safezone/mantenimientos");  
    }  
  
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        // Implementar la lógica para mostrar el formulario de edición con los datos del mantenimiento  
        request.getRequestDispatcher("/safezone/mantenimiento-form.jsp").forward(request, response);  
    }  
  
    private void updateMantenimiento(HttpServletRequest request, HttpServletResponse response)  
            throws IOException {  
        // Implementar la lógica para actualizar un mantenimiento existente  
        response.sendRedirect("../safezone/mantenimientos");  
    }  
  
    private void deleteMantenimiento(HttpServletRequest request, HttpServletResponse response)  
            throws IOException {  
        // Implementar la lógica para eliminar un mantenimiento  
        response.sendRedirect("../safezone/mantenimientos");  
    }  
}  
