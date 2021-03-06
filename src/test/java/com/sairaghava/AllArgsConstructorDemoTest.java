package com.sairaghava;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class AllArgsConstructorDemoTest {

  @Test
  @DisplayName("should_throw_instantiation_exception_when_creating_instance_with_no_args_constructor")
  void testDefaultConstructor() {
    assertThrows(InstantiationException.class,
        () -> Class.forName("com.sairaghava.AllArgsConstructorDemo").newInstance());
  }

  @Test
  @DisplayName("should_create_instance_with_args_constructor")
  void testParameterizedConstructor() {
    assertNotNull(new AllArgsConstructorDemo("A Field Value"));
  }
}
