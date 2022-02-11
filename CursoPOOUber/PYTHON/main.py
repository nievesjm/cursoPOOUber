from car import Car
from account import Account

if __name__=="__main__":
    print("Hola Nieves desde python")
    car=Car("JIMN97", Account("Nieves Mia", "NievesJM"))
    print(vars(car))
    print(vars(car.driver))
