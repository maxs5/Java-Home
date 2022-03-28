public class Main {
    public static void main(String[] args) {
        int sum = 150;
        int pay = 1300;
        int bonus;
        if (pay > 1000){
            bonus = pay/100;
            System.out.println("У вас на счету "+(sum+pay+bonus)+ "рублей");
        } else {
            System.out.println("У вас на счету "+ (sum+pay));
        }
    }
}
