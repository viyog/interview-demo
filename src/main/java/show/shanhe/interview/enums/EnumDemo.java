package show.shanhe.interview.enums;

import org.junit.Test;

public class EnumDemo {

    @Test
    public void printFourEmperor() {
        FourEmperor[] values = FourEmperor.values();
        for (FourEmperor value : values) {
            System.out.println(value);
        }
    }

    @Test
    public void printCodeAndDescription() {
        FourEmperor[] fourEmperors = FourEmperor.values();
        for (FourEmperor fourEmperor : fourEmperors) {
            System.out.println(fourEmperor.getCode() + ": " + fourEmperor.getDescription());
        }
    }
}
