Design a Course Registration Platform



Student can

1. Login platform
2. Register classes
3. Review classes
4. Drop classes
5. Logout platform

------

Class: Student

Data: studentId, name

Behaviour: searchClasses(SearchParams){

​       List<Classes>classes = ClassService.search(searchParams);

​        //display classes to student

}

Behaviour: registerClass(){

​        RegisteringDetails= ClassService.registerClass(ClassId, numberOfSeats)

}

Behaviour: dropClass(ClassId){

​        ClassService.dropClass(ClassId);

}

------

Class: Class

Data: name, location, classCredit, totalSeats, classId, reviews, rating

Behaviour: CheckAvailability(numberOfSeats){

   //check availability of number of remaining seats

}

------

Class:ClassService

Behaviour: search(searchParams){

​       //call to fetch all hotels and store in List<Classes> Classes

​         List<Class> availableClasses

​         List<Class> Classes

```java
for(i = 0; i< classes.size();i++){
   //check if class has seats for registration
   Boolean isAvailable = true;
   while(searchParams.checkInSeat.compareTo(searchParams.checkRemainingSeat)){
   if(!classes.get(i).checkAvailability(searchParams.checkInSeat,searchParams.numberOfSeats)){
   isAvailable =  false;
   break;
   }
   return true;
   }

```

Behaviour:  registerClass(classId, studentId, numberOfRooms){

​		Class class;

​		if(numberOfRooms>0){

​		Student.register(studentId);

}

}

Behaviour: dropClass(classId){

​		delete.information(studentId);

}