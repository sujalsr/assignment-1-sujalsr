import java.util.ArrayList;
import java.util.Scanner;

class ContactsLL
{
    ArrayList<Person> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addContact()
    {


        Person obj = new Person();
        System.out.println("Enter first name : ");
        while (!sc.hasNext("[A-Za-z]+"))
        {
            System.out.println("Invalid entry, try again..");
            sc.next();
        }
        String n = sc.next();
        obj.setFname(n);
        System.out.println("Enter last name : ");
        while (!sc.hasNext("[A-Za-z]+"))
        {
            System.out.println("Invalid entry, try again..");
            sc.next();
        }
        String n2 = sc.next();
        obj.setLname(n2);
        System.out.println("How many numbers would you like to add ? : ");
        int add = sc.nextInt();
        int c = 0;
        while (add > 0) {
            System.out.println("enter a valid 10 digit mobile number : ");
            while (!sc.hasNext("[6789][0-9]{9}")) {
                System.out.println("Invalid Mobile number, it must start with 6, 7, 8 or 9 \n Enter Again");
                sc.next();
            }
            c++;
            String n3 = sc.next();
            if (c == 1) {
                obj.setPhone(n3);
            } else {
                obj.setPhone(obj.getPhone() + "\n" + n3);
            }

            add--;

            sc.nextLine();
            obj.setEmail(sc.nextLine());
            System.out.println("Enter your email : ");
            while (true)
            {
                String s = sc.nextLine();
                if (s.matches("^(.+)@(.+)$"))
                {
                    obj.setEmail(s);
                    break;
                }
                else
                {
                    System.out.println("Invalid email! , try again..");
                }
            }
            list.add(obj);
        }
    }

    public void display()
    {
        for (Person e : list)
        {
            System.out.println(e);
        }
    }

    public void search()
    {
        Person p;
        System.out.println("enter that you want to search");
        String attr = sc.nextLine();
        System.out.println("you want to search by which attribute");
        String s = sc.nextLine();
        for (Person per : list)
        {
            p = per;
            if (s.equalsIgnoreCase("fname"))
            {
                if (p.getFname().equalsIgnoreCase(attr))
                {
                    System.out.println("match found" + "\n");
                    System.out.println("**********************************");
                    System.out.println(p);
                }
            }
            else if (s.equalsIgnoreCase("lname"))
            {
                if (p.getLname().equalsIgnoreCase(attr))
                {
                    System.out.println("match found" + "\n");
                    System.out.println("**********************************");
                    System.out.println(p);
                }
            }
            else if (s.equalsIgnoreCase("phone"))
            {
                if (p.getPhone().contains(attr))
                {
                    System.out.println("match found" + "\n");
                    System.out.println("**********************************");
                    System.out.println(p);
                }
            }

            else if (s.equalsIgnoreCase("email"))
            {
                if (p.getEmail().equalsIgnoreCase(attr))
                {
                    System.out.println("match found" + "\n");
                    System.out.println("**********************************");
                    System.out.println(p);
                }
            }
            else
            {
                System.out.println("please enter valid attribute");
            }
        }
    }

    public void delete()
    {
        Person p;
        System.out.println("enter that you want to remove");
        String attr = sc.nextLine();
        System.out.println("you want to search by which attribute");
        String s = sc.nextLine();
        for (int i = 0; i < list.size(); i++)
        {
            p = list.get(i);
            if (s.equalsIgnoreCase("f_name"))
            {
                if (p.getFname().equalsIgnoreCase(attr))
                {
                    System.out.println("match found"+"\n");
                    System.out.println("**********************************");
                    list.remove(p);
                    System.out.println("the contact of " + p.getFname()+" has deleted" );
                }
            }
            else if (s.equalsIgnoreCase("s_name"))
            {
                if (p.getLname().equalsIgnoreCase(attr))
                {
                    System.out.println("match found"+"\n");
                    System.out.println("**********************************");
                    list.remove(p);
                    System.out.println("the contact of " + p.getFname()+" has deleted" );
                }
            }
            else if (s.equalsIgnoreCase("phone"))
            {
                if (p.getPhone().contains(attr))
                {
                    System.out.println("match found"+"\n");
                    System.out.println("**********************************");
                    list.remove(p);
                    System.out.println("the contact of " + p.getFname()+" has deleted" );
                }
            }
            else if (s.equalsIgnoreCase("email"))
            {
                if (p.getEmail().equalsIgnoreCase(attr))
                {
                    System.out.println("match found"+"\n");
                    System.out.println("**********************************");
                    list.remove(p);
                    System.out.println("the contact of " + p.getFname()+" has deleted" );
                }
            }
            else
            {
                System.out.println("please enter valid attribute");
            }
        }
    }
}
