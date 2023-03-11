public class HeadOfDepartment extends Person {
    public HeadOfDepartment(String fio, String date, Double salary){
        this.fio = fio;
        this.date = date;
        this.salary = salary;
    }
    public void displayDate() {
        System.out.println("Дата рождения начальника: " + date);
    }

    public void displaySalary() {
        System.out.println("Зарплата начальника: " + salary + " тыс руб");
    }
    public void displayFio() {
        System.out.println("Имя начальника: " + fio);
    }


}
