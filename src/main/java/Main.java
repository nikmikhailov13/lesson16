import java.util.List;

public class Main {

  public static void main(String[] args) {

    Tree tree = new Tree(20,
        new Tree(7, new Tree(4, null, new Tree(6)), new Tree(9)),
        new Tree(35, new Tree(31, new Tree(28), null), new Tree(40, new Tree(38), new Tree(52))));

    System.out.println(tree.sum());

    Tree tree1 = new Tree(0, null, null);

    List.of(tree, tree1).forEach(tree::print);
  }
}
