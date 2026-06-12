package domain;

/**
 * Клас {@code Editor} (редактор). Розширює клас {@link Artist},
 * додаючи інформацію про формат редагування ({@code true} - електронний , {@code false} - паперовий).
 */
public class Editor extends Artist {

    /**
     * Створює новий об'єкт {@code Editor} з повним набором даних та форматом редагування.
     *
     * @param electronicEditing {@code true} - електронний формат, {@code false} - паперовий
     * @param skiils масив назв навичок співробітника
     * @param name ім'я співробітника
     * @param jobTitle посада співробітника
     * @param level рівень кваліфікації
     * @param dept назва відділу
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює новий об'єкт {@code Editor} з переліком навичок та форматом редагування.
     *
     * @param electronicEditing формат редагування
     * @param skiils навички
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює новий об'єкт {@code Editor} з форматом редагування.
     *
     * @param electronicEditing формат редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /** Створює новий об'єкт {@code Editor} зі стандартними значеннями. */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає текстове представлення редактора як усіх його даних (з базового класу {@link Artist} та формат редагування).
     *
     * @return рядок з інформацією про редактора
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /** Формат редагування */
    private boolean electronicEditing;

    /**
     * Повертає формат редагування.
     * @return формат редагування
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює формат редагування.
     *
     * @param electronic формат редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}