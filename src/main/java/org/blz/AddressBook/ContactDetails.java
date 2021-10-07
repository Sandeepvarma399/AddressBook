package org.blz.AddressBook;

public class ContactDetails {
    public String firstname;
    public String lastname;
    public String address;
    public String city;
    public String state;
    public int zip;
    public long phonenumber;
    public String email;


    ContactDetails(String first,String last,String address,String city,String state,int zip,long phonenumber,String email)
    {
        this.firstname= first;
        this.lastname= last;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phonenumber=phonenumber;
        this.email=email;
    }

}

class Addressbookoptions
{

    int entries=0;
    ContactDetails[] ContactdetailsArray;

    Addressbookoptions()
    {
        ContactdetailsArray = new ContactDetails[5];
    }

    public void add(String first, String last, String address, String city, String state, int zip, long phonenumber, String email)
    {
        ContactdetailsArray[entries]=new ContactDetails(first,last,address,city,state,zip,phonenumber,email);
        entries++;
    }

    public void display(int items)
    {
        System.out.println("\n\nDisplaying  the contact details....");
        for(int i=0;i<items;i++)
        {
            int j=i+1;
            System.out.println("\n\nThe entry "+j+" is Contact detail of "+ContactdetailsArray[i].firstname);
            System.out.print("\nFirst name: "+ContactdetailsArray[i].firstname);
            System.out.print("\nLast name: "+ContactdetailsArray[i].lastname);
            System.out.print("\nAddress: "+ContactdetailsArray[i].address);
            System.out.print("\nCity: "+ContactdetailsArray[i].city);
            System.out.print("\nState: "+ContactdetailsArray[i].state);
            System.out.print("\nzip: "+ContactdetailsArray[i].zip);
            System.out.print("\nPhone number: "+ContactdetailsArray[i].phonenumber);
            System.out.print("\nEmailId: "+ContactdetailsArray[i].email);

        }
    }

}

