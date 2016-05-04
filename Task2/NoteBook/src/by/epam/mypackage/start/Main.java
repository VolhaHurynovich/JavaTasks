package by.epam.mypackage.start;

import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Request request = new Request();
        request.setCommandName("CREATE_NOTEBOOK");
        Response response;
        response = controller.doAction(request);
//        if (response.getErrorMessage() == null) {
//            System.out.println(response.getMessage());
//        } else {
//            System.out.println(response.getErrorMessage());
//        }

        Request request2 = new Request();
        request2.setCommandName("ADD_NOTE");
        request2.setParameter1("my first note");
        Response response2 = controller.doAction(request2);
//        if (response2.getErrorMessage() == null) {
//            System.out.println(response2.getMessage());
//        } else {
//            System.out.println(response2.getErrorMessage());
//        }

        Request request3 = new Request();
        request3.setCommandName("ADD_NOTE");
        request3.setParameter1("my second note");
        request3.setParameter2("2016-01-01");
        Response response3 = controller.doAction(request3);
//        if (response3.getErrorMessage() == null) {
//            System.out.println(response3.getMessage());
//        } else {
//            System.out.println(response3.getErrorMessage());
//        }

        Request request4 = new Request();
        request4.setCommandName("SHOW_NOTEBOOK");
        Response response4 = controller.doAction(request4);
//        if (response4.getErrorMessage() == null) {
//            System.out.println(response4.getMessage());
//        } else {
//            System.out.println(response4.getErrorMessage());
//        }

        Request request5 = new Request();
        request5.setCommandName("SEARCH_BY_DATE");
        request5.setParameter1("2016-01-02");
        Response response5 = controller.doAction(request5);
//        if (response5.getErrorMessage() == null) {
//            System.out.println(response5.getMessage());
//        } else {
//            System.out.println(response5.getErrorMessage());
//        }

        Request request6 = new Request();
        request6.setCommandName("SEARCH_BY_TEXT");
        request6.setParameter1("first");
        Response response6 = controller.doAction(request6);
//        if (response6.getErrorMessage() == null) {
//            System.out.println(response6.getMessage());
//        } else {
//            System.out.println(response6.getErrorMessage());
//        }

        Request request7 = new Request();
        request7.setCommandName("WRITE_FILE");
        request7.setParameter1("1.cer");
        Response response7 = controller.doAction(request7);
//        if (response7.getErrorMessage() == null) {
//            System.out.println(response7.getMessage());
//        } else {
//            System.out.println(response7.getErrorMessage());
//        }

        Request request8 = new Request();
        request8.setCommandName("CREATE_NOTEBOOK");
        Response response8 = controller.doAction(request8);
//        if (response8.getErrorMessage() == null) {
//            System.out.println(response8.getMessage());
//        } else {
//            System.out.println(response8.getErrorMessage());
//        }

        Request request9 = new Request();
        request9.setCommandName("ADD_NOTE");
        request9.setParameter1("my third note");
        request9.setParameter2("2016-02-02");
        Response response9 = controller.doAction(request9);
//        if (response9.getErrorMessage() == null) {
//            System.out.println(response9.getMessage());
//        } else {
//            System.out.println(response9.getErrorMessage());
//        }

        Request request10 = new Request();
        request10.setCommandName("SHOW_NOTEBOOK");
        Response response10 = controller.doAction(request10);
//        if (response10.getErrorMessage() == null) {
//            System.out.println(response10.getMessage());
//        } else {
//            System.out.println(response10.getErrorMessage());
//        }

        Request request11 = new Request();
        request11.setCommandName("WRITE_FILE");
        request11.setParameter1("2.cer");
        Response response11 = controller.doAction(request11);
//        if (response11.getErrorMessage() == null) {
//            System.out.println(response11.getMessage());
//        } else {
//            System.out.println(response11.getErrorMessage());
//        }

        Request request12 = new Request();
        request12.setCommandName("READ_FILE");
        request12.setParameter1("1.cer");
        Response response12 = controller.doAction(request12);
//        if (response12.getErrorMessage() == null) {
//            System.out.println(response12.getMessage());
//        } else {
//            System.out.println(response12.getErrorMessage());
//        }

        Request request13 = new Request();
        request13.setCommandName("SHOW_NOTEBOOK4645");
        Response response13 = controller.doAction(request13);
//        if (response13.getErrorMessage() == null) {
//            System.out.println(response13.getMessage());
//        } else {
//            System.out.println(response13.getErrorMessage());
//        }

        Request request14 = new Request();
        request14.setCommandName("ADD_NOTE");
        request14.setParameter1("my error note");
        request14.setParameter2("201676jj");
        Response response14 = controller.doAction(request14);

    }
}
