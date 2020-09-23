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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String answer = "---";
        request.setAttribute("answer", answer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NumberFormatException{
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        if(first == null || second == null){
           String answer = "Invalid";
           request.setAttribute("first", first);
           request.setAttribute("second", second);
           request.setAttribute("answer", answer);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
       }
        try{
            Double firstNum = Double.parseDouble(first);
            Double secondNum = Double.parseDouble(second);
            if (request.getParameter("add") != null) {
                Double answer = firstNum + secondNum;
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                request.setAttribute("answer", answer);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
            else if (request.getParameter("subtract") != null) {
                Double answer = firstNum - secondNum;
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                request.setAttribute("answer", answer);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
            else if (request.getParameter("multiply") != null) {
                Double answer = firstNum * secondNum;
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                request.setAttribute("answer", answer);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
            else if (request.getParameter("divide") != null) {
                Double answer = firstNum / secondNum;
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                request.setAttribute("answer", answer);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
            }catch (NumberFormatException e){
                String answer = "Invalid";
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                request.setAttribute("answer", answer);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            
        }
    }

}
