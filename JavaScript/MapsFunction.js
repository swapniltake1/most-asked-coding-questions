let map = new Map();

map.set("swapnil", "Java");
map.set("Mahesh", "js");
map.set("nilesh","DSA");

console.log(map);


console.log(map.keys);

console.log(map.has("swapnil"));


for (let [k, v] of map) {
    console.log(k," : ",v);
}