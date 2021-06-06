package controller;

import hibernate.Customer;
import hibernate.NewHibernateUtil;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Upload extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            Customer c = new Customer();

            DiskFileItemFactory dfif = new DiskFileItemFactory();
            ServletFileUpload sfu = new ServletFileUpload(dfif);
            List<FileItem> fil = sfu.parseRequest(request);
            System.out.println("ok");

            long millis = System.currentTimeMillis();
            for (FileItem i : fil) {
                 if (i.isFormField()) {
//                System.out.println("njnjn");
//                c.setRating(0.0);
//                switch (i.getFieldName()) {
//                    case "username":
//                        System.out.println(i.getString());
//                        c.setEmail(i.getString());
//                        break;
//                    case "fname":
//                        c.setFname(i.getString());
//                        break;
//                    case "lname":
//                        c.setLname(i.getString());
//                        break;
//                    case "mobile":
//                        c.setMobile(Integer.parseInt(i.getString()));
//                        break;
//                    case "password":
//                        c.setPassword(i.getString());
//                        break;
//                    default:
//                        break;
//                }
                 }else {
                String appPath = getServletContext().getRealPath("");
                String filePath = appPath + "//cus_pic//" + millis + ".png";
                File file = new File(filePath);
                String path = millis + ".png";
                i.write(file);
                System.out.println(filePath);
                c.setCusImg(path);
                response.getWriter().write("cus_pic/" + millis + ".png");
                  }
            }
            session.save(c);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
