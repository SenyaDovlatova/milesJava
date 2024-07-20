//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double amount = 12_499.99;
        int rublesPerMile = 20;

        var miles = (int) amount / rublesPerMile;

        System.out.println(miles);
    }
}