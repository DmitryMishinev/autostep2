package ru.courses.geometry;
import java.util.Arrays;

public class Points {
    Property[] props;

    public Points(Property[] props) {
        this.props = props;
    }
    public String toString() {
        return Arrays.toString(props);
    }
}
