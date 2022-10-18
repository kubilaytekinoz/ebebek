public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }


    public double tax(){
        double tax = 0;
        if (this.salary>999){

           return this.salary * 0.03;
        }
        else {
            return tax;
        }

    }
    public double bonus(){
        double bonus = 0;
        if (this.workHours>40){
            return (30*(this.workHours-40));
        }
        else {
            return bonus;
        }
    }

    public double raiseSalary() {
        double raiseSalary = 0;
        if ((2021 - this.getHireYear()) < 10) {
            raiseSalary = this.getSalary() * 0.05;
        } else if ((2021 - this.getHireYear()) > 9 && (2021 - this.getHireYear()) < 20) {
            raiseSalary = this.getSalary() * 0.10;
        } else if ((2021 - this.getHireYear()) > 19) {
            raiseSalary = this.getSalary() * 0.15;
        }
        return raiseSalary;
    }



    @Override
    public String toString(){
            double totalSalary = this.getSalary() + this.bonus() - this.tax() + raiseSalary() ;
            return "Adı : "   + this.getName() +
                    "\nMaaşı : " + this.getSalary() +
                    "\nÇalışma Saati : " +  this.getWorkHours() +
                    "\nBaşlangıç Yılı : " + this.getHireYear() +
                    "\nVergi : " + this.tax() +
                    "\nBonus : " + this.bonus() +
                    "\nMaaş Artışı : " + this.raiseSalary()+
                    "\nVergi ve Bonuslar ile birlikte maaş : " + (this.getSalary() - this.tax() + this.bonus()) +
                    "\nToplam Maaşı : "  + totalSalary ;
    }

}
