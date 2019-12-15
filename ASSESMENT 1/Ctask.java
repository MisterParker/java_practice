import java.util.Scanner;
class Ctask{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the reaction");
        String s = sc.nextLine();
        String eq[] = s.split("[\\->]+");
        String eqr[] = eq[0].split("[\\+]+");
        String eqp[] = eq[1].split("[\\+]+");

        for(String k :eqr){
            if(Character.isDigit(k.charAt(0)))
                System.out.println(k.charAt(0)+" moles of "+k.substring(1));
            else
                System.out.println(1+" moles of "+k.substring(1));
        }

        for(String k :eqp){
            if(Character.isDigit(k.charAt(0)))
                System.out.println(k.charAt(0)+" moles of "+k.substring(1));
            else
                System.out.println(1+" moles of "+k.substring(1));
        }
    }
}