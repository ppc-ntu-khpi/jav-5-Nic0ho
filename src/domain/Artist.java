package domain;

/**
 * Клас {@code Artist} (художник). Розширює клас {@link Employee}, додаючи перелік навичок.
 * Є базовим класом для більш конкретних посад:
 * {@link Editor}, {@link GraphicIllustrator}, {@link TechnicalWriter}.
 */
public class Artist extends Employee {

    /**
     * Створює новий об'єкт {@code Artist} з повним набором даних та переліком навичок.
     *
     * @param skiils масив назв навичок співробітника
     * @param name ім'я співробітника
     * @param jobTitle посада співробітника
     * @param level рівень кваліфікації
     * @param dept назва відділу
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює новий об'єкт {@code Artist} лише з переліком навичок.
     *
     * @param skiils масив назв навичок співробітника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Створює новий об'єкт {@code Artist} зі стандартними значеннями.
     * Навички ініціалізуються порожнім масивом на 10 елементів.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає текстове представлення художника, що включає
     * дані базового класу {@link Employee} та перелік навичок.
     *
     * @return рядок з інформацією про співробітника та його навички
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /** Масив навичок співробітника. */
    private String[] skiils;

    /**
     * Повертає перелік навичок співробітника у вигляді одного рядка.
     * Дані подаються як навички, перелічені через кому.
     *
     * @return рядок з переліком навичок
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює новий перелік навичок співробітника.
     * 
     * @param skills новий масив навичок
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Повертає масив навичок співробітника.
     * 
     * @return масив навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}