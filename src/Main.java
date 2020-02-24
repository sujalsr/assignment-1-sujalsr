import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ContactsLL obj = new ContactsLL();
        System.out.println("Welcome to Sujal's contact list app");
        int x = 0;
        while (x != 5) {
            System.out.println("**********************************");
            System.out.println("Press 1 to add a new contact");
            System.out.println("Press 2 to view all contacts");
            System.out.println("Press 3 to search contact");
            System.out.println("Press 4 to delete a contact");
            System.out.println("Press 5 to exit");
            System.out.println("**********************************");
            int  choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.addContact();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.search();
                    break;
                case 4:
                    obj.delete();
                    break;
                case 5:
                    x = 5;
                    System.out.println("Thank you for using the contacts app");
                    break;
                default:
                    System.out.println("Invalid Selection!! Please enter a valid choice.");
            }
        }
        sc.close();
    }
}

