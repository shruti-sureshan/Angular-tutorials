import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'calculator';
  first: string;
  second: string;
result1:number;
result2:number;
result3:number;
result4:number;

  Add(){
   this.result1= parseInt(this.first)+parseInt(this.second);
  }

  Sub(){
    this.result2= parseInt(this.first)-parseInt(this.second);
   }

   Mul(){
    this.result3= parseInt(this.first)*parseInt(this.second);
   }

   Div(){
    this.result4= parseInt(this.first)/parseInt(this.second);
   }
}
