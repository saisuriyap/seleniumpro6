package testblack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
	int x=5;
	int y=1;
	int z=2;
  @Test
  public void add() {
	  Assert.assertEquals(x+y,6);
  }
  @Test
 public void sub() {
	 Assert.assertEquals(y-z,-1);
  }
  @Test
 public void mul() {
	 Assert.assertEquals(x*z,10);
 }
  @Test
 public void div() {
	 Assert.assertEquals(x/y,5);
 }
}
