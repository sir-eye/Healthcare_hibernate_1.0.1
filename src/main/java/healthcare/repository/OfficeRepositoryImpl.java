package healthcare.repository;

import healthcare.model.Office;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class OfficeRepositoryImpl {

    private final SessionFactory sessionFactory;

    public OfficeRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // Create Office
    public void createOffice(Office office) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(office);
            transaction.commit();
        }
    }

    // Get Office by ID
    public Office getOfficeById(int officeId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Office.class, officeId);
        }
    }

    // Update Office
    public void updateOffice(Office office) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(office);
            transaction.commit();
        }
    }

    // Delete Office by ID
    public void deleteOffice(int officeId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Office office = session.get(Office.class, officeId);
            if (office != null) {
                session.remove(office);
            }
            transaction.commit();
        }
    }

    // Get All Offices
    public List<Office> getAllOffices() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Office", Office.class).list();
        }
    }
}