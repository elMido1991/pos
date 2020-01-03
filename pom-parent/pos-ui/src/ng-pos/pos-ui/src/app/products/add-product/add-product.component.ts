import { Component, OnInit } from '@angular/core';
import { CategoryDto } from 'src/app/dtos/category';
import { ProductService } from 'src/app/services/ProductService';
import { $ } from 'jquery';
@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private apiProductService: ProductService) { }
  categories:Array<CategoryDto>;
  
  ngOnInit() {
    this.categories = new Array();
    this.apiProductService.getAllCategories().subscribe((data)=>{
      console.log(data);
      let i=0;
      while(data[i]!=null){
        this.categories.push(new CategoryDto(data[i].id,data[i].libelle,null));
        i++;
      }
      

       
     
    });
    
    
  }


  

}
