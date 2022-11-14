package telephoneDirectory;

import utility.Utility;

import java.util.Objects;

public class TelephoneDirectory {
    private String name;
    private String number;

    public TelephoneDirectory(String name, String number) {
        this.name = Utility.checkNull(name,"default");
        this.number = Utility.checkNull(number,"default");
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = Utility.checkNull(name,"default");
    }

    public void setNumber(String number) {
        this.number = Utility.checkNull(number,"default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneDirectory that = (TelephoneDirectory) o;
        return Objects.equals(name, that.name) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "TelephoneDirectory{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
