public class Main {
    public static void main(String[] args) {
        Director director = new Director("Урядов В.Д.", "10.12.2001", 100.0);
        director.displayFio();
        director.displayDate();
        director.displaySalary();
        HeadOfDepartment boss = new HeadOfDepartment("Белов А.М.", "25.09.1976", 40.0);
        boss.displayFio();
        boss.displayDate();
        boss.displaySalary();
        Employee employee = new Employee("Фролова О.Д.", "25.09.1994", 30.5);
        employee.displayFio();
        employee.displayDate();
        employee.displaySalary();
    }
}