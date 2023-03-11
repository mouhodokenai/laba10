public class Director extends Person{
    public Director(String fio, String date, Double salary){
        this.fio = fio;
        this.date = date;
        this.salary = salary;
    }

    public void displayDate() {
        System.out.println("Дата рождения директора: " + date);
    }

    public void displaySalary() {
        System.out.println("Зарплата директора: " + salary + " тыс руб");
    }
    public void displayFio() {
        System.out.println("Имя директора: " + fio);
    }

}
