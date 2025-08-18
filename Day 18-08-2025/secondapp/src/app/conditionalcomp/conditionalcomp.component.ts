// EX-11
import { Component } from '@angular/core';

@Component({
  selector: 'app-conditionalcomp',
  standalone: true,
  templateUrl: './conditionalcomp.component.html',
  styleUrls: ['./conditionalcomp.component.css']
})
export class ConditionalcompComponent {
  showMessage = false;

  toggle(event: any) {
    this.showMessage = event.target.checked;
  }
}
