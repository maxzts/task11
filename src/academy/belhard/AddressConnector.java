package academy.belhard;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressConnector {
    private static final String SELECT_ALL = "SELECT * FROM addresses";
    private static final String ADD = "INSERT INTO addresses (id, city, street, house_number, house_part, apartment_number) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String DELETE = "DELETE FROM addresses where id = ?";
    private static final String UPDATE = "UPDATE addresses SET city = ?, street = ?, house_number = ?, house_part = ?, apartment_number = ? WHERE id = ?";


    public static void add(Address address) {
        Connection connection = DbConnectionProvider.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {
            statement.setInt(1, address.getId());
            statement.setString(2, address.getCity());
            statement.setString(3, address.getStreet());
            statement.setInt(4, address.getHouseNumber());
            statement.setInt(5, address.getHousePart());
            statement.setInt(6, address.getApartmentNumber());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Address> readAll() {
        List<Address> res = new ArrayList<>();

        Connection connection = DbConnectionProvider.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(SELECT_ALL)) {
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                Address address = AddressUtil.toObject(result);
                res.add(address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void delete(int id) {

        Connection connection = DbConnectionProvider.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(DELETE)) {
            connection.createStatement();

            int i = id;
            statement.executeUpdate("DELETE FROM addresses where id = " + i);

        } catch (Exception ex) {
            System.out.println();
        }
    }

    public static void update(Address address, int id) {

        Connection connection = DbConnectionProvider.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(UPDATE)) {
            connection.createStatement();

            statement.setString(1, address.getCity());
            statement.setString(2, address.getStreet());
            statement.setInt(3, address.getHouseNumber());
            statement.setInt(4, address.getHousePart());
            statement.setInt(5, address.getApartmentNumber());
            statement.setInt(6, id);

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
