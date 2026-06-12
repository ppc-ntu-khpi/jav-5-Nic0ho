package domain;

/**
 * Клас {@code Manager} (менеджер). Розширює клас {@link Employee},
 * додаючи список співробітників, якими керує менеджер.
 */
public class Manager extends Employee {

    /**
     * Створює новий об'єкт {@code Manager} з повним набором даних
     * та списком підпорядкованих співробітників.
     *
     * @param employees масив співробітників, якими керує менеджер
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень кваліфікації
     * @param dept назва відділу
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає текстове представлення менеджера, що включає
     * дані базового класу {@link Employee} та перелік підпорядкованих співробітників.
     *
     * @return рядок з інформацією про менеджера та його команду
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Створює новий об'єкт {@code Manager} лише зі списком підпорядкованих співробітників.
     *
     * @param employees масив співробітників, якими керує менеджер
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /** Створює новий об'єкт {@code Manager} зі стандартними значеннями (масив на 10 елементів). */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /** Масив співробітників, якими керує менеджер. */
    private Employee[] employees;

    /**
     * Повертає імена підпорядкованих співробітників.
     * @return імена, перелічені через кому
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює новий список підпорядкованих співробітників.
     *
     * @param employees новий масив співробітників
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив підпорядкованих співробітників.
     * @return масив співробітників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}