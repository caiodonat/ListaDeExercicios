import L5_ExerciciosFuncoes.Ex01_L5;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex01_L5_Test {
    public final Ex01_L5 ex01_l5 = new Ex01_L5();

    @Test
    public void montarEstrutura() {
        assertEquals("1 \n", ex01_l5.montarEstrutura(1));
        assertEquals("1 \n2 2 \n3 3 3 \n4 4 4 4 \n", ex01_l5.montarEstrutura(4));
    }
}