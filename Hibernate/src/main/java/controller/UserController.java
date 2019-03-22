package controller;

import configuration.HibernateConfiguration;
import model.Role1;
import model.RoleEnum;
import model.User;
import model.User1;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.time.LocalDate;

public class UserController {
    public void addUser(String email, String password, RoleEnum role, boolean enable, LocalDate date_added, String secret) {
    // otwieramy sesje - transakcje
        Session session = HibernateConfiguration.getSessionFactory().openSession();
        // Rozpoczecie transacji
        Transaction transaction = session.beginTransaction();
        // wykonanie polecenia DB SQL
        User user = new User (email,password,role,enable,date_added, secret);
        // INSERT INTO user VALUES (default, email, password, role, enable, date_added);
        session.save(user);
        // zatwierdzenie transakcji
        transaction.commit();
        // zamkniecie polaczenia z sesja
        session.close();
    }

    public Role1 getRoleById(int id) {
        Session session = HibernateConfiguration.getSessionFactory().openSession()
                Transaction transaction = session.beginTransaction()
                        // utworzenie obiektu uzytkownika

    }
    public void addUser1(String email, String password) {
        Session session = HibernateConfiguration.getSessionFactory().openSession()
                Transaction transaction = session.beginTransaction();
        // utworzenei obiektu uzytkownika
        User1 user1 = new User1(email, password);
        // przypisanie aktywnosci
        user1.setEnable(true);
        //
        transaction.commit();
        session.close();
    }
}
