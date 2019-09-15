Design a Parking lot

Driver

1. Search parking places among the  parking lot.
2. Determine a parking place
3. Pay for the parking place

------

Class: Driver

State: name, phoneNumber, creditCardDetails

Behaviour: searchParkingPlace(SearchParams){

​		List<ParkingPlaces> ParkingPlaces = ParkingService.search(searchParams);

​		//display parking places to driver

}

Behaviour: chooseParkingPlace(){

​		ChoosingDetails = ParkingService.choosingParkingPlace(parkingPlaceId, checkinTime,checkOutTime, numberOfPlaces)

}

------

Class:  ParkingService

Behaviour: search(searchParams){

​		List<ParkingPlaces> availableParkingPlaces

​		List<ParkingPlaces> parkingplaces

				for ( i = 0; i < ParkingPlaces.size(); i++) {
	            //check if ParkingPlaces is available for specific date
	            Boolean isAvailable = true;
	            while (searchParams.currentRemainingNumber==0) {
	                    isAvailable = false;
	                    }
```
if(isAvailable&&ParkingPlaces.get(i).closestParkingPlace.contains(searchParams.closestParkingPlace)){

		availableParkingPlaces.add(ParkingPlaces.get(i));

}

}

	return availableParkingPlaces;

}


```

Behaviour: chooseParkingPlace(ParkingPlaceId, checkInTime,checkOutTime,numberOfParkingPlaces){

​		ParkingPlace ParkingPlace;

​		if(availableParkingPlaces){

​		int price = ParkingPlace.price*(checkOutTime-checkInTime);

​		PaymentService.makePayment(name, price);

​		return choosingDetails;

}

​		else throw new Exception("No more ParkingPlaces")

}