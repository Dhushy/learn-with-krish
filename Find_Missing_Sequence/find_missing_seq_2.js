function array(arr){
    let missing_array = new Array(10);;

    let minVal = Math.min(...arr);
    let maxVal = minVal + missing_array.length;

    for(let i = minVal; i<maxVal; i++){
        if(arr.indexOf(i) < 0){
            missing_array.push(i);
        }
    }

    return missing_array;
}

console.log(array([22,25,29,28,22,24,27,26])); 