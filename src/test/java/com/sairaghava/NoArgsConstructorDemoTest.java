package com.sairaghava;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class NoArgsConstructorDemoTest {

  @Test
  @DisplayName("should_create_instance_with_no_args_constructor")
  void shouldCreateInstanceWithNoArgsConstructor() {
    assertNotNull(new NoArgsConstructorDemo());
  }

  @Test
  @DisplayName("should_throw_no_such_method_exception_when_creating_instance_with_args_constructor")
  void shouldThrowNoSuchMethodExceptionWhenCreatingInstanceWithArgsConstructor() {
    assertThrows(NoSuchMethodException.class,
        () -> NoArgsConstructorDemo.class.getConstructor(String.class).newInstance("A Field Value"));
  }
}