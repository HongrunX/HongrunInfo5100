Design a Car Rental System



User can

1. Login
2. Search cars based on parameters(location, budget, landmark, brand)
3. Rent car
4. Cancel renting

------

Class: User

State: UserId, name, phoneNumber, creditCardDetails

Behaviour: searchCars(SearchParams){

​      List<Cars> cars= CarService.search(searchParams);

​      //display cars to user

}

Behaviour: rentCar(){

​     RentingDetails = CarService.rentCar(carId, checkinDate,checkOutDate, numberOfCars)

}

------

Class: CreditCardDetails

State: name, cardNumber,cardType, expiryDate

Behaviour: isCardExpired(){

​        Date today=new Date();

​        if(today.compareTo(expiryDate)==1)

​               return true;

​         return false;

}

------

Class: CarOwner

State: OwnerId, name, address, list of cars

------

Class: Car

State: name, address, ownerId, closestLandmarks, carPrice, totalCars, carId, reviews, rating

Behaviour: checkAvailability(date, numberOfCars){

//check availability of number of rooms on specific date

}

------

Class: CarService

Behaviour: search(searchParams){

// call to fetch all cars and store in List<Cars> cars

List<Car> availableCars

List<Car> cars

```java
for ( i = 0; i < cars.size(); i++) {
                //check if car is available for specific date
                Boolean isAvailable = true;
                while (searchParams.checkinDate.compareTo(searchParams.checkOutDate)) {
                    if (!cars.get(i).checkAvailability(searchParams.checkinDate, searchParams.numberOfCars)) {
                        isAvailable = false;
                        break;
                    }
                    searchParams.checkinDate++;

}

 if (isAvailable && cars.get(i).closestLandmarks.contains(searchParams.closestLandmark)
                        && searchParams.pinCodes.contains(cars[i].pinCode)
                        && cars.get(i).price <= searchParams.maxPrice
                        && cars.get(i).price >= searchParams.minPrice
                        && cars.get(i).name.indexOf(searchParams.name)) {
                    availableCars.add(cars.get(i));
                }

 }
        return availableCars;
    }
```

Behaviour: rentCar(carId, checkinDate, checkOutDate, numberOfCars){

//fetch car object from carId

Car car;

//calculate number of days

int numberOfDays;

```java
 //fetch creditcarddetails if saved
       if(!creditCardDetails.isCardExpired()){
           //calculate price on the basis of price of car, number of rooms booked, number of days
           int price = car.price * numberOfDays * numberOfRooms;
           PaymentService.makePayment(travellerId, price )
           return bookingDetails;
           and generate booking id
       }
       else throw new Exception("Card is Expired");
   }

}
```

Behaviour: cancelRenting(rentingId){

​        //fetch user object and fare

​        PaymentService.initiateRefund(traveller, price)

}