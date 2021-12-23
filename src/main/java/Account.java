import lombok.Builder;

@Builder
public class Account {

  private String userId;
  private String token;

  private Account() {
    // private constructor
  }

  public String getUserId() {
    return userId;
  }

  public String getToken() {
    return token;
  }

}
