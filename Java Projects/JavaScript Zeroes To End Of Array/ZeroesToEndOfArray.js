function zeroesToEndOfArray(array, n) {
let count = 0;

for (i = 0; i < n; i++) {
    if (array[i] != 0) {
        array[count++] = array[i];
    }
}

while(count < n) {
    array[count++] = 0;
}
}

let array = [0,0,4,0,3,45,64,2];

n = array.length;

zeroesToEndOfArray(array, n);

//Document.write("Here is the array with " +
///"all zeroes pushed to the back");

//for (i = 0; i < n; i++) {
    //Document.write(array[i] + "");
//}