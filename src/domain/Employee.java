package domain;

/**
 * Клас {@code Employee} (співробітник). Базовий клас, що зберігає
 * ім'я, посаду, рівень кваліфікації (1-3), відділ та випадковий ID.
 * Є базовим для всіх інших класів пакету {@code domain}.
 */
public class Employee {

    /**
     * Повертає текстове представлення співробітника.
     *
     * @return рядок з даними про співробітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /** Ім'я співробітника. */
    private String name;

    /** Посада співробітника. */
    private String jobTitle;

    /** Унікальний ID, генерується випадково. */
    private int ID;

    /** Рівень кваліфікації. */
    private int level;

    /** Назва відділу. */
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Створює новий об'єкт {@code Employee} з вказаними параметрами.
     * Якщо {@code level} не входить до діапазону 1-3, встановлюється 1.
     *
     * @param name ім'я співробітника
     * @param jobTitle посада співробітника
     * @param level рівень кваліфікації (1-3)
     * @param dept назва відділу
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /** Створює новий об'єкт {@code Employee} з порожніми полями та випадковим ID. */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює посаду співробітника.
     *
     * @param job нова посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду співробітника.
     * @return посада співробітника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я співробітника.
     * @return ім'я співробітника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень кваліфікації. Якщо значення не входить
     * до діапазону 1-3, встановлюється 1.
     *
     * @param level новий рівень
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень кваліфікації.
     * @return рівень кваліфікації
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає назву відділу.
     * @return назва відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює назву відділу.
     * @param dept новий відділ
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я співробітника, перевіряючи його формат
     * (ім'я + прізвище, без цифр). Якщо формат не відповідає,
     * встановлюється {@code "John Doe"}.
     *
     * @param name ім'я та прізвище співробітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}