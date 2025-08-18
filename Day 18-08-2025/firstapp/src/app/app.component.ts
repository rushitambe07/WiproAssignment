import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Secondcomp } from './secondcomp/secondcomp.component'; 
import { LoginComponent } from './login/login.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, Secondcomp, LoginComponent],   
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']              
})
export class AppComponent {
  //Ex-7
  message: string = "Hello Angular! Welcome to Ex7 🚀";
  title = 'firstapp';


  //Ex-09
  // userInput: string = "";   

  // printData() {
  //   console.log("User entered:", this.userInput);
}
