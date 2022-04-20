class car() :
    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color

    def accelerate(self) :
        print(self.manufacturer + " "+self.model +" " +"is moving")
    def stop(self):
        print(self.manufacturer+" "+self.model+" "+"has stopped")
car1=car("Honda","ZX","2020","Automatic","Red")
car2=car("Suziki","ZXi",'2019',"Automatic","Silver")
car3=car("Hundayi","vxi","2020","Manual","White")
car1.accelerate()
car1.stop()
car2.accelerate()
car3.stop()