import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
// import { AppComponent } from './app/app.component';

//import { Secondcomp } from './app/secondcomp/secondcomp.component';  
import { LoginComponent } from './app/login/login.component';
import { ThirdcompComponent } from './app/thirdcomp/thirdcomp.component';


bootstrapApplication(ThirdcompComponent, appConfig)
  .catch((err) => console.error(err));
