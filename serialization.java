import java.io.*;

// Define the Customer class to be serialized
class Customer implements Serializable {
    private static final long serialVersionUID = 1L; // Serialization version UID
    private int id;
    private String name;
    private String contactNo;
    private String address;

    // Constructor
    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }
}

// Main class
public class SerializationExample {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(101, "John Doe", "1234567890", "123 Main St");

        // Serialize the Customer object to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(customer);
            objectOut.close();
            fileOut.close();
            System.out.println("Customer object has been serialized and saved to JavaObject.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the Customer object from the file (optional)
        try {
            FileInputStream fileIn = new FileInputStream("JavaObject.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Customer deserializedCustomer = (Customer) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Customer object has been deserialized from JavaObject.txt:");
            System.out.println("ID: " + deserializedCustomer.getId());
            System.out.println("Name: " + deserializedCustomer.getName());
            System.out.println("Contact No: " + deserializedCustomer.getContactNo());
            System.out.println("Address: " + deserializedCustomer.getAddress());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
