function array(arr){
    let array = [];

    let minVal = Math.min(...arr);
    let maxVal = Math.max(...arr);

    for(let i = minVal; i<maxVal; i++){
        if(arr.indexOf(i) < 0){
            array.push(i);
        }
    }

    return array;
}

console.log(array([1,2,3,6]));