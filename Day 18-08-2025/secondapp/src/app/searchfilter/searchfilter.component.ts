import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';  

@Component({
  selector: 'app-searchfilter',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './searchfilter.component.html',
  styleUrl: './searchfilter.component.css'
})
export class SearchfilterComponent {
  search: string = '';

  names: string[] = [
    'Jayanta',
    'Jayaram',
    'Ramesh',
    'Suresh',
    'Rajesh',
    'Arjun',
    'Anjali',
    'Vijay'
  ];

  filteredNames: string[] = [...this.names];

  onSearchChange(event: Event) {
    const input = event.target as HTMLInputElement;  
    this.search = input.value;
    this.filteredNames = this.names.filter(name =>
      name.toLowerCase().includes(this.search.toLowerCase())
    );
  }
}
