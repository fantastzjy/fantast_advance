package designPattern.factory.abstractMethod;

public abstract class AbstractFactory {
    abstract Food createFood();

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();
}
