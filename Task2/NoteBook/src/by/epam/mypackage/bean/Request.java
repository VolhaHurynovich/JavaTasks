package by.epam.mypackage.bean;

public class Request {
    private String command;
    private String parameter1;
    private String parameter2;


    public Request(){
    }

    public Request(String command, String text, String date) {
        this.command = command;
        this.parameter1 = text;
        this.parameter2 = date;
    }

    public String getCommandName() {
        return command;
    }

    public void setCommandName(String command) {
        this.command = command;
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }


}


