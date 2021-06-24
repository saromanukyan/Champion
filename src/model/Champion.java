package model;

import java.io.Serializable;

public class Champion implements Serializable {
    private static final long serialVersionUID = 1234567L;
    private String name;
    private int year;
    private static Champion instance;

    private Champion() {
    }

    public static Champion getInstance() {
        if (instance == null) {
            synchronized (Champion.class) {
                if (instance == null) {
                    instance = new Champion();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private Object readResolve() {
        return instance;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
