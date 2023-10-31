let laptop = {
    cpu:'i5',
    ram:'16',
    brand:'acer',

    getConfig:function() {
        console.log(this.cpu+"   "+this.ram);
    }
}

laptop.getConfig();