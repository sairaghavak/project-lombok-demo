package com.sairaghava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class DataDemoTest {

  @Test
  @DisplayName("should_create_instance_with_no_args_constructor")
  void shouldCreateInstanceWithNoArgsConstructor() {
    assertNotNull(new DataDemo());
  }

  @Test
  @DisplayName("should_throw_no_such_method_exception_when_creating_instance_with_args_constructor")
  void shouldThrowNoSuchMethodExceptionWhenCreatingInstanceWithArgsConstructor() {
    assertThrows(NoSuchMethodException.class,
        () -> DataDemo.class.getConstructor(String.class).newInstance("A Field Value"));
  }

  @Test
  @DisplayName("should_return_string_representation_of_object_when_printing_it")
  void shouldReturnStringRepresentationOfObjectWhenPrintingIt() {
    assertEquals("DataDemo(aField=null)", new DataDemo().toString());
  }

  @Test
  @DisplayName("should_return_field_value_on_calling_accessor")
  void shouldReturnFieldValueOnCallingAccessor() {
    assertNull(new DataDemo().getAField());
  }

  @Test
  @DisplayName("should_set_field_value_on_calling_mutator")
  void shouldSetFieldValueOnCallingMutator() {
    DataDemo dataDemo = new DataDemo();
    dataDemo.setAField("space");
    assertNotNull(dataDemo);
    assertEquals("space", dataDemo.getAField());
  }

}