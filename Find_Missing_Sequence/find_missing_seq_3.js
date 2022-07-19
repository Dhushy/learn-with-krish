function array(arr){
    let missing_array = new Array(Number(arr.length+1));;

    let minVal = Math.min(...arr);
    let maxVal = minVal + arr.length;

    for(let i = minVal; i<=maxVal; i++){
        if(arr.indexOf(i) < 0){
            if(i == maxVal){
                return "Missing number is "+ (minVal-1)+ " or "+ (maxVal);
            }
            return "Missing number is " + i;
        }
    }
}

console.log(array([23,25,29,28,22,24,27,26,30]));