public class Phone {

    static int number = 2310;
    static String model = "Nokia";
    static String weight = "130 gm";

    public static void main(String[] args) {

        System.out.println(number + " " + model + " " + weight);
        System.out.print("Звонит " + receiveCall("Ivan"));
        System.out.println(getNumber(" 0123456778"));
        receiveCall("Petr", "234567875");

    }

    public Phone(int number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static String receiveCall(String name) {
        return name;

    }

    public static String getNumber(String num) {
        return num;
    }

    public static void receiveCall (String name, String num) {
        System.out.println(name + " " + num);
    }

}
