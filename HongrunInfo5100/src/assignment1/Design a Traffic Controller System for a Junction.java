Design a Traffic Controller System for a Junction



User can

1. Login system
2. Choose intersections as "Y","+",and “⊥” junction 
3. Set traffic light
4. Set time
5. Set car density
6. Obtain the result
7. Exit

------

Class: User

Data: name, juctiontype, horizontal, vertical, hTime, vTime, hStream, vStream, wholeTime

Behaviour:

loginSystem(){

​    System.login(name);

}

Behaviour:

chooseJunction(type){

​    juctiontype.type("Y","+",“⊥”);

}

Behaviour:

setTrafficlight(){

​      If(horizontal==red){

​         vertical=green;

}

​      else if(horizontal==green) {

​         vertical=red;

}

​      else{

​         reinput();

}

}

Behaviour:

setTime(){

​       Scanner input = new Scanner(System.in);

​       int hTime=input.nextInt();

​       int vTime=input.nextInt();

​       if(hTime==vTime)

​        return true;

​        else return false;

}

Behaviour:

setCardensity(){

​         Scanner input= new Scanner(System.in);

​          int hStream=input.nextInt();

​          int vStream=input.nextInt();

​          hStream--;

​          vStream--;

​          wholeTime++;

​         If (hStream==0&&vStream==0){

​          return wholeTime;

}

}

Behaviour:

result(){

​            if(processStop){

​       return hTime, vTime, hStream, vStream, wholeTime

}

}

Behaviour:

Exit(){

​           System.logout();

}

