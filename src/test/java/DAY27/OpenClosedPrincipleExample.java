package DAY27;

interface Role {
  public void roleType();
}

class AdminRole implements Role {
  @Override
  public void roleType() {
    System.out.println("Admin Role");
  }
}

class ManagerRole implements Role {
  @Override
  public void roleType() {
    System.out.println("Manager Role");
  }
}

class UserRole implements Role {
  @Override
  public void roleType() {
    System.out.println("User Role");
  }
}

public class OpenClosedPrincipleExample {
  public static void main(String[] args) {
    Role role = new ManagerRole();
    role.roleType();
  }
}
