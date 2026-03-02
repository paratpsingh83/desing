package Behavioral.itrator;

public class Main {
    public static void main(String[] args) {


        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("titu", "1"));
        userManagement.addUser(new User("deepak", "3"));
        userManagement.addUser(new User("rahu", "88"));
        userManagement.addUser(new User("ankit", "11"));

        MyIterator myIterator = userManagement.getIterator();

        while (myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }

    }
}
