package Ch4;

import java.util.Objects;

public class LabeledPoint extends Point {
    private String label;

    LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + "[label=" + label + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        LabeledPoint other = (LabeledPoint)obj;
        return (Objects.equals(this.label, other.label));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }
}
