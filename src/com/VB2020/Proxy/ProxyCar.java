package com.VB2020.Proxy;

public class ProxyCar implements Car{

    private String key;
    private JeepCar jeepCar;

    public ProxyCar(String key) {
        this.key = key;
    }

    @Override
    public void startCarEngine() {

        if(jeepCar==null)
        {
            jeepCar = new JeepCar(key);
        }
        jeepCar.startCarEngine();

    }
}
