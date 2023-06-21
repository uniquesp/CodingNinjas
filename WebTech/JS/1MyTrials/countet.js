var sec = 10;
function sayHello(){
    console.log("after",sec);
    sec--;
if(sec==0){
clearInterval(id);
}
}
// setTimeout(sayHello,2000); //print once
var id = setInterval(sayHello,1000); //print till 10


var count=1;
function timer(){
    if(count==10){
        console.log("Time Up!");
        clearInterval(id);
        return;
    }
console.log(count);
count++;
}

var id = setInterval(timer,100);