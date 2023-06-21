/**Implement a function propertyExists(obj, path) that takes two arguments - an object and a path (string). It returns ‘False’ if the property is null or it doesn’t exist for that object, otherwise it will return the value of the property for that object.
Note: Properties can have single character only. So, path can be a string with concatenation of many properties.
Sample Input :
1  {"a":{"b":"dadsa"}} ac
Expected Output :
false
Sample Input :
2
{"a":{"b":"dadsa"}} ac
{"a":{"b":"dadsa"}} ab
Expected Output :
false
dadsa */


//Write your function here
function propertyExists(obj,path) {
    // Write logic here
     let currentObj = obj;
      for (let i = 0; i < path.length; i++) {
           const property = path[i];
           if (currentObj.hasOwnProperty(property)) {
               currentObj = currentObj[property];
            } else {
                return false;
            }
       }
  
  return currentObj;
}



// Input and output has already been handled for you
process.stdin.resume();
process.stdin.setEncoding('utf8');

let remainder = '';
process.stdin.on('data', function (chunk) {
  let lines = chunk.toString().split(' ')
    let t = parseInt(lines[0]);
    for (let i=0;i<t;i++) {
      let obj = lines[(i*2)+1];
      let str = lines[(i*2)+2];
      let arr = []
      for(let c of str) {
          if(c === '\r' || c === '\n') continue
          arr.push(c)
      }
      let ans = propertyExists(JSON.parse(obj),arr)
      process.stdout.write(ans.toString()+'\n');
    }

    process.exit()
});