package com.example.aopexam.proxexam;

public class ServiceRun {
    public static void main(String[] args) {
        Service service = new ProxyService();

        service.perform();
    }
}
