package co.app.controller;  
  
import co.app.dao.ProductoDAO;  
import co.app.model.Producto;  
  
import jakarta.servlet.ServletException;  
import jakarta.servlet.annotation.WebServlet;  
import jakarta.servlet.http.HttpServlet;  
import jakarta.servlet.http.HttpServletRequest;  
import jakarta.servlet.http.HttpServletResponse;  
  
import java.io.IOException;  
import java.io.Serial;  
import java.util.List;  
  
@WebServlet("/safezone/productos")  
public class ProductosServlet extends HttpServlet {  
    @Serial  
    private static final long serialVersionUID = 1L;  
    private ProductoDAO productoDAO;  
  
    public void init() {  
        productoDAO = new ProductoDAO();  
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
                insertProducto(request, response);  
                break;  
            case "delete":  
                deleteProducto(request, response);  
                break;  
            case "edit":  
                showEditForm(request, response);  
                break;  
            case "update":  
                updateProducto(request, response);  
                break;  
            default:  
                listProductos(request, response);  
                break;  
        }  
    }  
  
    private void listProductos(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        List<Producto> listaProductos = productoDAO.obtenerTodosLosProductos();  
        request.setAttribute("listaProductos", listaProductos);  
        request.getRequestDispatcher("/safezone/producto-list.jsp").forward(request, response);  
    }  
  
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        request.getRequestDispatcher("/safezone/producto-form.jsp").forward(request, response);  
    }  
  
    private void insertProducto(HttpServletRequest request, HttpServletResponse response)  
            throws IOException {  
        // Implementar la lógica para insertar un nuevo producto  
        // Debes obtener los parámetros del formulario y crear una instancia de Producto  
        // Luego, llamar al método insertarProducto() del DAO  
        response.sendRedirect("../safezone/productos");  
    }  
  
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        // Implementar la lógica para mostrar el formulario de edición con los datos del producto  
        request.getRequestDispatcher("/safezone/producto-form.jsp").forward(request, response);  
    }  
  
    private void updateProducto(HttpServletRequest request, HttpServletResponse response)  
            throws IOException {  
        // Implementar la lógica para actualizar un producto existente  
        response.sendRedirect("../safezone/productos");  
    }  
  
    private void deleteProducto(HttpServletRequest request, HttpServletResponse response)  
            throws IOException {  
        // Implementar la lógica para eliminar un producto  
        response.sendRedirect("../safezone/productos");  
    }  
}  
