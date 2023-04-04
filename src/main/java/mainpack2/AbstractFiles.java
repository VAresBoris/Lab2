package mainpack2;

public abstract class AbstractFiles {
    private String name;
    private int size;
    private String form;

    public AbstractFiles(String name, int size, String form) {
        this.name = name;
        this.size = size;
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Имя не должно быть пустой ссылкой");
        this.name = name;
    }

    public void setSize(int size) {
        if (size <= 0)
            throw new IllegalArgumentException("Размер не должен быть меньше или равен нулю");
        this.size = size;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        if (form == null)
            throw new IllegalArgumentException("формат не должен быть пустой ссылкой");
        this.form = form;
    }

    public void print(){
        System.out.printf("%s | %s%n", getName(), getSize() + getDetails());
    }

    protected abstract String getDetails();
}
