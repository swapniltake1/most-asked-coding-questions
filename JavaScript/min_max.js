function getMin(arr, i, n) {
    return (n == 1) ? arr[i] : Math.min(arr[i], getMin(arr, i + 1, n - 1));
}

function getMax(arr, i, n) {
    return (n == 1) ? arr[i] : Math.max(arr[i], getMax(arr, i + 1, n - 1));
}

var arr = [12, 1234, 45, 67, 1];
var n = arr.length;
document.write("Minimum element of array: " + getMin(arr, 0, n) + "<br/>");
document.write("Maximum element of array: " + getMax(arr, 0, n));
