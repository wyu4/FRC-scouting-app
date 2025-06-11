import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        boolean untillexit = true;
        Scanner console = new Scanner(System.in);
        team[] scoutrobot = null;
        int i = 0;

        while (untillexit){
        int inputteamnum = console.nextInt();
        String alliance = console.nextLine();
        scoutrobot [i] = new team (inputteamnum,alliance);

        }


    }
}