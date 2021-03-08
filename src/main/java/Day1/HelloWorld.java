package Day1;

import io.cucumber.messages.internal.com.google.protobuf.StringValue;
import jdk.dynalink.beans.StaticClass;

public class HelloWorld {

    public static String wiadomosc = "Hello";
    public static int ile_razy_wyświetlic = 6;

    public static void wypisz(){
        for (int i = 0; i < ile_razy_wyświetlic; i++) {
            System.out.println();
        }
        int counter = 0;

        while(counter<ile_razy_wyświetlic){
            System.out.println(wiadomosc);
            counter++;
        }
        do{

        }while(counter<ile_razy_wyświetlic);
    }
    public static void main(String[] args) {
        wypisz();
        String message = "Hello World";

        System.out.println(message.equals("Hello World"));

        String  number = "123.234.345";
        System.out.println(123==Integer.parseInt(number.replace(".","")));

        System.out.println( "Hello World" );
    }
}
