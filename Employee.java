public class Employee extends Person {
    public Employee(String fio, String date, Double salary){
        this.fio = fio;
        this.date = date;
        this.salary = salary;
    }

    public void displayDate() {
        System.out.println("Дата рождения работника: " + date);
    }

    public void displaySalary() {
        System.out.println("Зарплата работника: " + salary + " тыс руб");
    }
    public void displayFio() {
        System.out.println("Имя работника: " + fio);
    }


}
