package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Safe newSafe = new Safe();

        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Aseta PIN-koodi");
            System.out.println("2) Lisää tietoja kansioon");
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma"); 

            if(sc.hasNext()) {
                int i = 0;
                String stringinput = sc.nextLine();
                i = Integer.parseInt(stringinput);
                switch(i) {
                    case 1:
                        System.out.println("Anna uusi PIN-koodi: ");
                        if(sc.hasNext()) {
                        String pinCode = sc.nextLine();
                        newSafe.changePin(pinCode);
                        }
                        break;
                    case 2:
                        System.out.println("Anna kansioon lisättävä tieto: ");
                        if(sc.hasNext()) {
                            String string = sc.nextLine();
                        newSafe.addString(string);
                        }
                        break;
                    case 3:
                        System.out.println("Anna PIN-koodi: ");
                        if(sc.hasNext()) {
                            String pin = sc.nextLine();
                            ArrayList<String> safeFolder = newSafe.getList(pin);
                            if(safeFolder == null) {
                                break;
                            } else {

                            for(String string : safeFolder) {
                                System.out.println(string);
                            }
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }     
        }
    }
    }
}
