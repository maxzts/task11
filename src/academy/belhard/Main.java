package academy.belhard;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address(1,"Minsk","Matusevicha",54,2,59);
        Address address2 = new Address(2,"Osipovichi","Sovetskaya",10,4,40);
        Address address3 = new Address(3,"Pinsk","Pushkina",88,1,13);
        Address address4 = new Address(4,"Zaslavl","Odoevskogo",16,5,99);
        Address address5 = new Address(5,"Grodno","Belskogo",40,3,25);

        AddressConnector.add(address1);
        AddressConnector.add(address2);
        AddressConnector.add(address3);
        AddressConnector.add(address4);
        AddressConnector.add(address5);

        System.out.println(AddressConnector.readAll());

        AddressConnector.update(Address.createFoSaving("NewYork", "Lomonosova", 11, 2,101), 3);
        AddressConnector.update(Address.createFoSaving("Moskov", "Kenedy",55, 4, 98),4);

        System.out.println(AddressConnector.readAll());

        AddressConnector.delete(1);
        AddressConnector.delete(5);

        System.out.println(AddressConnector.readAll());

    }
}
