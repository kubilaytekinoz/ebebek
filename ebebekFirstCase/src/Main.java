public class Main {
    public static void main(String[] args) {

        // emp1 = new Employee("Kubilay Tekinöz", 1000.00, 5, 1994);
        Employee emp2 = new Employee("Okan Demirci", 2000.00, 45, 1985);
        //Employee emp3 = new Employee("Zeynep Yağmur", 3000.00, 60, 2002);


        Employee[] emps = {emp2};

        for (Employee employees : emps) {
            System.out.println("-------------------------------");
            System.out.println(employees.toString());

        }


    }
}