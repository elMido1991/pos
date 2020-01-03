import { ProductDto } from './product';

export class CategoryDto {
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
    private _products: Array<ProductDto>;
    public get products(): Array<ProductDto> {
        return this._products;
    }
    public set products(value: Array<ProductDto>) {
        this._products = value;
    }

    constructor(id,label,products){
        this._id=id;
        this._label=label;
        this._products=products;
    }

}