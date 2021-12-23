public class Tree {

  private int value;
  private Tree left;
  private Tree right;

  public Tree(int value, Tree left, Tree right) {
    this.left = left;
    this.right = right;
    this.value = value;
  }

  public Tree(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void print(Tree tree){
    System.out.println("Tree " + tree.getValue());
  }

  public int sum() {
    int result = this.value;
    if (this.left != null) {
      result += left.sum();
    }
    if (this.right != null) {
      result = result + right.sum();
    }
    return result;
  }
}
