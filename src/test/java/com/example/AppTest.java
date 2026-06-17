package com.example;

import org.junit.Test;
import org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testAdd(){
      assertEquals(3,App.add(1,2));
      }
}
