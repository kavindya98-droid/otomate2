package controller;

import hibernate.Customer;
import hibernate.NewHibernateUtil;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SignIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println(username+password);
            
            SessionFactory factory= NewHibernateUtil.getSessionFactory();
            Session session= factory.openSession();
            Transaction transaction = session.beginTransaction();
            
            Criteria criteria=session.createCriteria(Customer.class);
            criteria.add(Restrictions.eq("email", username));
            criteria.add(Restrictions.eq("password", password));
           // System.out.println(criteria.list());
            if (criteria.list().isEmpty()) {
                System.out.println("okkk");
                response.getWriter().write("0");
            } else {
                System.out.println("kkkk");
                Customer customer = (Customer)criteria.uniqueResult();
                
                
                request.getSession().setAttribute("customer", customer);
                request.getRequestDispatcher("profile.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
