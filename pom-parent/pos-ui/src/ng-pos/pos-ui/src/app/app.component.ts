import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';
import { Router } from '@angular/router';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pos-ui';
  public ngOnInit()
  {
    var sidebarClick = 0;
    $(document).ready(function(){
			$(".hamburger").click(function(){

        debugger
        sidebarClick++;
         $(".sidebar").toggle();
         var display = $(".sidebar").css("display");
         if(sidebarClick%2==1){
          $(".main_container").css("width","100%");
          $(".main_container").css("margin-left","0%");
         }
         else{
          $(".main_container").css("width","calc(100% - 200px)");
          $(".main_container").css("margin-left","200px");
         }
         
			});
		});
  }
  constructor(private router: Router) { }

  redirect() {
    this.router.navigate(['login']);
  }



}



