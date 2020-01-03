import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CategoriesComponent } from './categories/categories.component';
import { ProductsComponent } from './products/products.component';
import { CustomersComponent } from './customers/customers.component';
import { SalesComponent } from './sales/sales.component';
import { OrdersComponent } from './orders/orders.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { InventoryComponent } from './inventory/inventory.component';
import { SettingsComponent } from './settings/settings.component';
import { CashComponent } from './cash/cash.component';
import { HttpClientModule } from '@angular/common/http';
import { AddProductComponent } from './products/add-product/add-product.component';
import { AddCategoryComponent } from './categories/add-category/add-category.component';
import { ListCategoriesComponent } from './categories/list-categories/list-categories.component';
import { ListProductsComponent } from './products/list-products/list-products.component';

const appRoutes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login',component: LoginComponent },
  { path: 'sales',component: SalesComponent },
  { path: 'categories',component: CategoriesComponent },
  { path: 'products',component: ProductsComponent },
  { path: 'customers',component: CustomersComponent },
  { path: 'orders',component: OrdersComponent },
  { path: 'inventory',component: InventoryComponent },
  { path: 'settings',component: SettingsComponent },
  { path: 'cash',component: CashComponent },
  { path: 'users',component: UsersComponent },
  { path: 'addProduct',component: AddProductComponent },
  { path: 'addCategory',component: AddCategoryComponent },
  { path: 'listCategories',component: ListCategoriesComponent },
  { path: 'listProducts',component: ListProductsComponent }
  // { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    CategoriesComponent,
    ProductsComponent,
    CustomersComponent,
    SalesComponent,
    OrdersComponent,
    LoginComponent,
    HomeComponent,
    UsersComponent,
    InventoryComponent,
    SettingsComponent,
    CashComponent,
    AddProductComponent,
    AddCategoryComponent,
    ListCategoriesComponent,
    ListProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
    // other imports here
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
