package mainpack2;

public abstract class AbstractFiles {
    private String name;
    private int size;

    public AbstractFiles(String name, int size) {
        this.name = name;
        this.size = size;
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
}
