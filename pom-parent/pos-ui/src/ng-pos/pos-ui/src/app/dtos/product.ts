export class ProductDto {

    constructor(id:String,label:String,description:String,price:number,img:String,qty:number){
        this._id=id;
        this._label=label;
        this.description=description;
        this.price=price;
        this._img=img;
        this._quantity=qty;
    }

    private _quantity: number;
    public get quantity(): number {
        return this._quantity;
    }
    public set quantity(value: number) {
        this._quantity = value;
    }

    private _img: String;
    public get img(): String {
        return this._img;
    }
    public set img(value: String) {
        this._img = value;
    }

    private _id: String;
    public get id(): String {
        return this._id;
    }
    public set id(value: String) {
        this._id = value;
    }
    
    private _label: String;
    public get label(): String {
        return this._label;
    }
    public set label(value: String) {
        this._label = value;
    }
    private _description: String;
    public get description(): String {
        return this._description;
    }
    public set description(value: String) {
        this._description = value;
    }
    private _price: number;
    public get price(): number {
        return this._price;
    }
    public set price(value: number) {
        this._price = value;
    }

    

}