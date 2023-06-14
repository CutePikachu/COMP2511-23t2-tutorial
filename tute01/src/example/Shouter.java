package example;

/**
 * Inside a new file Shouter.java, Write a program that stores a message and has methods for getting the message, updating the message and printing it out in all caps. Write a main() method for testing this class.
 */
public class Shouter {
    private String msg;

    public Shouter(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void allCaps() {
        System.out.println(msg.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("hi");

        System.out.println( shouter.getMsg());
        shouter.setMsg("bye");
        System.out.println(shouter.msg);
        shouter.allCaps();
    }
}
