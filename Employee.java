public abstract class Employee {
    private String role;
    private int id;
    private String email;
    private int phoneNumber;

    public Employee(String role, int id, String email, int phoneNumber) {
        this.role = role;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public class Waiter{
        Waiter(){
            //create a scene
        }
    }
    public class Cook{
        Cook(){
            //create a scene
        }
        public static void ready(){
            //make a food queue for ready
        }
    }
    public class Manager{
        Manager(){
            //create a scene
        }
        public static void signup(){
            //from ui button write line in json file
        }

    }
    public class Busboy{
        public Busboy() {
        }

    }

}
