package com.BankingSystem;

public class Login {
	private static Login singleInstance = null;
    private boolean loggedIn;
    private Login() {
        loggedIn = false; 
    }

    public static Login getInstance() {
        if (singleInstance == null) {
            synchronized (Login.class) {
                if (singleInstance == null) {
                    singleInstance = new Login();
                }
            }
        }
        return singleInstance;
    }

    public void log_in() {
        loggedIn = true;
    }

    public void log_out() {
        loggedIn = false;
    }

    public boolean loggedIn() {
        return loggedIn;
    }

}
