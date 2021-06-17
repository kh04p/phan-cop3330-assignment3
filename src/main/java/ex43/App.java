package ex43;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Site name: ");
        String title = in.nextLine().trim();
        System.out.print("Author: ");
        String author = in.nextLine().trim();

        //String filePath = String.format("C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex43\\%s\\" +
        //        "index.html", title);
        String filePath = "index.html";
        String dirPath1 = String.format("C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex43\\%s\\" +
                "js\\", title);
        String dirPath2 = String.format("C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex43\\%s\\" +
                "css\\", title);

        /*System.out.print("Do you want to create a folder for JavaScript?");
        String choice1 = in.nextLine().trim().toLowerCase();
        if (choice1.equals("y")) {
            System.out.print("Do you want to create a folder for CSS? ");
            String choice2 = in.nextLine().trim().toLowerCase();
            if (choice2.equals("y")) {
                website.generateDir(dirPath1);
                website.generateDir(dirPath2);
                website.generateHTML(filePath, author, title);
            }
            else {
                website.generateDir(dirPath1);
                website.generateHTML(filePath, author, title);
            }
        }
        else {
            System.out.print("Do you want to create a folder for CSS? ");
            String choice2 = in.nextLine().trim().toLowerCase();
            if (choice2.equals("y")) {
                website.generateDir(dirPath2);
                website.generateHTML(filePath, author, title);
            }
            else {
                website.generateHTML(filePath, author, title);
            }
        }*/

        website.generateHTML(filePath, author, title);
    }
}
