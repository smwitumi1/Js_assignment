public class User{
    String firstName="Sylvia";
    String lastName="Mwitumi";
    int age = 0;
    boolean hasMoney = true;
    private static void presentName(){

    }
    public static void main(String[] args){
        double amountPaid = 23.05;
        double amountCredited  = 12;
        double result = amountPaid/amountCredited;

        int amountConverted = (int) amountPaid;


        System.out.print("New Value" + amountConverted);
        System.out.println("Result:" + result);
    }

        private static void presentName(String he){

        }

        public static double addTwoNumber(double numOne, double numTwo){
                return numOne + numTwo; 
        }
}