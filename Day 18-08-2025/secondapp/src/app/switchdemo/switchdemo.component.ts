// EX-13
import { Component } from '@angular/core';

@Component({
  selector: 'app-switchdemo',
  standalone: true,
  imports: [],
  templateUrl: './switchdemo.component.html',
  styleUrl: './switchdemo.component.css'
})
export class SwitchdemoComponent {
  colors = ["red", "yellow", "pink"];
  selectedColor = "";

  onColorChange(event: any) {
        this.selectedColor = event.target.value;   

  }

}
