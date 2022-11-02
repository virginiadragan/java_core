package poo_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilesIO {

    public void task1 () throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("task1");
        System.out.println("Input your name:");
        String name = br.readLine();
        System.out.println("Input your first name:");
        String firstName = br.readLine();
        System.out.println("Your name is: " + name);
        System.out.println("Your first name is: " + firstName);
    }

    public void task2 () {
        System.out.println("task2");
    }
}
