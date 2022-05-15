@Test
public void test1(){
  assertThrows(ArithmeticException.class, () -> {
  mystery(1,-1);
});
}

@Test
public void test2(){
  assertEquals(1, mystery(1,1));
}

@Test
public void test2(){
  assertTimeout(Duration.ofMillis(1800), () -> {
  mystery(10,8));
  });
}
