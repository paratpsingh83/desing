package Behavioral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        Subject channel = new YoutubeChannel();

        Observer aman = new Subscriber("Aman");
        Observer Raman = new Subscriber("Raman");

        channel.subscribe(aman);
        channel.subscribe(Raman);

        channel.newVideoUploaded("Learn Design Pattern");
        channel.newVideoUploaded("New Angular Course");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Press 1 to upload Video");
            System.out.println("Press 2 create new Subscriber");
            System.out.println("Press 3 to exit");
            int c = Integer.parseInt(br.readLine());
            if (c == 1) {
                //new Video upload
                System.out.println("Enter video title");
                String videoTitle = br.readLine();
                channel.newVideoUploaded(videoTitle);
            } else if (c == 2) {
                //create ne subscriber
                System.out.println("Enter name of subscriber ");
                String subsName = br.readLine();
                Observer subscriber3 = new Subscriber(subsName);
                channel.subscribe(subscriber3);
            } else if (c == 3) {
                //exit
                System.out.println("Thank you for using");
                break;
            } else {
                //exit wrong input
                System.out.println("Wrong input");
            }
        }
    }
}
