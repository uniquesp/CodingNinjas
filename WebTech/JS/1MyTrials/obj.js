var student = {
name : "abc",
rollNo : 135,
marks : 90,
address : {
city : pune,
Country : India,
}
};

// This problem has only one correct answer
// for(var i=0; i<3; ++i) { console.log(student[i]) }
for(var i in student) { console.log(i) }
// for(var i in obj) { console.log(obj[i]) }
// none of the above