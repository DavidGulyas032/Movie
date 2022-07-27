import java.util.Random;
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

    /** generates randomly seats that are taken**/
    public void randomSeatGenerator() {
        Random rand = new Random();
        int rowNumber = rand.nextInt(1,6);
        int columnNumber = rand.nextInt(1,12);
        for (int i = 0;i <= rowNumber-1;i++){
            for(int j = 0; j <= columnNumber-1;j++) {
                seats[i][j] = 1;
            }
        }
    }

    public Boolean seatChecker(int rowNumber,int columnNumber) {
        return seats[rowNumber][columnNumber] != 1;
    }
    public void mainWindow() {
        randomSeatGenerator();
        Scanner sc = new Scanner(System.in);
        int option = 0;

        System.out.println("Welcome to our cinema!");
        System.out.println("I see you are watching the movie called: " + this.movieName+ " It is a great choice!");
        System.out.println("You can choose from two options:");
        System.out.println("[1] Choose your seat to watch the movie ");
        System.out.println("[2] Exit ");
        while(option !=2) {
            int option2 = sc.nextInt();
            switch (option2) {
                case 1:
                    System.out.println("The only thing left is to choose your seat!");
                    System.out.println("In witch row you want to sit? There are 6 rows here, please choose on from 1-6 : ");

                    int rowNumber = sc.nextInt();
                    System.out.println("One row contains 12 seats, please choose one from 1-12: ");
                    int columnNumber = sc.nextInt();
                    boolean flag = seatChecker(rowNumber,columnNumber);
                    if (flag) {
                        System.out.println("The seat is free! Enjoy the movie!");
                        System.out.println("To exit the menu press [2]!");
                    }
                    else {
                        System.out.println("The seat is taken! Please choose another one by clicking [1] again!");
                    }
                    break;
                case 2:
                    System.out.println("Thank you for choosing us! Have a nice day!");
                    option=2;
                    break;


            }
        }
        }

    }


