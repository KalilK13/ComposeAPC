package composepc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCTest {
    @Test
    public void testPCConstructor(){
        Case expected = new Case("0027AU", "Hp", "80W", size);
        PC pc = new PC(expected);
        Case actual = pc.getPcCase();
    }
}