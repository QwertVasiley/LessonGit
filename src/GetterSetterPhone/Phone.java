package GetterSetterPhone;

public class Phone {
    private long number;
    private String name;
    private String model;

    public Phone(long number, String name, String model) {
        this.number = number;
        this.name = name;
        this.model = model;
    }

    public long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
