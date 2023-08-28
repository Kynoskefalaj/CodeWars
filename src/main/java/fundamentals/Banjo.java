package fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.toLowerCase().charAt(0) == 'r') {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
        assertEquals("Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
        assertEquals( "rolf plays banjo", Banjo.areYouPlayingBanjo("rolf"));
        assertEquals("bravo does not play banjo", Banjo.areYouPlayingBanjo("bravo"));
    }
}
