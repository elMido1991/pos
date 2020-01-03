import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CategoryDto } from '../dtos/category';

@Injectable({
  providedIn: 'root'
})
export class ProductService{
    API_PRODUCT_KEY = 'http://localhost:6255/articles';
    API_CATEGORY_KEY = 'http://localhost:6255/categories';
    handleError="";
    results;
    constructor(private httpClient: HttpClient) { }

    public getAllProducts(){
        return this.httpClient.get(this.API_PRODUCT_KEY+'/all');
    }


    public getProductByCategoryId(id:String){
        return this.httpClient.get(this.API_PRODUCT_KEY+'/find/categorie/'+id);
    }


    public getAllCategories(){
        return this.httpClient.get(this.API_CATEGORY_KEY+'/all');
    }

}