package net.javaguides.hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import net.javaguides.hibernate.model.Student;
import net.javaguides.hibernate.util.HibernateUtil;

public class StudentDao implements IStudentDao {

    // save Student
    // get All Students
    // get Student By Id
    // Update Student
    // Delete Student

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
     */
  
    public void saveStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(student);

            // commit the transaction
            transaction.commit();
            System.out.println("data saved......");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#updateStudent(net.javaguides.hibernate.model.Student)
     */
    
    public void updateStudent(Student st) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();
          
            // save student object
            st=session.get(Student.class, 1);
            st.setFirstName("mohan");
            session.save(st);

            // commit the transaction
            transaction.commit();
            System.out.println("data updated......");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getStudentById(long)
     */
    
    public void getStudentById(int id) {
        //Transaction transaction = null;
       
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            //transaction = session.beginTransaction();

            // get student object
           Student st = session.get(Student.class, id);
            System.out.println(st);
            //student = session.load(Student.class, id);
            // commit the transaction
            //transaction.commit();
        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
        	e.printStackTrace();
            }
        }
        
    

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List < Student > getAllStudents() {
        Transaction transaction = null;
        List < Student > students = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            students = session.createQuery("from Student").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return students;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
     */
    @Override
    public void deleteStudent(int id) {
        Transaction transaction = null;
        Student student = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            student = session.get(Student.class, id);
            // get student object
            session.delete(student);
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
            System.out.println("deleted.........");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}