package com.pholser.junit.quickcheck;

import com.pholser.junit.quickcheck.test.generator.TestBooleanGenerator;
import com.pholser.junit.quickcheck.test.generator.TestByteGenerator;
import com.pholser.junit.quickcheck.test.generator.TestCharacterGenerator;
import com.pholser.junit.quickcheck.test.generator.TestDoubleGenerator;
import com.pholser.junit.quickcheck.test.generator.TestFloatGenerator;
import com.pholser.junit.quickcheck.test.generator.TestIntegerGenerator;
import com.pholser.junit.quickcheck.test.generator.TestLongGenerator;
import com.pholser.junit.quickcheck.test.generator.TestShortGenerator;
import org.junit.Test;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.junit.experimental.results.PrintableResult.*;
import static org.junit.experimental.results.ResultMatchers.*;

public class FromTest {
    @Test
    public void explicitPrimitiveBoolean() {
        assertThat(testResult(ExplicitPrimitiveBoolean.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitPrimitiveBoolean {
        @Theory public void shouldHold(@ForAll @From(TestBooleanGenerator.class) boolean b) {
        }
    }

    @Test
    public void explicitWrapperBoolean() {
        assertThat(testResult(ExplicitWrapperBoolean.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitWrapperBoolean {
        @Theory public void shouldHold(@ForAll @From(TestBooleanGenerator.class) boolean b) {
        }
    }

    @Test
    public void explicitPrimitiveByte() {
        assertThat(testResult(ExplicitPrimitiveByte.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitPrimitiveByte {
        @Theory public void shouldHold(@ForAll @From(TestByteGenerator.class) byte b) {
        }
    }

    @Test
    public void explicitWrapperByte() {
        assertThat(testResult(ExplicitWrapperByte.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitWrapperByte {
        @Theory public void shouldHold(@ForAll @From(TestByteGenerator.class) byte b) {
        }
    }

    @Test
    public void explicitPrimitiveChar() {
        assertThat(testResult(ExplicitPrimitiveChar.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitPrimitiveChar {
        @Theory public void shouldHold(@ForAll @From(TestCharacterGenerator.class) char ch) {
        }
    }

    @Test
    public void explicitWrapperChar() {
        assertThat(testResult(ExplicitWrapperChar.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitWrapperChar {
        @Theory public void shouldHold(@ForAll @From(TestCharacterGenerator.class) char ch) {
        }
    }

    @Test
    public void explicitPrimitiveDouble() {
        assertThat(testResult(ExplicitPrimitiveDouble.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitPrimitiveDouble {
        @Theory public void shouldHold(@ForAll @From(TestDoubleGenerator.class) double d) {
        }
    }

    @Test
    public void explicitWrapperDouble() {
        assertThat(testResult(ExplicitWrapperDouble.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitWrapperDouble {
        @Theory public void shouldHold(@ForAll @From(TestDoubleGenerator.class) Double d) {
        }
    }

    @Test
    public void explicitPrimitiveFloat() {
        assertThat(testResult(ExplicitPrimitiveFloat.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitPrimitiveFloat {
        @Theory public void shouldHold(@ForAll @From(TestFloatGenerator.class) float f) {
        }
    }

    @Test
    public void explicitWrapperFloat() {
        assertThat(testResult(ExplicitWrapperFloat.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitWrapperFloat {
        @Theory public void shouldHold(@ForAll @From(TestFloatGenerator.class) Float f) {
        }
    }

    @Test
    public void explicitPrimitiveInt() {
        assertThat(testResult(ExplicitPrimitiveInt.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitPrimitiveInt {
        @Theory public void shouldHold(@ForAll @From(TestIntegerGenerator.class) int i) {
        }
    }

    @Test
    public void explicitWrapperInt() {
        assertThat(testResult(ExplicitWrapperInt.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitWrapperInt {
        @Theory public void shouldHold(@ForAll @From(TestIntegerGenerator.class) Integer i) {
        }
    }

    @Test
    public void explicitPrimitiveLong() {
        assertThat(testResult(ExplicitPrimitiveLong.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitPrimitiveLong {
        @Theory public void shouldHold(@ForAll @From(TestLongGenerator.class) long ell) {
        }
    }

    @Test
    public void explicitWrapperLong() {
        assertThat(testResult(ExplicitWrapperLong.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitWrapperLong {
        @Theory public void shouldHold(@ForAll @From(TestLongGenerator.class) long ell) {
        }
    }

    @Test
    public void explicitPrimitiveShort() {
        assertThat(testResult(ExplicitPrimitiveShort.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitPrimitiveShort {
        @Theory public void shouldHold(@ForAll @From(TestShortGenerator.class) short sh) {
        }
    }

    @Test
    public void explicitWrapperShort() {
        assertThat(testResult(ExplicitWrapperShort.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class ExplicitWrapperShort {
        @Theory public void shouldHold(@ForAll @From(TestShortGenerator.class) short sh) {
        }
    }
}
