Design a vending Machine (will accept coins of different denominations and vends out candies, soda etc)

User can

1. search items that the vending machine could offer
2. choose the item that user wants to buy
3. choose pay method
4. Cancel the deal

------

Class: User

State: name, creditCardDetails, Cash

Behaviour: searchItems(SearchParams){

​		List<Items> items = ItemService.search(searchParams);

​		//display items to user

}

Behaviour: chooseItem(){

​		choosingDetails = ItemService.chooseItem(item,numberOfItems)

}

Behaviour: CancelItem(item){

​		ItemService.cancelItem(item);

}

------

Class: CreditCardDetails

State: name, cardNumber, cardType, expiryDate

Behaviour: isCardExpired(){

​		Date today = new Date();
​        if(today.compareTo(expiryDate) == 1)
​             return true;
​        return false;

}

------

Class: Cash

State: Dcash

Behaviour: acceptDcash(){

​		Cash cash=new Cash();

​		if(singleCash=1||singleCash=2||singleCash=5||singleCash=10){

​			return true;

}

​		return false;

}

Class: ItemService

Behaviour: serach(searchParams){

​		List<Item>availableItems

​		List<Item>Items

```java
		for( i=0; i< Items.number(); i++){

			Boolean isAvailable= true;

		while(searchParams.numberOfItems.compareTo(searchParams.remainingItems){

			if(!items.get(i).checkAvailability(searchParams.nuberOfItems, searchParams.remainingItems)){
			isAvailable = false;
			break;
			}
}
}
}
```

Behaviour: chooseItem(item){

​		Item item;

​		int numberOfItems;

		if(!creditCardDetails.isCardExpired()){
	       //calculate price on the basis of price of item, 
	       int price = hotel.price * numberOfItems;
	       PaymentService.makePayment(user, price )
	       return itemDetails;
	       and generate reciept
	   }
	   else throw new Exception("Card is Expired");
	   }
Behaviour: cancelDeal(item){

​		PaymentService.initiateRefund(user, price);

}

