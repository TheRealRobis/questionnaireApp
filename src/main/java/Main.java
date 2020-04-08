public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.startMenu();
//        SessionFactory sessionFactory = new Configuration()
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sessionFactory.openSession();
//
//        Transaction tx = null;
//        try {
//            tx = session.beginTransaction();
//
//            Answer exam= (Answer) session.get(Answer.class,2);
//            System.out.println(exam.toString());
//            tx.commit();
//
//        } catch (Exception e){
//            if(tx != null){
//                tx.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }

    }
}
