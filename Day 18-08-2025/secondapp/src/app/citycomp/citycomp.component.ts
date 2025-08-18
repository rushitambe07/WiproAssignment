 // EX-12

import { Component } from '@angular/core';

@Component({
  selector: 'app-citycomp',
  imports: [],
  standalone:true,
  templateUrl: './citycomp.component.html',
  styleUrl: './citycomp.component.css'
})
export class CitycompComponent {
  countries: string[] = ["India", "America", "China", "England", "Japan"];
  dropdownCountries: string[] = [];   

  loadCountries() {
    this.dropdownCountries = this.countries;
  }

}
