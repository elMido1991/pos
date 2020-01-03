import { Component, OnInit } from '@angular/core';
import {ProductDto} from '../dtos/product'
import { CategoryDto } from '../dtos/category';
import { ProductService } from '../services/ProductService';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private apiProductService: ProductService) { 

  }

  
  categories:Array<CategoryDto>;
  selectedCategory: CategoryDto;
  selectedProducts:Array<ProductDto>;

  ngOnInit() {

    let products = null;
    this.categories = new Array();
    this.selectedProducts=new Array();
    this.apiProductService.getAllCategories().subscribe((data)=>{
      console.log(data);
      let i=0,j=0;
      while(data[i]!=null){
        products = new Array();
        while(data[i].articlesdto[j]!=null){
          let productDto= data[i].articlesdto[j];
          products.push(new ProductDto(productDto.id,productDto.designation,productDto.description,productDto.price,productDto.image,productDto.quantity));
          j++;
        }
        this.categories.push(new CategoryDto(data[i].id,data[i].libelle,products));
         if(i==0)
         this.selectedCategory = this.categories.find(x => x.id == '1');
        i++;
      }
      

       
     
    });
    
    
   
   // }
    // let products = null;
    // this.categories = new Array();
    // let img = null;
    // for(var i=1;i<5;i++){
    //   products = new Array();
    //   for(var j=1;j<30;j++){
    //     img = 'assets/img/spaghetti.jpg';
    //     if(i%2==0) img = 'assets/img/pizza.jpg';
    //     if(i%3==0) img = 'assets/img/pastilla.jpg';
    //     if(i%5==0) img = 'assets/img/tacos.jpg';
        
    //     products.push(new ProductDto("10"+j,"article "+j,"desc "+j,j*10.00,img,1));
    //   }
    //   this.categories.push(new CategoryDto(""+i,"category "+i,products));
    // }
    // this.selectedCategory = this.categories[0];
  }

  
  onSelectCategory(category: CategoryDto): void {
    this.apiProductService.getProductByCategoryId(category.id).subscribe((data)=>{
      console.log(data);
      let i=0;
      let products = new Array();
      while(data[i]!=null){
        let productDto= data[i];
          products.push(new ProductDto(productDto.id,productDto.designation,productDto.description,productDto.price,productDto.image,productDto.quantity));
          i++;
      }
      this.selectedCategory.products=products;
      console.log(this.selectedCategory);
    }); 
    
    
  }


  onSelectProduct(product: ProductDto): void {
    let indexUpdate:number =this.selectedProducts.indexOf(product);
    if(indexUpdate == -1) {
      this.selectedProducts.push(product);
    }
    else{
      debugger
      product.quantity+=1;
      this.selectedProducts[indexUpdate]=product;
    }
    
  }

  onDeleteProduct(product: ProductDto): void {
    this.selectedProducts.splice(this.selectedProducts.indexOf(product),1)
  }

  onMinimzeProduct(product: ProductDto): void {
    let indexUpdate:number =this.selectedProducts.indexOf(product);
    if(indexUpdate !== -1) {
      debugger
      product.quantity-=1;
      if(product.quantity==0){
        this.onDeleteProduct(product);
      }
      else{
        this.selectedProducts[indexUpdate]=product;  
      }
      
    }
    
  }


  getSum(): number {
    let sum = 0;
    for (let i = 0; i < this.selectedProducts.length; i++) {
      sum += this.selectedProducts[i].quantity*this.selectedProducts[i].price;
    }
    return sum;
  }

}
