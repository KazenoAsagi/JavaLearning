let zn = {name: "楠哥"};
let ng = Object.create(zn, {
    url: {
        value: "xinzhi.com",
        enumerable: true
    }
});
for (const key in ng) {
    console.log(key);
}