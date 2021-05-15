package com.example.spring_tsu_task_1;

public class CarService {
    private String CarModel;
    private String CarProblem;
    private int ServicePrice;

    public CarService(String carModel, String carProblem, int servicePrice) {
        CarModel = carModel;
        CarProblem = carProblem;
        ServicePrice = servicePrice;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public String getCarProblem() {
        return CarProblem;
    }

    public void setCarProblem(String carProblem) {
        CarProblem = carProblem;
    }

    public int getServicePrice() {
        return ServicePrice;
    }

    public void setServicePrice(int servicePrice) {
        ServicePrice = servicePrice;
    }
}
