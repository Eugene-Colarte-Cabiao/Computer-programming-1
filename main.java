public class Main {
    public static void main(String[] args) {

        String name = "Eugene Colarte Cabiao";
        int age = 22;
        double perHr = 169.69;

        System.out.println("Complete Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Per Hour : " + perHr);

        System.out.println("****************************************");

        double SSS, PAG_IBIG, PHIC, DAILY_EXPENSES;

        SSS = 110.19;
        PAG_IBIG = 149.75;
        PHIC = 209.69;
        DAILY_EXPENSES = 300.50;

        double deductions = SSS + PAG_IBIG + PHIC + DAILY_EXPENSES;

        int total_hr = 24;

        double total_salary = perHr * total_hr;

        double NIGHT_PREMIUM, DOUBLE_PAY;

        NIGHT_PREMIUM = 350.69;
        DOUBLE_PAY = 600.69;

        double Additional_Salary = NIGHT_PREMIUM + DOUBLE_PAY;

        double GROSS = total_salary + Additional_Salary;

        System.out.println("Total Hour Render : " + total_hr);
        System.out.println("Gross Salary : " + GROSS);
        System.out.println("Deductions : " + deductions);

        System.out.println("****************************************");

        double NET = GROSS - deductions;
        System.out.println("Net Salary : " + NET);
    }
}