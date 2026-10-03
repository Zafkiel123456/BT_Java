package Bai1_4;

public class TestMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Huy", "Le", 2400, "Huy Le");
        System.out.println(e1);
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id la: " + e1.getId());
        System.out.println("firstname la: " + e1.getFirstname());
        System.out.println("lastname la: " + e1.getLastname());
        System.out.println("salary la: " + e1.getSalary());
        System.out.println("NameDayDu la: " + e1.getName());
        System.out.println("AnnualSalary la: " + e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
//
        //
        //
        //

    }



}
