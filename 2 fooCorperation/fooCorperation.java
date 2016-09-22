public class fooCorperation{
        public static void totalPay(double basePay, int hoursWorked ){
                if (hoursWorked>60){
                        System.out.println("Error");
                } else if (basePay<8.0){
                        System.out.println("Error");
                } else {
                        int overtime=0;
                            if (hoursWorked>40){
                                overtime = hoursWorked - 40;
                                hoursWorked=40;
                            }
                        double total= basePay*hoursWorked + basePay*1.5*overtime ;
                        System.out.println("The total salary is "+ total+ "$");
                }
        }
                

        public static void main(String[] args) {
                totalPay(7.5,35);
                totalPay(8.2,47);
                totalPay(10.0,73);
                }


} 
