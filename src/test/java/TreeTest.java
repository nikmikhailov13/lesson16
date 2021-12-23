import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TreeTest {

  @Test
  void shouldCalculateSum() {
    // given
    Tree tree = new Tree(20,
        new Tree(7, new Tree(4, null, new Tree(6)), new Tree(9)),
        new Tree(35, new Tree(31, new Tree(28), null), new Tree(40, new Tree(38), new Tree(52))));

    // when
    int sum = tree.sum();

    // then
    Assertions.assertEquals(270, sum);
  }
}