import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("One of my first programs! A Contact Manager created alongside the Udacity Java course!\n");



        //new object of ContactManager class:
        ContactManager myContactManager = new ContactManager();

        //Creating and adding a few contacts to myContactManager:
        Contact sadza = new Contact("Sadza", "sadzagej@gmail.com", "123456789");
        myContactManager.addContact(sadza);
        Contact weronika = new Contact("Weronika", "weronika@gmail.com", "456789132");
        myContactManager.addContact(weronika);
        Contact johny = new Contact("Johny", "janek@gmail.com", "789456321");
        myContactManager.addContact(johny);
        Contact oskar = new Contact("Oskar", "oskar@gmail.com", "4561239878");
        myContactManager.addContact(oskar);
        Contact ernest = new Contact("Ernest", "Erni@gmail.com", "453612789");
        myContactManager.addContact(ernest);

        // 1. Create a Scanner using the InputStream available.
        Scanner scanner = new Scanner( System.in );

        // 2. Don't forget to prompt the user
        System.out.println( "Enter a contact name to get contact info: " );

        // 3. Use the Scanner to read a line of text from the user.
        String input = scanner.nextLine();

        // 4. Now, you can do anything with the input string that you need to.
        // Like, output it to the user.
        System.out.println( "input = " + input );


        Contact searchedContact = myContactManager.searchContact(input);


        if(searchedContact == null){
            System.out.println("There is no such contact :(");
        }
        else {
            System.out.println("Dane kontaktu " + searchedContact.returnName() + ":");
            System.out.println(searchedContact.returnEmail());
            System.out.println(searchedContact.returnPhoneNumber());
        }


    }
}