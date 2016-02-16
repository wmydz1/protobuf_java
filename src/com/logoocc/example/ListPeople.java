package com.logoocc.example;

/**
 * Created by samchen on 2/16/16.
 */
import com.logoocc.example.AddressBookProtos.Person;
import com.logoocc.example.AddressBookProtos.AddressBook;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

class ListPeople {
    // Iterates though all people in the AddressBook and prints info about them.
    static void Print(AddressBook addressBook) {
        for (Person person: addressBook.getPersonList()) {
            System.out.println("Person ID: " + person.getId());
            System.out.println("  Name: " + person.getName());
            if (person.hasEmail()) {
                System.out.println("  E-mail address: " + person.getEmail());
            }

            for (Person.PhoneNumber phoneNumber : person.getPhoneList()) {
                switch (phoneNumber.getType()) {
                    case MOBILE:
                        System.out.print("  Mobile phone #: ");
                        break;
                    case HOME:
                        System.out.print("  Home phone #: ");
                        break;
                    case WORK:
                        System.out.print("  Work phone #: ");
                        break;
                }
                System.out.println(phoneNumber.getNumber());
            }
        }
    }

    // Main function:  Reads the entire address book from a file and prints all
    //   the information inside.
    public static void main(String[] args) throws Exception {
//        if (args.length != 1) {
//            System.err.println("Usage:  ListPeople ADDRESS_BOOK_FILE");
//            System.exit(-1);
//        }
//        String data ="/Users/samchen/Documents/Website/protobuf_java/src/data.txt";

        String relativelyPath=System.getProperty("user.dir");
        System.out.println(relativelyPath);
        String data =relativelyPath+"/src/data.txt";


        // Read the existing address book.
        AddressBook addressBook =
                AddressBook.parseFrom(new FileInputStream(data));

        Print(addressBook);
    }
}
