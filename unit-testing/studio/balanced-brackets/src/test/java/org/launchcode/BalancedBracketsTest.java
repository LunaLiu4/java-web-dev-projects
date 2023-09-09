package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    //1
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //2
    @Test
    public void notSquareBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //3
    @Test
    public void squreBracketsBehindCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode[]"));
    }
    //4
    @Test
    public void notSquareBracketsWithCharactersReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launchcode]["));
    }
    //5
    @Test
    public void startSquareBracketsWithCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launchcode"));
    }
    //6
    @Test
    public void notSquareBracketsStartWithCharactersReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][Launchcode"));
    }
    //7
    @Test
    public void squareBracketsInsideCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }
    //8
    @Test
    public void notSquareBracketsInsideCharactersReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]code["));
    }
    //9
    @Test
    public void onlyMultiplySquareBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    //10
    @Test
    public void onlyMultiplyNotSquareBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }
    //11
    @Test
    public void moreOpenningBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }
    //12
    @Test
    public void moreClosingBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]]"));
    }
}
