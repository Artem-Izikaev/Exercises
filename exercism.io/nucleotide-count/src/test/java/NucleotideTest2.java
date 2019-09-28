import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

import org.junit.Test;
import org.junit.Ignore;

public class NucleotideTest2 {

    @Test
    public void testEmptyDnaStringHasNoAdenosine() {
        DNA dna = new DNA("");
        assertThat(dna.count('A')).isEqualTo(0);
    }
}