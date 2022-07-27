import java.util.Scanner;

public class Movies {

    String movieName;
    int roomNumber;
    int time;
    int [][] seats = new int[6][12];

    Movies(String movName,int roomNum,int playTime) {
        movieName = movName;
        roomNumber = roomNum;
        time = playTime;
    }



    public void mainWindow() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our cinema!");
        System.out.println("I see you are watching the movie called: " + this.movieName+ " It is a great choice!");
        System.out.println("The only thing left is to choose your seat!");
        System.out.println("In witch row you want to sit? There are 6 rows here, please choose on from 1-6 : ");
        int rowNumber = sc.nextInt();
        System.out.println("One row contains 12 seats, please choose one from 1-12: ");
        int columnNumber = sc.nextInt();

    }
}
