import { Component } from '@angular/core';

@Component({
  selector: 'app-thirdcomp',
  imports: [],
  template: `<div class="container text-center mt-5">
      <h1 class="text-primary">Welcome to Angular </h1>
      <p class="lead">This is rendered using <strong>inline template</strong>.</p>
      <button class="btn btn-danger">Click Me</button>
    </div>
`,
  styleUrl: './thirdcomp.component.css'
})
export class ThirdcompComponent {

}
