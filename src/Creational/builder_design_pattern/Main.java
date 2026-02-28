package Creational.builder_design_pattern;

public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setUserId("123")
                .setUserName("titu")
                .setEmailId("titu@gmail.com")
                .build();

        System.out.println(user);

        User user1 = User.UserBuilder.builder()
                .setEmailId("titu123")
                .setUserName("titu123")
                //mising fields
                .build();
        System.out.println(user1);
    }
}
