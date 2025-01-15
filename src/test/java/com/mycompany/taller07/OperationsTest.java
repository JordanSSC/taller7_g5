package com.mycompany.taller07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {

    // Test de Jordan
    @Test
    public void testMakeFormulaUnaOperacion() {
        String formula = Operations.MakeFormula();
        assertTrue(formula.length() >= 3 && formula.length() <= 5, "La fórmula generada no tiene el formato esperado.");
    }
    // Test de Geovanny
    @Test
    public void testMakeFormulaDosOperadores() {
        String formula = Operations.MakeFormula();
        assertTrue(formula.length() >= 5 && formula.length() <= 7, "La fórmula generada no tiene el formato esperado.");
    }
    // Test de David
    @Test
    public void testMakeFormulaCaracteresValidos() {
        String formula = Operations.MakeFormula();
        assertTrue(formula.matches("[0-9\\+\\-\\*/]+"), "La fórmula generada contiene caracteres no válidos.");
    }
    // Test de Jordan
    @Test
    public void testSolveSumar() {
        String formula = "4+6";
        String result = Operations.Solve(formula);
        assertEquals("4+6=10", result, "El resultado de la operación es incorrecto.");
    }
    // Test de Anthony
    @Test
    public void testSolveMultiplicarYSumar() {

        String formula = "3+2*5";
        String result = Operations.Solve(formula);
        assertEquals("3+2*5=13", result, "El resultado de la operación es incorrecto.");
    }
    // Test de Anthony
    @Test
    public void testSolveConOperadoresMixtos() {
        String formula = "7-4*3+9/3";
        String result = Operations.Solve(formula);
        assertEquals("7-4*3+9/3=-5", result, "El resultado de la operación es incorrecto.");
    }
    // Test de David
    @Test
    public void testSolveDivisionParaCero() {
        
        String formula = "5/0";
        try {
            Operations.Solve(formula);
            fail("Se esperaba una excepción por división por cero.");
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }
}

