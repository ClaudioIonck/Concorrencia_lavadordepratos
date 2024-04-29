import java.util.Objects;

public class Prato {
    private int id;

    public Prato(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Prato other = (Prato) obj;
        return id == other.id;
    }

    @Override
    public String toString() {
        return "Prato " + id;
    }
}