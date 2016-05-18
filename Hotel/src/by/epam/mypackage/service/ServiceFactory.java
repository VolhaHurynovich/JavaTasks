package by.epam.mypackage.service;

import by.epam.mypackage.service.impl.ClientServiceImpl;
import by.epam.mypackage.service.impl.HotelServiceImpl;

public class ServiceFactory {
    private static ServiceFactory factory = new ServiceFactory();

    private final ClientService clientService = new ClientServiceImpl();
    private final HotelService  hotelService = new HotelServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return factory;
    }

    public ClientService getClientService(){
        return clientService;
    }

    public HotelService getHotelService(){
        return hotelService;
    }

}
