package com.bsonin.asciiart.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MathUtilsTest
{

  @Test
  public void isPositiveReturnsTrueForPositiveInteger()
  {
    assertTrue(MathUtils.isPositive(1));
  }

  @Test
  public void isPositiveReturnsFalseForNegativeInteger()
  {
    assertFalse(MathUtils.isPositive(-1));
  }

  @Test
  public void isPositiveReturnsFalseForZero()
  {
    assertFalse(MathUtils.isPositive(0));
  }

  @Test
  public void isNegativeReturnsFalseForPositiveInteger()
  {
    assertFalse(MathUtils.isNegative(1));
  }

  @Test
  public void isNegativeReturnsTrueeForNegativeInteger()
  {
    assertTrue(MathUtils.isNegative(-1));
  }

  @Test
  public void isNegativeReturnsFalseForZero()
  {
    assertFalse(MathUtils.isNegative(0));
  }
}
