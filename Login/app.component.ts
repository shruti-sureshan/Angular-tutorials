import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'login';
  email: string;
  password: string;
constructor(){

}
ngOnInit(){
  
}
  loginuser(){
    if(this.email=="admin@gmail.com" && this.password=="12345"){
      console.log("welcome")
    }
    else{
      console.log("unauthorized user")
    }
  }
}
