import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _071SimplifyPathTest {
  private _071SimplifyPath solution;

  @BeforeEach
  public void beforeEach() {
    solution = new _071SimplifyPath();
  }

  @Test
  public void test1() {
    Assertions.assertEquals("/home", solution.simplifyPath("/home/"));
  }

  @Test
  public void test2() {
    Assertions.assertEquals("/", solution.simplifyPath("/../"));
  }

  @Test
  public void test3() {
    Assertions.assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
  }

  @Test
  public void test4() {
    Assertions.assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
  }
}
