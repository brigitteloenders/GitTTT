package be.vdab.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class Valentijn
 */
@WebServlet("/valentijn")
public class Valentijn extends HttpServlet {
	
	@Resource(name="jdbc/verbinding")
	DataSource dataSource;
	//db verbinding wordt opgezocht en geinjecteerd in dataSource
	//we verwijzen naar de connection pool verbinding dr dataSourec te gebruiken
	
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Valentijn() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (Connection connection=dataSource.getConnection()) {
			request.setAttribute("boodschap", connection.getMetaData().getDatabaseProductName() );
		}
		catch (Exception e){
		request.setAttribute("boodschap",  e.getMessage() ) ;
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
				
	}
		
		//FileReader reader=new FileReader ("/recepten/wafels.htm");//om te demonstreren dat cludbees met findbugs fouten aantoont
		
		
		
	}

