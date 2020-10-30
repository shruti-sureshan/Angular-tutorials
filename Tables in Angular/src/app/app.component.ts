import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  headers = ["ID", "Name", "Age", "Gender"];

  rows = [
    {
      "ID" : "1",
      "Name" : "ABC",
      "Age" : "21",
      "Gender" : "Male"
    },
    {
      "ID" : "2",
      "Name" : "XYZ",
      "Age" : "25",
      "Gender" : "Male"
    },
    {
      "ID" : "3",
      "Name" : "Raj",
      "Age" : "31",
      "Gender" : "Male"
    },
    {
      "ID" : "4",
      "Name" : "Riya",
      "Age" : "20",
      "Gender" : "Female"
    },
   ]

}