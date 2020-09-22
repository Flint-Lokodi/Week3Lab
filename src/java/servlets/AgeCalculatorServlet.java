package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 608787
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NumberFormatException {
       String ageString = request.getParameter("currentAge");
       if(ageString == null){
           String nullAge = "You must give your current age";
           request.setAttribute("nullAge", nullAge);
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
       }
       try{
           int currentAge = Integer.parseInt(ageString);
           int nextYearAge = currentAge+1;
           String correct = "Your age next year will be ";
           request.setAttribute("correct", correct);
           request.setAttribute("nextYearAge", nextYearAge);
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
       }catch (NumberFormatException e)
       {
           String wrong = "You must enter a number.";
           request.setAttribute("wrong", wrong);
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
       }
       
       
       
       
       
    }

}
