package com.sairaghava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class DataDemoTest {

  @Test
  @DisplayName("should_create_instance_with_no_args_constructor")
  void testDefaultConstructor() {
    assertNotNull(new DataDemo());
  }

  @Test
  @DisplayName("should_throw_no_such_method_exception_when_creating_instance_with_args_constructor")
  void testParameterizedConstructor() {
    assertThrows(NoSuchMethodException.class,
        () -> DataDemo.class.getConstructor(String.class).newInstance("A Field Value"));
  }

  @Test
  @DisplayName("should_return_string_representation_of_object_when_printing_it")
  void testToString() {
    assertEquals("DataDemo(aField=null)", new DataDemo().toString());
  }

  @Test
  @DisplayName("should_return_field_value_on_calling_accessor")
  void testGetter() {
    assertNull(new DataDemo().getAField());
  }

  @Test
  @DisplayName("should_set_field_value_on_calling_mutator")
  void testSetter() {
    DataDemo dataDemo = new DataDemo();
    dataDemo.setAField("space");
    assertNotNull(dataDemo);
    assertEquals("space", dataDemo.getAField());
  }

  @Test
  @DisplayName("should_return_true_when_two_data_demo_instances_contains_similar_data")
  void testEquals() {
    DataDemo dataDemo1 = new DataDemo();
    dataDemo1.setAField("sairaghava");
    System.out.println("Hashcode of dataDemo1 = " + dataDemo1.hashCode());
    DataDemo dataDemo2 = new DataDemo();
    dataDemo2.setAField("sairaghava");
    System.out.println("Hashcode of dataDemo2 = " + dataDemo2.hashCode());
    assertTrue(dataDemo1.equals(dataDemo2));
    assertEquals(dataDemo1.hashCode(), dataDemo2.hashCode());
  }

  @Test
  @DisplayName("should_return_false_when_two_data_demo_instances_contains_different_data")
  void testHashCode() {
    DataDemo dataDemo1 = new DataDemo();
    dataDemo1.setAField("obj1");
    System.out.println("Hashcode of dataDemo1 = " + dataDemo1.hashCode());
    DataDemo dataDemo2 = new DataDemo();
    dataDemo1.setAField("obj2");
    System.out.println("Hashcode of dataDemo2 = " + dataDemo2.hashCode());
    assertFalse(dataDemo1.equals(dataDemo2));
    assertNotEquals(dataDemo1.hashCode(), dataDemo2.hashCode());
  }

  @Test
  @DisplayName("should_return_false_when_equality_is_checked_with_null")
  void testEqualityWithNull() {
    DataDemo dataDemo = new DataDemo();
    assertFalse(dataDemo.equals(null));
  }
}
