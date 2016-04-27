package by.epam.mypackage.start;

import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Request request = new Request();
        request.setCommand("CREATE_NOTEBOOK");


        Response response = controller.doAction(request);

        if(response.getErrorMessage() == null){
            System.out.println(response.getMessage());
        }else{
            System.out.println(response.getErrorMessage());
        }


    }
}
