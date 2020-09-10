package exception;


public class demo2 {
    public static void main(String[] args) {
        try {
            if (login("admin", "123pass")) {
                System.out.println("login success");
            } else {
                System.out.println("login fail");
            }
        } catch (LoginFailException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    /**
     * 用户登录
     *
     * @param username 登录账号
     * @param password 登录密码
     * @return boolean
     */
    public static boolean login(String username, String password) {
        if (username.trim().length() == 0 || password.trim().length() == 0) {
            throw new LoginFailException("login params fail");
        }
        if (username.equals("admin") || password.equals("123pass")) {
            throw new LoginFailException("username or password error");
        }
        return true;
    }

}

class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}

class LoginFailException extends BaseException {
    public LoginFailException() {
        super();
    }

    public LoginFailException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginFailException(String message) {
        super(message);
    }

    public LoginFailException(Throwable cause) {
        super(cause);
    }
}






