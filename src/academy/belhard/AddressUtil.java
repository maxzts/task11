package academy.belhard;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressUtil {

    public static Address toObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String city = resultSet.getString("city");
        String street = resultSet.getString("street");
        int houseNumber = resultSet.getInt("house_number");
        int housePart = resultSet.getInt("house_part");
        int apartmentNumber = resultSet.getInt("apartment_number");

        return new Address(id, city, street, houseNumber, housePart, apartmentNumber);
    }
}
